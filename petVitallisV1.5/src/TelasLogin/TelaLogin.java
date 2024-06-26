package TelasLogin;

import ClassesCadastro.CadFuncionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
    
public class TelaLogin extends javax.swing.JFrame {
   Connection conexao = null;
   PreparedStatement pst = null;
   ResultSet rs = null;
   CadFuncionario cadFuncionario = new CadFuncionario();
   private String cargo;
    
    public TelaLogin() {
        
        super("PetVitallis");
        initComponents();
        setResizable(false);
        this.setLocationRelativeTo(null);
        this.cargo = cargo;
        addEnterKeyListener();
        
         String caminhoImagem = "/icon/logo 100.png";
         // Carrega a imagem do ícone
        ImageIcon icon = new ImageIcon(getClass().getResource( caminhoImagem ));
        // Define o ícone da janela
        this.setIconImage(icon.getImage());
    }
    
    
    public void logar(){
    
             String query = "SELECT * FROM tb_cadfuncionario WHERE Cpf = ? and DataDeNascimento = ? and CargoFuncionario = ?";
            
             try {
                  pst = conexao.prepareStatement(query);
                  pst.setString(1,campoLogin.getText());
                  pst.setString(2,campoSenha.getText());
                 
                  rs = pst.executeQuery();
                  
                  if(rs.next()){
                      
               TelaMenu telaMenu = new TelaMenu(cargo);
               telaMenu.setVisible(true);
                  
                  }
                  
                  
                  
                  
            
        } catch (Exception e) {
        }
        
    }
    
    
   private void addEnterKeyListener() {
        campoSenha.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    BotaoLoginActionPerformed(null); // Chama a ação do botão Login
                }
            }
            
            public void keyReleased(KeyEvent e) {}
            
        });
    }

    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        imageLogin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        campoLogin = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        BotaoLogin = new javax.swing.JButton();
        BotaoSair = new javax.swing.JButton();
        cbSenha = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();

        imageLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/laprador2.png"))); // NOI18N
        imageLogin.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 183, 101));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/CachorrosLogin.png"))); // NOI18N

        campoLogin.setBackground(new java.awt.Color(255, 183, 101));
        campoLogin.setForeground(new java.awt.Color(0, 0, 0));
        campoLogin.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite seu Usuario", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 2, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        campoLogin.setCaretColor(new java.awt.Color(255, 153, 0));
        campoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLoginActionPerformed(evt);
            }
        });

        campoSenha.setBackground(new java.awt.Color(255, 183, 101));
        campoSenha.setForeground(new java.awt.Color(51, 51, 51));
        campoSenha.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        campoSenha.setToolTipText("");
        campoSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite sua Senha", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 2, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        campoSenha.setName(""); // NOI18N
        campoSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSenhaActionPerformed(evt);
            }
        });

        BotaoLogin.setBackground(new java.awt.Color(255, 183, 101));
        BotaoLogin.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BotaoLogin.setForeground(new java.awt.Color(0, 0, 0));
        BotaoLogin.setText("Login");
        BotaoLogin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoLoginActionPerformed(evt);
            }
        });

        BotaoSair.setBackground(new java.awt.Color(255, 183, 101));
        BotaoSair.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        BotaoSair.setForeground(new java.awt.Color(0, 0, 0));
        BotaoSair.setText("Sair");
        BotaoSair.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairActionPerformed(evt);
            }
        });

        cbSenha.setForeground(new java.awt.Color(0, 0, 0));
        cbSenha.setText("Exibir senha");
        cbSenha.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        cbSenha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSenhaActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 183, 101));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo 100.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(0, 6, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(BotaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BotaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(204, 204, 204))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(268, 268, 268))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(campoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbSenha)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLoginActionPerformed
      
    }//GEN-LAST:event_campoLoginActionPerformed

    private void cbSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSenhaActionPerformed
        if (cbSenha.isSelected()) {
                    campoSenha.setEchoChar((char) 0); // Mostra a senha
                } else {
                    campoSenha.setEchoChar('*'); // Oculta a senha
                } 
    }//GEN-LAST:event_cbSenhaActionPerformed

    private void BotaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairActionPerformed
            dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoSairActionPerformed

    private void BotaoLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoLoginActionPerformed
        String login, senha;
        login = campoLogin.getText();
        senha = campoSenha.getText();
        
        
        CadFuncionario funcionario = cadFuncionario.lerCPF(login);

        if (login.equals("adm") && senha.equals("adm")) {
            TelaMenu telaMenu = new TelaMenu("adm");
            telaMenu.setVisible(true);
            JOptionPane.showMessageDialog(null, "Seja Bem vindo Adm");
            dispose();  
        }
            else if (funcionario != null && funcionario.getDataDeNascimento().equals(senha)) {
        
            JOptionPane.showMessageDialog(null, "Seja Bem vindo " + funcionario.getNome() + "\n"
                                                                  + "Cargo: " + funcionario.getCargoFun());
            TelaMenu telaMenu = new TelaMenu(cargo);
            telaMenu.setVisible(true);
            dispose();
    } else {
            JOptionPane.showMessageDialog(null, "CPF e/ou Senha inválidos!");
           }
    }//GEN-LAST:event_BotaoLoginActionPerformed

    private void campoSenhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSenhaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoSenhaActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoLogin;
    private javax.swing.JButton BotaoSair;
    private javax.swing.JTextField campoLogin;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JCheckBox cbSenha;
    private javax.swing.JLabel imageLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
