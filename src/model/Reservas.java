package model;

import java.time.LocalDate;

public class Reservas {
    
    private Cliente cliente;
    private Quartos quarto;
    private LocalDate dataCheckIn;
    private LocalDate dataCheckOut;
    private double valorTotal;

    public Reservas(Cliente cliente, Quartos quarto, LocalDate dataCheckIn, LocalDate dataCheckOut, double valorTotal) {
        this.dataCheckIn = dataCheckIn;
        this.dataCheckOut = dataCheckOut;
        this.valorTotal = valorTotal;
        this.cliente = cliente;
        this.quarto = quarto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Quartos getQuarto() {
        return quarto;
    }

    public void setQuarto(Quartos quarto) {
        this.quarto = quarto;
    }

    public LocalDate getDataCheckIn() {
        return dataCheckIn;
    }

    public void setDataCheckIn(LocalDate dataCheckIn) {
        this.dataCheckIn = dataCheckIn;
    }

    public LocalDate getDataCheckOut() {
        return dataCheckOut;
    }

    public void setDataCheckOut(LocalDate dataCheckOut) {
        this.dataCheckOut = dataCheckOut;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }   

 

    public String getNomeCliente() {
        return cliente.getNome();
    }

    public String getCpfCliente() {
        return cliente.getCpf();
    }

    public int getNumeroQuarto() {
        return quarto.getNumero();
    }
}
