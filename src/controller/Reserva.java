package controller;

import JDBC.ConnectionFactory;
import java.sql.Connection;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import model.Cliente;
import model.Quartos;
import model.Reservas;

public class Reserva {
    static Scanner unppr = new Scanner(System.in);
    static double totalFaturado = 0.0;
    static Connection conn;
    static clienteDAO clienteDao;
    static quartosDAO quartoDao;
    static reservasDAO reservaDao;

    public static void main(String[] args) {
        try {
            conn = ConnectionFactory.getConnection(); 
            clienteDao = new clienteDAO(conn);       
            quartoDao = new quartosDAO(conn);
            reservaDao = new reservasDAO(conn);
        } catch (Exception e) {
            System.out.println("Erro ao conectar ao banco de dados: " + e.getMessage());
            return;
        }


        int opcao;

        do {
            System.out.println("\n---Menu UNP Paradise Resorts---");
            System.out.println("1. Fazer Reserva");
            System.out.println("2. Ver reservas realizadas");
            System.out.println("3. Gerenciar Quartos");
            System.out.println("4. Gerenciar Clientes");
            System.out.println("5. Fazer check-in ou check-out");
            System.out.println("6. Realizar Pagamento");
            System.out.println("7. Relatório Financeiro");
            System.out.println("0. Sair");

            opcao = unppr.nextInt();
            unppr.nextLine();

            switch (opcao) {
                case 1 -> reservarQuarto();
                case 2 -> verReservas();
                case 3 -> gerenciarQuartos();
                case 4 -> cadastrarClientes();
                case 5 -> checkinOuCheckout();
                case 6 -> realizarPagamento();
                case 7 -> relatorioFinanceiro();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção Inválida");
            }

        } while (opcao != 0);
    }

    static void reservarQuarto() {
        System.out.println("Digite o CPF do cliente:");
        String cpf = unppr.nextLine();
        Cliente cliente = clienteDao.buscarPorCpf(cpf);

        if (cliente == null) {
            System.out.println("Cliente não encontrado!");
            return;
        }

        System.out.println("Localizado: " + cliente.getNome());
        System.out.println("Digite o número do quarto:");
        int numQuarto = Integer.parseInt(unppr.nextLine());
        Quartos quarto = quartoDao.buscarPorNumero(numQuarto);

        if (quarto == null) {
            System.out.println("Quarto não encontrado.");
            return;
        }

        if (quarto.isOcupado()) {
            System.out.println("Quarto já ocupado");
            return;
        }


    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Digite a data de check-in (dd/MM/yyyy):");
        LocalDate dataCheckIn = LocalDate.parse(unppr.nextLine(), formatter);

        System.out.println("Digite a data de check-out (dd/MM/yyyy):");
        LocalDate dataCheckOut = LocalDate.parse(unppr.nextLine(), formatter);

    if (dataCheckOut.isBefore(dataCheckIn)) {
        System.out.println("Data de check-out não pode ser anterior à de check-in.");
        return;
    }

    double valorTotal = quarto.getValorDiaria() * ChronoUnit.DAYS.between(dataCheckIn, dataCheckOut);

    Reservas reserva = new Reservas(cliente, quarto, dataCheckIn, dataCheckOut, valorTotal);

    reservaDao.inserirReservas(reserva);

    quarto.setOcupado(true);
    quartoDao.atualizarStatusOcupado(quarto);

    System.out.println("Reserva realizada com sucesso!");
}
    static void verReservas() {
        var lista = reservaDao.listarReservasCompletas();
        if (lista.isEmpty()) {
            System.out.println("Nenhuma reserva feita até o momento");
            return;
        }

        System.out.println("Reservas cadastradas:");
        for (var r : lista) {
            System.out.println("Cliente: " + r.getNomeCliente() +
                    " | CPF: " + r.getCpfCliente() +
                    " | Quarto: " + r.getNumeroQuarto() +
                    " | Período: " + (r.getDataCheckIn() + " à " + r.getDataCheckOut()) +
                    " | Total estimado: R$ " + r.getValorTotal());
        }
    }

