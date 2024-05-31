package TelaCliente;

import ClassesCadastro.CadPet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaCadPet extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadAnimais
     */
    public TelaCadPet() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        String caminhoImagem = "/icon/logo PET VITALLI.png";        
         // Carrega a imagem do ícone
        ImageIcon icon = new ImageIcon(getClass().getResource( caminhoImagem ));
        // Define o ícone da janela
        this.setIconImage(icon.getImage());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VoltarMEnu = new javax.swing.JButton();
        SalvarPet = new javax.swing.JButton();
        txtNomeTutor = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNomePet = new javax.swing.JTextField();
        txtIdadePet = new javax.swing.JTextField();
        txtNumPet = new javax.swing.JTextField();
        txtRacaPet = new javax.swing.JTextField();
        txtCpfTutor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        VoltarMEnu.setText("Voltar");
        VoltarMEnu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarMEnuActionPerformed(evt);
            }
        });

        SalvarPet.setText("Salvar");
        SalvarPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalvarPetActionPerformed(evt);
            }
        });

        jLabel1.setText("Nome Tutor");

        jLabel2.setText("Nome");

        jLabel3.setText("Idade");

        jLabel4.setText("Raça");

        jLabel5.setText("Número de contato");

        jLabel6.setText("Cadastro de Cliente");

        jLabel7.setText("CPF do Tutor");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRacaPet, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtIdadePet, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtNomePet, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel7)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNumPet, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCpfTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomeTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(VoltarMEnu)
                        .addGap(160, 160, 160)
                        .addComponent(SalvarPet)))
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGap(182, 182, 182)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCpfTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdadePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRacaPet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalvarPet, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(VoltarMEnu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalvarPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalvarPetActionPerformed
        // TODO add your handling code here:
        
        //Variavel pet para conversar com a classe
        CadPet pet = new CadPet(); 
        
        //Variavies feitas para poder fazer alguns TextField funcionar somente com numeros ex: Idade
        String NumPet, IdadePet, CpfTutor; 
        
        //Nome do tutor, nome e raça são preaticamente iguais
        //Só muda o campo de onde vão puxar as Informações(getText)
        //E aonde vão setar a informação(setNome)(setRaca)
        
        if (!txtNomeTutor.getText().isEmpty()) {
            pet.setNomeTutor(txtNomeTutor.getText());
        }else{
            JOptionPane.showMessageDialog(null, "Campo do tutor inválido!");
        }
        
        if (!txtNomePet.getText().isEmpty()) {
            pet.setNome(txtNomePet.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Campo do nome inválido!");

        }
        
        if (!txtRacaPet.getText().isEmpty()) {
            pet.setRaca(txtRacaPet.getText());
        } else {
            JOptionPane.showMessageDialog(null, "Campo do raça inválido!");

        }
        
        //Para as informações em número o codigo é um pouco diferente
        //Tem a mesma base, mas precia de mais comandos
        //Aqui usaremos as variaveis que criamos la em cima como (IdadePet)
        //E aqui tambem mudamos a varievel de String para Int!!
        
        if (!txtIdadePet.getText().isEmpty()) {
        try {
            IdadePet =(txtIdadePet.getText());
            pet.setIdade(IdadePet);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo idade Inválido");
            //mostra para o usuario aonde está errado
        }
           } else {
        JOptionPane.showMessageDialog(null, "Campo idade Inválido");
            //mostra para o usuario aonde está errado
          }
        
        if (!txtNumPet.getText().isEmpty()) {
        try {
            NumPet =(txtNumPet.getText());
         
            pet.setNum(NumPet);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo número Inválido");
            // mostra para o usuario aonde está errado
        }
           } else {
        JOptionPane.showMessageDialog(null, "Campo número Inválido");
            //  mostra para o usuario aonde está errado
          }
        
        if (!txtCpfTutor.getText().isEmpty()) {
        try {
            CpfTutor =(txtCpfTutor.getText());
         
            pet.setCpfTutor(CpfTutor);
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Campo CPF do Tutor Inválido");
            // mostra para o usuario aonde está errado
        }
           } else {
        JOptionPane.showMessageDialog(null, "Campo CPF do Tutor Inválido");
            //  mostra para o usuario aonde está errado
          }
        
        
        
        //Isso aqui em baixo é só para poder fazer aquele negocio de só aceitar número funcionar certo
        
        String textIdaPet = txtIdadePet.getText();
        String textNumPet = txtNumPet.getText();
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
         Matcher matcherNumPet = pattern.matcher(textNumPet);
         Matcher matcherCpfTutor = pattern.matcher(textCpfTutor);
        
        //Aqui basicamente é só para confirmar se todos os dados foram preenchidos
        //Se tiverem sido preechidos corretamente ai finaliza o cadrastro
        
        if (!txtNomeTutor.getText().isEmpty()
            && !txtNomePet.getText().isEmpty()
            && !txtRacaPet.getText().isEmpty()
            && !txtIdadePet.getText().isEmpty()
            && !txtNumPet.getText().isEmpty()
            && matcherIdade.matches()
            && matcherNumPet.matches()
            && matcherCpfTutor.matches())  { 
            pet.IncluirPet();
            this.dispose();
        }else{
             JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente");   
        }
            
    }//GEN-LAST:event_SalvarPetActionPerformed

    private void VoltarMEnuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarMEnuActionPerformed
         this.dispose();
    }//GEN-LAST:event_VoltarMEnuActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadPet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SalvarPet;
    private javax.swing.JButton VoltarMEnu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCpfTutor;
    private javax.swing.JTextField txtIdadePet;
    private javax.swing.JTextField txtNomePet;
    private javax.swing.JTextField txtNomeTutor;
    private javax.swing.JTextField txtNumPet;
    private javax.swing.JTextField txtRacaPet;
    // End of variables declaration//GEN-END:variables
}
