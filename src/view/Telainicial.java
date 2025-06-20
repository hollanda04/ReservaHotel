
package view;
import view.Cadastro.TeladeReserva;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import view.Cadastro.AbaSobreDialog;
import view.Cadastro.TelaLogindeFuncionário;
import view.Cadastro.TelaRegistrarQuartos;
import view.Gerenciamento.TelaDePagamentos;
import view.Gerenciamento.TeladeClientes;
//Imports necessarios que eu trouxe conforme solicitado pelo proprio netbeans
public class Telainicial extends javax.swing.JFrame {

    
    
    public Telainicial() {
      
        initComponents();


// Criando interacao inicial dos botoes da tela inicial, com a borda azul usando mouse listener

LineBorder bordaNormal = new LineBorder(Color.GRAY, 2);    // Normal
LineBorder bordaHover = new LineBorder(Color.BLUE, 2);     // Hover
LineBorder bordaPressed = new LineBorder(Color.BLUE.darker(), 2); // Pressionado

// Botão de Registro de clientes
btnCadastrarCliente.setBorder(bordaNormal);
btnCadastrarCliente.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e) {
        btnCadastrarCliente.setBorder(bordaHover);
    }
    @Override
    public void mouseExited(MouseEvent e) {
        btnCadastrarCliente.setBorder(bordaNormal);
    }
    @Override
    public void mousePressed(MouseEvent e) {
        btnCadastrarCliente.setBorder(bordaPressed);
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        btnCadastrarCliente.setBorder(bordaHover);
    }
});

// Botão adicionar quartos
btnCadastrarReserva.setBorder(bordaNormal);
btnCadastrarReserva.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e) {
        btnCadastrarReserva.setBorder(bordaHover);
    }
    @Override
    public void mouseExited(MouseEvent e) {
        btnCadastrarReserva.setBorder(bordaNormal);
    }
    @Override
    public void mousePressed(MouseEvent e) {
        btnCadastrarReserva.setBorder(bordaPressed);
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        btnCadastrarReserva.setBorder(bordaHover);
    }
});

// Botão Gerenciar reservas
btnCadastrarQuartos.setBorder(bordaNormal);
btnCadastrarQuartos.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e) {
        btnCadastrarQuartos.setBorder(bordaHover);
    }
    @Override
    public void mouseExited(MouseEvent e) {
        btnCadastrarQuartos.setBorder(bordaNormal);
    }
    @Override
    public void mousePressed(MouseEvent e) {
        btnCadastrarQuartos.setBorder(bordaPressed);
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        btnCadastrarQuartos.setBorder(bordaHover);
    }
});

btnCadastrarFuncionario.setBorder(bordaNormal);
btnCadastrarFuncionario.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e) {
        btnCadastrarFuncionario.setBorder(bordaHover);
    }
    @Override
    public void mouseExited(MouseEvent e) {
        btnCadastrarFuncionario.setBorder(bordaNormal);
    }
    @Override
    public void mousePressed(MouseEvent e) {
        btnCadastrarFuncionario.setBorder(bordaPressed);
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        btnCadastrarFuncionario.setBorder(bordaHover);
    }
});
        
