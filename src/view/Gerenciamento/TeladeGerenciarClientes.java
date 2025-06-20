
package view.Gerenciamento;

import JDBC.ConnectionFactory;
import controller.clienteDAO;
import model.Cliente;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thiago inacio
 */
public class TeladeGerenciarClientes extends javax.swing.JFrame {

    
    
    
    
    
    public TeladeGerenciarClientes() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabela = new javax.swing.JTable();
        lblNomeCompleto = new javax.swing.JLabel();
        campotxtFNomeCompleto = new javax.swing.JFormattedTextField();
        lblCPF = new javax.swing.JLabel();
        campotxtFCPF = new javax.swing.JFormattedTextField();
        lblTelefone = new javax.swing.JLabel();
        campotxtFTelefone = new javax.swing.JFormattedTextField();
        lblEmail = new javax.swing.JLabel();
        campotxtFEmail = new javax.swing.JFormattedTextField();
        btnAtualizarCadas = new javax.swing.JButton();
        btnExcluirCadastr = new javax.swing.JButton();
        btnBuscaID = new javax.swing.JButton();
        campotxtFBuscaID = new javax.swing.JFormattedTextField();
        lblNomeCompleto1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(500, 500));
        setPreferredSize(new java.awt.Dimension(700, 700));

        Tabela.setBackground(new java.awt.Color(204, 204, 204));
        Tabela.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Telefone", "E-mail"
            }
        ));
        jScrollPane1.setViewportView(Tabela);

        lblNomeCompleto.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNomeCompleto.setText("Nome completo:");

        campotxtFNomeCompleto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campotxtFNomeCompletoActionPerformed(evt);
            }
        });

        lblCPF.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblCPF.setText("CPF:");

        campotxtFCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campotxtFCPFActionPerformed(evt);
            }
        });

        lblTelefone.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblTelefone.setText("Telefone/Celular:");

        campotxtFTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campotxtFTelefoneActionPerformed(evt);
            }
        });

        lblEmail.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblEmail.setText("E-mail:");

        btnAtualizarCadas.setBackground(new java.awt.Color(179, 218, 201));
        btnAtualizarCadas.setText("Atualizar Cadastro");
        btnAtualizarCadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarCadasActionPerformed(evt);
            }
        });

        btnExcluirCadastr.setBackground(new java.awt.Color(239, 151, 151));
        btnExcluirCadastr.setText("Excluir Cadastro");
        btnExcluirCadastr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirCadastrActionPerformed(evt);
            }
        });

        btnBuscaID.setText("Buscar Por ID");
        btnBuscaID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaIDActionPerformed(evt);
            }
        });

        campotxtFBuscaID.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        lblNomeCompleto1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblNomeCompleto1.setText("ID:");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Gerenciar Clientes:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCPF)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(campotxtFCPF))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblEmail)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campotxtFEmail))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lblTelefone)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(campotxtFTelefone)))
                                .addGap(12, 12, 12))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campotxtFNomeCompleto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnAtualizarCadas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnExcluirCadastr, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscaID, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeCompleto1, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campotxtFBuscaID, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNomeCompleto)
                            .addComponent(campotxtFNomeCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCPF)
                            .addComponent(campotxtFCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTelefone)
                            .addComponent(campotxtFTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmail)
                            .addComponent(campotxtFEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAtualizarCadas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcluirCadastr, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscaID, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNomeCompleto1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campotxtFBuscaID, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campotxtFNomeCompletoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campotxtFNomeCompletoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campotxtFNomeCompletoActionPerformed

    private void campotxtFCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campotxtFCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campotxtFCPFActionPerformed

    private void campotxtFTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campotxtFTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campotxtFTelefoneActionPerformed

    private void btnExcluirCadastrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirCadastrActionPerformed
      apagarCliente();
      limparCampos();
      atualizarTabelaClientes();
    }//GEN-LAST:event_btnExcluirCadastrActionPerformed

    private void btnBuscaIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaIDActionPerformed
       int idCliente = Integer.parseInt(campotxtFBuscaID.getText());
    try (Connection conexao = ConnectionFactory.getConnection()) {
        clienteDAO clienteDAO = new clienteDAO(conexao);
        Cliente cliente = clienteDAO.buscarPorId(idCliente);
        if (cliente != null) {
            campotxtFNomeCompleto.setText(cliente.getNome());
            campotxtFCPF.setText(cliente.getCpf());
            campotxtFTelefone.setText(cliente.getTelefone());
            campotxtFEmail.setText(cliente.getEmail());
            atualizarTabelaClientes();
        } else {
            JOptionPane.showMessageDialog(this, "Cliente não encontrado!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Erro de conexão com o banco de dados: \n" + e.getMessage(),
                "Erro", JOptionPane.ERROR_MESSAGE);
        e.printStackTrace();
    }
    }//GEN-LAST:event_btnBuscaIDActionPerformed

    private void btnAtualizarCadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarCadasActionPerformed
        try {
            int id = Integer.parseInt(campotxtFBuscaID.getText());
            String nome = campotxtFNomeCompleto.getText();
            String cpf = campotxtFCPF.getText();
            String telefone = campotxtFTelefone.getText();
            String email = campotxtFEmail.getText();

            Cliente cliente = new Cliente(cpf, email, nome, telefone);
            cliente.setId(id); // Definindo o ID do cliente, se necessário
            // ou conforme seu construtor: new Cliente(id, nome, cpf, telefone, email)

            try (Connection conexao = ConnectionFactory.getConnection()) {
                clienteDAO clienteDAO = new clienteDAO(conexao);
                String resultado = clienteDAO.atualizarCliente(cliente);
                atualizarTabelaClientes();
                limparCampos();
                // Exibe o resultado da atualização
                JOptionPane.showMessageDialog(null, resultado);
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "ID inválido.");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar cliente: " + ex.getMessage());
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btnAtualizarCadasActionPerformed

   
  private void atualizarTabelaClientes() {
    try (Connection conexao = ConnectionFactory.getConnection()) {
        clienteDAO dao = new clienteDAO(conexao);
        List<Cliente> lista = dao.listarTodos();

        DefaultTableModel modelo = (DefaultTableModel) Tabela.getModel();
        modelo.setRowCount(0); // limpa a tabela

        for (Cliente cliente : lista) {
            modelo.addRow(new Object[]{
                cliente.getId(),
                cliente.getNome(),
                cliente.getCpf(),
                cliente.getTelefone(),
                cliente.getEmail()
            });
        }
    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Erro ao atualizar tabela: " + e.getMessage());
    }
}


    private void apagarCliente(){
        int idCliente = Integer.parseInt(campotxtFBuscaID.getText());
     try (Connection conexao = ConnectionFactory.getConnection()) {
            
            // 4. Cria o DAO, passando a conexão que acabamos de abrir
            clienteDAO dao = new clienteDAO(conexao);
            
            // 5. Pede ao DAO para inserir o cliente e recebe a mensagem de resultado
           dao.excluirClientePorId(idCliente);
            
            // 6. Mostra o resultado para o usuário
            JOptionPane.showMessageDialog(this, "Removido com sucesso!");
            
          

        } catch (SQLException e) {
            // 7. Se o try não conseguir obter a conexão, o erro será capturado aqui.
            JOptionPane.showMessageDialog(this, 
                "Erro de conexão com o banco de dados: \n" + e.getMessage(), 
                "Erro", 
                JOptionPane.ERROR_MESSAGE);
            e.printStackTrace(); // Mostra o erro detalhado no console para o desenvolvedor.
        }
    }
    
    
    private void limparCampos(){
        campotxtFBuscaID.setText("");
        campotxtFCPF.setText("");
        campotxtFEmail.setText("");
        campotxtFNomeCompleto.setText("");
        campotxtFTelefone.setText("");

    }
    
    
    
    
    
    
    public JTable getTabela() {
        return Tabela;
    }

    public void setTabela(JTable Tabela) {
        this.Tabela = Tabela;
    }

    public JButton getBtnAtualizarCadas() {
        return btnAtualizarCadas;
    }

    public void setBtnAtualizarCadas(JButton btnAtualizarCadas) {
        this.btnAtualizarCadas = btnAtualizarCadas;
    }

    public JButton getBtnBuscaID() {
        return btnBuscaID;
    }

    public void setBtnBuscaID(JButton btnBuscaID) {
        this.btnBuscaID = btnBuscaID;
    }

    public JButton getBtnExcluirCadastr() {
        return btnExcluirCadastr;
    }

    public void setBtnExcluirCadastr(JButton btnExcluirCadastr) {
        this.btnExcluirCadastr = btnExcluirCadastr;
    }

    public JFormattedTextField getCampotxtFBuscaID() {
        return campotxtFBuscaID;
    }

    public void setCampotxtFBuscaID(JFormattedTextField campotxtFBuscaID) {
        this.campotxtFBuscaID = campotxtFBuscaID;
    }

    public JFormattedTextField getCampotxtFCPF() {
        return campotxtFCPF;
    }

    public void setCampotxtFCPF(JFormattedTextField campotxtFCPF) {
        this.campotxtFCPF = campotxtFCPF;
    }

    public JFormattedTextField getCampotxtFEmail() {
        return campotxtFEmail;
    }

    public void setCampotxtFEmail(JFormattedTextField campotxtFEmail) {
        this.campotxtFEmail = campotxtFEmail;
    }

    public JFormattedTextField getCampotxtFNomeCompleto() {
        return campotxtFNomeCompleto;
    }

    public void setCampotxtFNomeCompleto(JFormattedTextField campotxtFNomeCompleto) {
        this.campotxtFNomeCompleto = campotxtFNomeCompleto;
    }

    public JFormattedTextField getCampotxtFTelefone() {
        return campotxtFTelefone;
    }

    public void setCampotxtFTelefone(JFormattedTextField campotxtFTelefone) {
        this.campotxtFTelefone = campotxtFTelefone;
    }

    
    
    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeladeGerenciarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeladeGerenciarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeladeGerenciarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeladeGerenciarClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeladeGerenciarClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabela;
    private javax.swing.JButton btnAtualizarCadas;
    private javax.swing.JButton btnBuscaID;
    private javax.swing.JButton btnExcluirCadastr;
    private javax.swing.JFormattedTextField campotxtFBuscaID;
    private javax.swing.JFormattedTextField campotxtFCPF;
    private javax.swing.JFormattedTextField campotxtFEmail;
    private javax.swing.JFormattedTextField campotxtFNomeCompleto;
    private javax.swing.JFormattedTextField campotxtFTelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCPF;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblNomeCompleto;
    private javax.swing.JLabel lblNomeCompleto1;
    private javax.swing.JLabel lblTelefone;
    // End of variables declaration//GEN-END:variables
}