    static void cadastrarClientes() {
        System.out.println("Nome Completo:");
        String nome = unppr.nextLine();

        System.out.println("CPF:");
        String cpf = unppr.nextLine();

        System.out.println("Telefone:");
        String telefone = unppr.nextLine();

        System.out.println("Email:");
        String email = unppr.nextLine();

        Cliente cliente = new Cliente(cpf, email, nome, telefone);
        clienteDao.inserirCliente(cliente);
        System.out.println("Cadastro Concluído!");
    }

    static void gerenciarQuartos() {
        System.out.println("Número do quarto:");
        int numero = unppr.nextInt();
        unppr.nextLine();

        System.out.println("Tipo de Quarto:");
        String tipoQuarto = unppr.nextLine();

        System.out.println("Valor da diária:");
        System.out.print("R$ ");
        double diaria = unppr.nextDouble();

        Quartos quarto = new Quartos(numero, tipoQuarto, diaria);
        quartoDao.inserirQuartos(quarto);
        System.out.println("Cadastro Concluído!");
    }

    static void checkinOuCheckout() {
        System.out.print("Digite o CPF do cliente: ");
        String cpf = unppr.nextLine();
        Reservas reserva = reservaDao.buscarReservaPorCpf(cpf);

        if (reserva != null) {
            reservaDao.removerReserva(reserva);
            Quartos quarto = quartoDao.buscarPorNumero(reserva.getNumeroQuarto());
            quarto.setOcupado(false);
            quartoDao.atualizarStatusOcupado(quarto);
            System.out.println("Check-out realizado com sucesso");
        } else {
            System.out.println("Nenhuma reserva ativa encontrada para este CPF.");
        }
    }

    static void realizarPagamento() {
        System.out.print("Digite o CPF do cliente para realizar o pagamento: ");
        String cpf = unppr.nextLine();

        Reservas reserva = reservaDao.buscarReservaPorCpf(cpf);
        if (reserva == null) {
            System.out.println("Nenhuma reserva encontrada para este CPF.");
            return;
        }

        Quartos quarto = quartoDao.buscarPorNumero(reserva.getNumeroQuarto());
        Cliente cliente = clienteDao.buscarPorCpf(cpf);
        double total = reserva.getValorTotal();

        System.out.printf("Cliente: %s\n", cliente.getNome());
        System.out.printf("Quarto: %d | Diária: R$ %.2f | Dias: %d\n",
                quarto.getNumero(), quarto.getValorDiaria(), reserva.getDataCheckIn(), reserva.getDataCheckOut());
        System.out.printf("Total a pagar: R$ %.2f\n", total);

        System.out.print("Deseja confirmar o pagamento e encerrar a reserva? (S/N): ");
        String confirmacao = unppr.nextLine();

        if (confirmacao.equalsIgnoreCase("S")) {
            quarto.setOcupado(false);
            quartoDao.atualizarStatusOcupado(quarto);
            reservaDao.removerReserva(reserva);
            totalFaturado += total;

            System.out.println("\n--- COMPROVANTE DE PAGAMENTO ---");
            System.out.println("Cliente: " + cliente.getNome());
            System.out.println("CPF: " + cliente.getCpf());
            System.out.println("Quarto: " + quarto.getNumero());
            System.out.println("Dias: " + reserva.getDataCheckIn() + " à " + reserva.getDataCheckOut());
            System.out.printf("Total pago: R$ %.2f\n", total);
            System.out.println("Reserva encerrada. Obrigado pela preferência!");
        } else {
            System.out.println("Pagamento cancelado.");
        }
    }

    static void relatorioFinanceiro() {
        System.out.println("--- RELATÓRIO FINANCEIRO ---");
        System.out.printf("Total arrecadado em pagamentos: R$ %.2f\n", totalFaturado);
        int totalAtivas = reservaDao.listarReservasCompletas().size();
        System.out.println("Reservas ativas: " + totalAtivas);
    }
}