btnGerenciarPagamento.setBorder(bordaNormal); 
btnGerenciarPagamento.addMouseListener(new MouseAdapter() {
    @Override
    public void mouseEntered(MouseEvent e) {
        btnGerenciarPagamento.setBorder(bordaHover);
    }
    @Override
    public void mouseExited(MouseEvent e) {
        btnGerenciarPagamento.setBorder(bordaNormal);
    }
    @Override
    public void mousePressed(MouseEvent e) {
        btnGerenciarPagamento.setBorder(bordaPressed);
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        btnGerenciarPagamento.setBorder(bordaHover);
    }
});


    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Navbar = new javax.swing.JPanel();
        btnCadastrarCliente = new javax.swing.JButton();
        btnCadastrarReserva = new javax.swing.JButton();
        btnCadastrarQuartos = new javax.swing.JButton();
        btnCadastrarFuncionario = new javax.swing.JButton();
        btnGerenciarPagamento = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        Toolbar = new javax.swing.JPanel();
        lblINTERATIVOsair = new javax.swing.JLabel();
        lblINTERATIVOSobre = new javax.swing.JLabel();
        ImagemUNPresort = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HotelariaTelaInicial");

        Navbar.setBackground(new java.awt.Color(83, 86, 112));

        btnCadastrarCliente.setBackground(new java.awt.Color(0, 0, 0));
        btnCadastrarCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCadastrarCliente.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/NotepadRGBicon.png"))); // NOI18N
        btnCadastrarCliente.setText("Cadastrar Cliente");
        btnCadastrarCliente.setActionCommand("");
        btnCadastrarCliente.setBorder(null);
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });

        btnCadastrarReserva.setBackground(new java.awt.Color(0, 0, 0));
        btnCadastrarReserva.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCadastrarReserva.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/Icone notpadRelogios.png"))); // NOI18N
        btnCadastrarReserva.setText("Gerenciar Reserva");
        btnCadastrarReserva.setBorder(null);
        btnCadastrarReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarReservaActionPerformed(evt);
            }
        });

        btnCadastrarQuartos.setBackground(new java.awt.Color(0, 0, 0));
        btnCadastrarQuartos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCadastrarQuartos.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarQuartos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/QuartoRGBicon.png"))); // NOI18N
        btnCadastrarQuartos.setText("Gerenciar Quartos");
        btnCadastrarQuartos.setBorder(null);
        btnCadastrarQuartos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarQuartosActionPerformed(evt);
            }
        });

        btnCadastrarFuncionario.setBackground(new java.awt.Color(0, 0, 0));
        btnCadastrarFuncionario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnCadastrarFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/IconeLogin.png"))); // NOI18N
        btnCadastrarFuncionario.setText("Login Funcionário");
        btnCadastrarFuncionario.setActionCommand("");
        btnCadastrarFuncionario.setBorder(null);
        btnCadastrarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarFuncionarioActionPerformed(evt);
            }
        });

        btnGerenciarPagamento.setBackground(new java.awt.Color(0, 0, 0));
        btnGerenciarPagamento.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        btnGerenciarPagamento.setForeground(new java.awt.Color(255, 255, 255));
        btnGerenciarPagamento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/iconepagamentos.png"))); // NOI18N
        btnGerenciarPagamento.setText("Gerenciar Pagamentos");
        btnGerenciarPagamento.setActionCommand("");
        btnGerenciarPagamento.setBorder(null);
        btnGerenciarPagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGerenciarPagamentoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout NavbarLayout = new javax.swing.GroupLayout(Navbar);
        Navbar.setLayout(NavbarLayout);
        NavbarLayout.setHorizontalGroup(
            NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavbarLayout.createSequentialGroup()
                .addGroup(NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCadastrarReserva, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addComponent(btnCadastrarQuartos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE)
                    .addComponent(btnGerenciarPagamento, javax.swing.GroupLayout.DEFAULT_SIZE, 315, Short.MAX_VALUE))
                .addGap(80, 80, 80))
        );
        NavbarLayout.setVerticalGroup(
            NavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NavbarLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(btnCadastrarQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnCadastrarReserva, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnCadastrarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnGerenciarPagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar1.setRollover(true);

        Toolbar.setBackground(new java.awt.Color(115, 125, 220));
        Toolbar.setForeground(new java.awt.Color(107, 107, 214));

        lblINTERATIVOsair.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblINTERATIVOsair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/Sair.png"))); // NOI18N
        lblINTERATIVOsair.setText("Sair");
        lblINTERATIVOsair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblINTERATIVOsair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblINTERATIVOsairMouseClicked(evt);
            }
        });

        lblINTERATIVOSobre.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lblINTERATIVOSobre.setText("Sobre");
        lblINTERATIVOSobre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblINTERATIVOSobreMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout ToolbarLayout = new javax.swing.GroupLayout(Toolbar);
        Toolbar.setLayout(ToolbarLayout);
        ToolbarLayout.setHorizontalGroup(
            ToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToolbarLayout.createSequentialGroup()
                .addContainerGap(806, Short.MAX_VALUE)
                .addComponent(lblINTERATIVOSobre, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(lblINTERATIVOsair)
                .addGap(37, 37, 37))
        );
        ToolbarLayout.setVerticalGroup(
            ToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ToolbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ToolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblINTERATIVOsair)
                    .addComponent(lblINTERATIVOSobre))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jToolBar1.add(Toolbar);

        ImagemUNPresort.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/Icones/UNPresort.jpg"))); // NOI18N
        ImagemUNPresort.setText("baby");
        ImagemUNPresort.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ImagemUNPresort, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ImagemUNPresort, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap(12, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//BOTOES NAVBAR
    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
 TeladeClientes telaClientes = new TeladeClientes();
    telaClientes.setVisible(true);
    telaClientes.setLocationRelativeTo(null); 
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    private void btnCadastrarReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarReservaActionPerformed
  TeladeReserva telaReserva = new TeladeReserva();
    telaReserva.setVisible(true);
    telaReserva.setLocationRelativeTo(null);       
    }//GEN-LAST:event_btnCadastrarReservaActionPerformed

    private void btnCadastrarQuartosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarQuartosActionPerformed
  TelaRegistrarQuartos telaQuartos = new TelaRegistrarQuartos();
    telaQuartos.setVisible(true);
    telaQuartos.setLocationRelativeTo(null);      
    }//GEN-LAST:event_btnCadastrarQuartosActionPerformed
     //BOTOES TOOLBAR
    
    private void lblINTERATIVOsairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblINTERATIVOsairMouseClicked
       this.dispose();
        
    }//GEN-LAST:event_lblINTERATIVOsairMouseClicked

    private void btnCadastrarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarFuncionarioActionPerformed
   TelaLogindeFuncionário telaFuncionario = new TelaLogindeFuncionário();
    telaFuncionario.setVisible(true);
    telaFuncionario.setLocationRelativeTo(null);     
    }//GEN-LAST:event_btnCadastrarFuncionarioActionPerformed

    private void lblINTERATIVOSobreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblINTERATIVOSobreMouseClicked
      AbaSobreDialog sobre = new
            AbaSobreDialog(this, true);
      sobre.setLocationRelativeTo(this);
      sobre.setVisible(true);
      
    }//GEN-LAST:event_lblINTERATIVOSobreMouseClicked

    private void btnGerenciarPagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGerenciarPagamentoActionPerformed
   TelaDePagamentos telaPagamentos = new TelaDePagamentos();
    telaPagamentos.setVisible(true);
    telaPagamentos.setLocationRelativeTo(null);     
    }//GEN-LAST:event_btnGerenciarPagamentoActionPerformed

    /**
     * @param args the command line arguments
     */
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
           
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Telainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Telainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Telainicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Telainicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagemUNPresort;
    private javax.swing.JPanel Navbar;
    private javax.swing.JPanel Toolbar;
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.JButton btnCadastrarFuncionario;
    private javax.swing.JButton btnCadastrarQuartos;
    private javax.swing.JButton btnCadastrarReserva;
    private javax.swing.JButton btnGerenciarPagamento;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lblINTERATIVOSobre;
    private javax.swing.JLabel lblINTERATIVOsair;
    // End of variables declaration//GEN-END:variables
}
