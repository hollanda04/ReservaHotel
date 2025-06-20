package view.Gerenciamento;

import model.Cliente; // <-- Adicione esta linha
import dao.clienteDAO; // <-- E esta linha (verifique se o pacote 'dao' está correto)
import JDBC.ConnectionFactory;
import controller.clienteDAO;
import model.Cliente;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TeladeClientes extends javax.swing.JFrame {

    // NÃO crie a conexão aqui. A conexão deve ser criada e fechada para cada operação.

    public TeladeClientes() {
        initComponents();
    }

    // Código do initComponents e outros componentes... (mantido como o seu original)
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        SecondPanel = new javax.swing.JPanel();
        lblNomeCompleto = new javax.swing.JLabel();
        lblCPF = new javax.swing.JLabel();
        lblTelefone = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        campotxtFNomeCompleto = new javax.swing.JFormattedTextField();
        campotxtFCPF = new javax.swing.JFormattedTextField();
        campotxtFTelefone = new javax.swing.JFormattedTextField();
        campotxtFEmail = new javax.swing.JFormattedTextField();
        btnCadastro = new javax.swing.JButton();
        btnGerenciarCliente = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        lblCadCliente = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaDeclientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TelaClientes");

        MainPanel.setBackground(new java.awt.Color(73, 77, 112));

        SecondPanel.setBackground(new java.awt.Color(239, 242, 255));

        lblNomeCompleto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNomeCompleto.setText("Nome completo:");

        lblCPF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCPF.setText("CPF:");

        lblTelefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblTelefone.setText("Telefone/Celular:");

        lblEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblEmail.setText("E-mail:");

        javax.swing.GroupLayout SecondPanelLayout = new javax.swing.GroupLayout(SecondPanel);
        SecondPanel.setLayout(SecondPanelLayout);
        SecondPanelLayout.setHorizontalGroup(
            SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondPanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SecondPanelLayout.createSequentialGroup()
                        .addGroup(SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(SecondPanelLayout.createSequentialGroup()
                                .addComponent(lblTelefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campotxtFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(SecondPanelLayout.createSequentialGroup()
                                .addComponent(lblEmail)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campotxtFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SecondPanelLayout.createSequentialGroup()
                                .addComponent(lblCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campotxtFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(SecondPanelLayout.createSequentialGroup()
                        .addComponent(lblNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campotxtFNomeCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)))
                .addContainerGap())
        );
        SecondPanelLayout.setVerticalGroup(
            SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SecondPanelLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeCompleto)
                    .addComponent(campotxtFNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCPF)
                    .addComponent(campotxtFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefone)
                    .addComponent(campotxtFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(SecondPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmail)
                    .addComponent(campotxtFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(390, Short.MAX_VALUE))
        );

        btnCadastro.setBackground(new java.awt.Color(181, 214, 170));
        btnCadastro.setText("Cadastrar");
        btnCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroActionPerformed(evt);
            }
        });

        btnGerenciarCliente.setBackground(new java.awt.Color(180, 186, 239));
        btnGerenciarCliente.setText("Gerenciar Clientes");
        btnGerenciarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciarClienteActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnVoltar.setBackground(new java.awt.Color(204, 204, 204));
        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        lblCadCliente.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCadCliente.setText("Cadastrar Clientes");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SecondPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(151, 151, 151))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGerenciarCliente)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblCadCliente)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblCadCliente)
                .addGap(27, 27, 27)
                .addComponent(SecondPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGerenciarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        ListaDeclientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(ListaDeclientes);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    /**
     * MÉTODO CORRIGIDO PARA O BOTÃO DE CADASTRO.
     * Este é o coração da correção.
     */
    private void btnCadastroActionPerformed(java.awt.event.ActionEvent evt) {
        // 1. Coleta os dados dos campos da tela
        String nome = campotxtFNomeCompleto.getText();
        String email = campotxtFEmail.getText();
        String telefone = campotxtFTelefone.getText();
        String cpf = campotxtFCPF.getText();

        // 2. Cria um objeto "Cliente" com esses dados
        Cliente clienteParaRegistrar = new Cliente(cpf, email, nome, telefone);
        
        // 3. Usa o "try-with-resources" para abrir a conexão e fechá-la automaticamente.
        try (Connection conexao = ConnectionFactory.getConnection()) {
            
            // 4. Cria o DAO, passando a conexão que acabamos de abrir
            clienteDAO dao = new clienteDAO(conexao);
            
            // 5. Pede ao DAO para inserir o cliente e recebe a mensagem de resultado
            String resultado = dao.inserirCliente(clienteParaRegistrar);
            
            // 6. Mostra o resultado para o usuário
            JOptionPane.showMessageDialog(this, resultado);
            
            // Se a inserção foi bem sucedida, limpa os campos
            if (resultado.contains("sucesso")) {
                limparCampo();
            }

        } catch (SQLException e) {
            // 7. Se o try não conseguir obter a conexão, o erro será capturado aqui.
            JOptionPane.showMessageDialog(this, 
                "Erro de conexão com o banco de dados: \n" + e.getMessage(), 
                "Erro", 
                JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Mostra o erro detalhado no console para o desenvolvedor.
        }
    }

    private void btnGerenciarClienteActionPerformed(java.awt.event.ActionEvent evt) {
   
    try {
        // 1. Cria a instância da tela que você quer abrir
        TeladeGerenciarClientes telaGerenciarClient = new TeladeGerenciarClientes();

        // 2. Define a posição da janela (centralizada) ANTES de exibi-la
        telaGerenciarClient.setLocationRelativeTo(null);

        // 3. Torna a janela visível para o usuário
        telaGerenciarClient.setVisible(true);

    } catch (Exception e) {
        // --- Plano B: Executado se QUALQUER erro ocorrer no bloco 'try' ---

        // Mostra uma mensagem de erro clara para o usuário final
        JOptionPane.showMessageDialog(
            this, // Janela pai para o diálogo
            "Falha ao abrir o gerenciamento de clientes.\nVerifique a conexão com o banco de dados e tente novamente.",
            "Erro Crítico", // Título da janela de erro
            JOptionPane.ERROR_MESSAGE // Ícone de erro
        );

        // Imprime o erro técnico completo no console para você, o desenvolvedor, depurar
        System.err.println("Erro ao tentar abrir a TeladeGerenciarClientes:");
        e.printStackTrace();
    }
    // --- Fim do bloco de segurança ---
}
    

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {
        limparCampo();
    }

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
    }
    
    private void limparCampo() {
        campotxtFNomeCompleto.setText("");
        campotxtFCPF.setText("");
        campotxtFEmail.setText("");
        campotxtFTelefone.setText("");
    }
    
    // ... (Resto do código gerado, como getters, setters, main, e declaração de variáveis)
    // Variables declaration - do not modify                     
    private javax.swing.JTable ListaDeclientes;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel SecondPanel;
    private javax.swing.JButton btnCadastro;
    private javax.swing.JButton btnGerenciarCliente;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JFormattedTextField campotxtFCPF;
    private javax.swing.JFormattedTextField campotxtFEmail;
    private javax.swing.JFormattedTextField campotxtFNomeCompleto;
    private javax.swing.JFormattedTextField campotxtFTelefone;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblCadCliente;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNomeCompleto;
    private javax.swing.JLabel lblTelefone;
    // End of variables declaration                   
}