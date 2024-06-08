/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TelaPet;

import ClassesCadastro.CadPets;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kauan
 */
public class TelaConsultarAlterarPets extends javax.swing.JFrame implements java.awt.event.WindowListener {

   public void Listar(){
       try{
           CadPets pets = new CadPets();
           List<CadPets> listadepets = pets.ListarPets();

           DefaultTableModel model = (DefaultTableModel) TabelaPets.getModel();
           model.setNumRows(0);
           
           for(CadPets v : listadepets ){
               model.addRow(new Object[]{
               v.getCodigo(),
               v.getNome(),
               v.getCpf(),
               v.getNumero(),
               v.getNomePet(),
               v.getIdade(),
               v.getraca(),
               v.getSexo(),
               
               });
           }
       
       }catch(Exception e){

    }
   }
   
    public TelaConsultarAlterarPets() {
        initComponents();
        addWindowListener((WindowListener) this);
        this.setLocationRelativeTo(null);
        setResizable(false);
        String caminhoImagem = "/icon/logo PET VITALLI.png";        
         // Carrega a imagem do ícone
        ImageIcon icon = new ImageIcon(getClass().getResource( caminhoImagem ));
        // Define o ícone da janela
        this.setIconImage(icon.getImage());
        
    }
     
  
    public void windowActivated(WindowEvent e) {
        this.Listar();
        
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSexoPet = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNomePet = new javax.swing.JTextField();
        txtIdadePet = new javax.swing.JTextField();
        Deletar = new javax.swing.JButton();
        txtNumTutor = new javax.swing.JTextField();
        AlterarDados = new javax.swing.JButton();
        txtRacaPet = new javax.swing.JTextField();
        txtNomeTutor = new javax.swing.JTextField();
        txtCpfTutor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaPets = new javax.swing.JTable();
        txtCodigo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Consultar = new javax.swing.JButton();
        txtConsultaPet = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LimparDados1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 153));

        jLabel8.setText("Sexo");

        jLabel4.setText("Espécie - Raça");

        jLabel5.setText("Número de contato");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Alterar Cliente Pet");
        jLabel6.setToolTipText("");
        jLabel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Deletar.setText("Deletar");
        Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarActionPerformed(evt);
            }
        });

        AlterarDados.setText("Alterar");
        AlterarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarDadosActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome Tutor");

        jLabel7.setText("CPF do Tutor");

        jLabel2.setText("Nome");

        jLabel3.setText("Idade");

        TabelaPets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nome", "Cpf", "Número", "Nome do Pet", "Idade", "Especie - Raça", "Sexo"
            }
        ));
        TabelaPets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaPetsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TabelaPets);

        jLabel9.setText("Código");

        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        txtConsultaPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultaPetActionPerformed(evt);
            }
        });

        jLabel10.setText("CPF do Tutor");

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Consultar Pet");
        jLabel11.setToolTipText("");
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        LimparDados1.setText("Limpar");
        LimparDados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimparDados1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel1)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LimparDados1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtNumTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtNomeTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCpfTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 247, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNomePet)
                                    .addComponent(txtRacaPet)
                                    .addComponent(txtSexoPet, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdadePet, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(75, 75, 75))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtConsultaPet, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                                    .addComponent(Consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(AlterarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 576, Short.MAX_VALUE)
                        .addComponent(Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConsultaPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtNomePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNomeTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdadePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCpfTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtRacaPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNumTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtSexoPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AlterarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deletar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LimparDados1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarActionPerformed
        CadPets pet = new CadPets();
  
        pet.setCodigo(Integer.parseInt(txtCodigo.getText()));

        if (!txtCodigo.getText().isEmpty())
             {
            pet.DeletarPet();
        }else{
            JOptionPane.showMessageDialog(null, "Código invalido");
        }

    }//GEN-LAST:event_DeletarActionPerformed

    private void AlterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarDadosActionPerformed
        // TODO add your handling code here:

        //Variavel pet para conversar com a classe
        CadPets pet = new CadPets();

        String NumPet, IdadePet, CpfTutor;
       
        pet.setNome(txtNomeTutor.getText());
        pet.setCpf(txtCpfTutor.getText());
        pet.setNumero(txtNumTutor.getText());
        pet.setNomePet(txtNomePet.getText());
        pet.setIdade(txtIdadePet.getText());
        pet.setraca(txtRacaPet.getText());
        pet.setSexo(txtSexoPet.getText());
        pet.setCodigo(Integer.parseInt(txtCodigo.getText()));
        
        
        
        //Isso aqui em baixo é só para poder fazer aquele negocio de só aceitar número funcionar certo

        String textIdaPet = txtIdadePet.getText();
        String textNumPet = txtNumTutor.getText();
        String textCpfTutor = txtCpfTutor.getText();

        //Define uma expressão regular para verificar se o texto contém apenas números
        String regexNumerico = "\\d+";

        // Cria um padrão regex
        //Pattern é uma classe em Java que compila uma expressão regular em um objeto de padrão.
        //Uma expressão regular é uma sequência de caracteres que define um padrão de busca.
        Pattern pattern = Pattern.compile(regexNumerico);

        // Cria um Matcher para aplicar o padrão ao texto do campo
        //Matcher é uma classe que realiza a correspondência de padrões em uma sequência de caracteres.
        //Ela é usada para aplicar um padrão regex a uma determinada string e encontrar todas as ocorrências desse padrão na string.
        Matcher matcherIdade = pattern.matcher(textIdaPet);
        Matcher matcherNumTutor = pattern.matcher(textNumPet);
        Matcher matcherCpfTutor = pattern.matcher(textCpfTutor);

        //Aqui basicamente é só para confirmar se todos os dados foram preenchidos
        //Se tiverem sido preechidos corretamente ai finaliza o cadrastro

        if (!txtNomeTutor.getText().isEmpty()
            && !txtNomePet.getText().isEmpty()
            && !txtRacaPet.getText().isEmpty()
            && !txtIdadePet.getText().isEmpty()
            && !txtNumTutor.getText().isEmpty()
            && !txtCpfTutor.getText().isEmpty()
            && !txtSexoPet.getText().isEmpty()
            && !txtCodigo.getText().isEmpty()
            && matcherIdade.matches()
            && matcherNumTutor.matches()
            && matcherCpfTutor.matches())  {
            pet.AlterarPet();
        }else{
            JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente");
        }

    }//GEN-LAST:event_AlterarDadosActionPerformed

    private void TabelaPetsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaPetsMouseClicked
        //Funciona pra clicar
        txtCodigo.setText(TabelaPets.getValueAt(TabelaPets.getSelectedRow(), 0).toString());
        txtNomeTutor.setText(TabelaPets.getValueAt(TabelaPets.getSelectedRow(), 1).toString());
        txtCpfTutor.setText(TabelaPets.getValueAt(TabelaPets.getSelectedRow(), 2).toString());
        txtNumTutor.setText(TabelaPets.getValueAt(TabelaPets.getSelectedRow(), 3).toString());
        txtNomePet.setText(TabelaPets.getValueAt(TabelaPets.getSelectedRow(), 4).toString());
        txtIdadePet.setText(TabelaPets.getValueAt(TabelaPets.getSelectedRow(), 5).toString());
        txtRacaPet.setText(TabelaPets.getValueAt(TabelaPets.getSelectedRow(), 6).toString());
        txtSexoPet.setText(TabelaPets.getValueAt(TabelaPets.getSelectedRow(), 7).toString());
        
    }//GEN-LAST:event_TabelaPetsMouseClicked

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
    
        
       try{
           
           String cpf = txtConsultaPet.getText();
           
           
           CadPets pets = new CadPets();
           List<CadPets> listadepets = pets.ListarPetsPorCpf(cpf);

           DefaultTableModel model = (DefaultTableModel) TabelaPets.getModel();
           model.setNumRows(0);
           
           for(CadPets v : listadepets ){
               model.addRow(new Object[]{
               v.getCodigo(),
               v.getNome(),
               v.getCpf(),
               v.getNumero(),
               v.getNomePet(),
               v.getIdade(),
               v.getraca(),
               v.getSexo(),
               
               });
           }
       
       }catch(Exception e){

    }
    }//GEN-LAST:event_ConsultarActionPerformed

    private void txtConsultaPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultaPetActionPerformed
  
    }//GEN-LAST:event_txtConsultaPetActionPerformed

    private void LimparDados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimparDados1ActionPerformed
     txtCodigo.setText("");
        txtNomeTutor.setText("");
        txtCpfTutor.setText("");
        txtNumTutor.setText("");
        txtNomePet.setText("");
        txtIdadePet.setText("");
        txtRacaPet.setText("");
        txtSexoPet.setText("");
        
    
    }//GEN-LAST:event_LimparDados1ActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(TelaConsultarAlterarPets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarAlterarPets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarAlterarPets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsultarAlterarPets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsultarAlterarPets().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AlterarDados;
    private javax.swing.JButton Consultar;
    private javax.swing.JButton Deletar;
    private javax.swing.JButton LimparDados1;
    private javax.swing.JTable TabelaPets;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtConsultaPet;
    private javax.swing.JTextField txtCpfTutor;
    private javax.swing.JTextField txtIdadePet;
    private javax.swing.JTextField txtNomePet;
    private javax.swing.JTextField txtNomeTutor;
    private javax.swing.JTextField txtNumTutor;
    private javax.swing.JTextField txtRacaPet;
    private javax.swing.JTextField txtSexoPet;
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
