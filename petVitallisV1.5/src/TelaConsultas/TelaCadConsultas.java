
package TelaConsultas;

import ClassesCadastro.CadConsulta;
import ClassesCadastro.CadPets;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TelaCadConsultas extends javax.swing.JFrame implements java.awt.event.WindowListener {
    
/*
 * @author Andre Alves
 */
    
    public  TelaCadConsultas() {
        super("Cadastro de Consultas");
        initComponents();
        addWindowListener((WindowListener) this);
        this.setLocationRelativeTo(null);
        setResizable(true);
        String caminhoImagem = "/icon/logo PET VITALLI.png";        
         // Carrega a imagem do ícone
        ImageIcon icon = new ImageIcon(getClass().getResource( caminhoImagem ));
        // Define o ícone da janela
        this.setIconImage(icon.getImage());
        
        
        
        
             CampoNomeDoPet.addFocusListener(new java.awt.event.FocusAdapter() {
             @Override
             public void focusLost(java.awt.event.FocusEvent evt) {
             CampoNomeDoPetFocusLost(evt);
            
                }
            });
         
    }
    
    
 public void windowActivated(WindowEvent e) {
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        consultaProdPesquisarBotao = new javax.swing.JButton();
        CaixaDeTipodeConsultas = new javax.swing.JComboBox<>();
        BotaoDeConsultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CampoNomeDoPet = new javax.swing.JTextField();
        CampoCpf = new javax.swing.JTextField();
        CaixaDeHorasConsultas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CampoDiaConsulta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CampoIdade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CampoDaRaca = new javax.swing.JTextField();
        CampoSexo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        BotaoCadastrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        consultaProdPesquisarBotao.setText("...");
        consultaProdPesquisarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaProdPesquisarBotaoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        CaixaDeTipodeConsultas.setForeground(new java.awt.Color(0, 0, 0));
        CaixaDeTipodeConsultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consulta de Rotina", "Vacinação", "Tratamento" }));
        CaixaDeTipodeConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaDeTipodeConsultasActionPerformed(evt);
            }
        });

        BotaoDeConsultar.setBackground(new java.awt.Color(255, 255, 255));
        BotaoDeConsultar.setForeground(new java.awt.Color(0, 0, 0));
        BotaoDeConsultar.setText("Consultar");
        BotaoDeConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDeConsultarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tipo da Consulta");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Nome do Pet");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("CPF");

        CampoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCpfActionPerformed(evt);
            }
        });

        CaixaDeHorasConsultas.setForeground(new java.awt.Color(0, 0, 0));
        CaixaDeHorasConsultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30" }));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Hora Da Consulta");

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Dia da Consulta");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Idade");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Raca");

        CampoSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSexoActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Sexo");

        BotaoCadastrar.setBackground(new java.awt.Color(255, 255, 255));
        BotaoCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        BotaoCadastrar.setText("Cadastrar");
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });

        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CampoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(CampoNomeDoPet, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CampoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(jLabel9)
                                            .addGap(23, 23, 23))))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CampoDaRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(37, 37, 37)
                                            .addComponent(BotaoDeConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(18, 18, 18)
                                    .addComponent(CampoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(44, 44, 44)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(CampoDiaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CaixaDeHorasConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(41, 41, 41)
                                    .addComponent(jLabel5))
                                .addComponent(CaixaDeTipodeConsultas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(35, 35, 35)))
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CampoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(CampoNomeDoPet, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CampoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CampoDaRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CampoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CaixaDeHorasConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(CampoDiaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(47, 47, 47)
                                        .addComponent(CaixaDeTipodeConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoDeConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    private void BotaoDeConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoDeConsultarActionPerformed

        TelaAlterarDeleteConsulta cons = new TelaAlterarDeleteConsulta();
        cons.setVisible(true);
        
    }//GEN-LAST:event_BotaoDeConsultarActionPerformed

    private void CampoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCpfActionPerformed
       
    }//GEN-LAST:event_CampoCpfActionPerformed

    private void consultaProdPesquisarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaProdPesquisarBotaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultaProdPesquisarBotaoActionPerformed

    private void CampoSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoSexoActionPerformed

    private void CaixaDeTipodeConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaDeTipodeConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaixaDeTipodeConsultasActionPerformed

    private void BotaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarActionPerformed
       
         CadConsulta alo = new CadConsulta();
        
        
        if (!CampoNomeDoPet.getText().isEmpty()) {
            alo.setnomePet(CampoNomeDoPet.getText()); 
           
        }else{
            JOptionPane.showMessageDialog(null, "Campo Nome Do Pet Inválido");
        }
        
       
        if (!CampoCpf.getText().isEmpty()) {
            alo.setCPF(CampoCpf.getText());
        }else{
           JOptionPane.showMessageDialog(null, "Campo Cpf do Tutor Inválido");
        }
        if (!CaixaDeTipodeConsultas.getSelectedItem().toString().isEmpty()) {
            alo.setconsulta(CaixaDeTipodeConsultas.getSelectedItem().toString());
            
        }
       if (!CampoDiaConsulta.getText().isEmpty()) {
           alo.setDia(CampoDiaConsulta.getText());
        }else {
          JOptionPane.showMessageDialog(null, "Campo dia da Consulta Inválido"); 
        }
        if (!CaixaDeHorasConsultas.getSelectedItem().toString().isEmpty()) {
            alo.setHora(CaixaDeHorasConsultas.getSelectedItem().toString());
        } else {
           JOptionPane.showMessageDialog(null, "Campo Hora Esta Inválido"); 
        }
     
        
        String nomeAnimal = CampoCpf.getText();
        String nomeCliente = CampoNomeDoPet.getText();
        String tipoConsulta = (String) CaixaDeTipodeConsultas.getSelectedItem();
        String Diaconsulta = CampoDiaConsulta.getText();
        String tipoHoras = (String) CaixaDeHorasConsultas.getSelectedItem();
       
        // Aqui você pode adicionar a lógica para agendar a consulta com os dados fornecidos

        // Por enquanto, apenas exibimos uma mensagem com os dados
        JOptionPane.showMessageDialog(this, "Consulta agendada:\n\n"
            + "-CPF do Cliente: " + nomeCliente + "\n"
            + "-Nome do Animal:  " + nomeAnimal  + "\n"
            + "-Tipo de Consulta: " + tipoConsulta + "\n"
            + "-Dia da Consulta: " + Diaconsulta + "\n" 
            + "-Hora da Consulta: " + tipoHoras);
        
       alo.inserirConsultas();
     
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CampoNomeDoPetFocusLost(java.awt.event.FocusEvent evt) {
        buscarInformacoesPets();
    }

    
    private void buscarInformacoesPets() {
        
    try {
        // Obter CPF e nome do pet digitados
        String cpf = CampoCpf.getText();
        String nomePet = CampoNomeDoPet.getText();
        
        // Verificar se ambos os campos estão preenchidos
        if (!cpf.isEmpty() && !nomePet.isEmpty()) {
            // Instanciar a classe CadPets e obter a lista de pets por CPF e nome do pet
            CadPets pets = new CadPets();
            List<CadPets> listadepets = pets.ListarPetsPorCpfeNome(cpf, nomePet);

            if (!listadepets.isEmpty()) {
                CadPets pet = listadepets.get(0);
                CampoCpf.setText(pet.getCpf());
                CampoNomeDoPet.setText(pet.getNomePet());
                CampoIdade.setText(pet.getIdade());
                CampoDaRaca.setText(pet.getraca());
                CampoSexo.setText(pet.getSexo());
            } else {
                // Se nenhum pet for encontrado, mostrar mensagem de erro
                JOptionPane.showMessageDialog(null, "Nenhum pet encontrado com o CPF e nome fornecidos.");
            }
        } else {
            if (cpf.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, digite o CPF.");
            }
            if (nomePet.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Por favor, digite o nome.");
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(TelaCadConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadConsultas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrar;
    private javax.swing.JButton BotaoDeConsultar;
    private javax.swing.JComboBox<String> CaixaDeHorasConsultas;
    private javax.swing.JComboBox<String> CaixaDeTipodeConsultas;
    private javax.swing.JTextField CampoCpf;
    private javax.swing.JTextField CampoDaRaca;
    private javax.swing.JTextField CampoDiaConsulta;
    private javax.swing.JTextField CampoIdade;
    private javax.swing.JTextField CampoNomeDoPet;
    private javax.swing.JTextField CampoSexo;
    private javax.swing.JButton consultaProdPesquisarBotao;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
    
    @Override
    public void windowOpened(WindowEvent e) {
      }

    @Override
    public void windowClosing(WindowEvent e) {
      }

    @Override
    public void windowClosed(WindowEvent e) {
        }

    @Override
    public void windowIconified(WindowEvent e) {
       }

    @Override
    public void windowDeiconified(WindowEvent e) {
        }

    @Override
    public void windowDeactivated(WindowEvent e) {
       }
 
}
