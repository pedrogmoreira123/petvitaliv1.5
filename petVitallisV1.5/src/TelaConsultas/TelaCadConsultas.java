
package TelaConsultas;

import ClassesCadastro.CadConsultatt;
import ClassesCadastro.CadPets;
import java.awt.event.FocusEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/*
 * @author Andre Alves
 */
public class TelaCadConsultas extends javax.swing.JFrame {

    /**
     * Creates new form TelaCadConsultas
     */
    public TelaCadConsultas() {
        super("Cadastro de Consultas");
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        String caminhoImagem = "/icon/logo PET VITALLI.png";        
         // Carrega a imagem do ícone
        ImageIcon icon = new ImageIcon(getClass().getResource( caminhoImagem ));
        // Define o ícone da janela
        this.setIconImage(icon.getImage());
        
            CampoDoCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
            CampoDoCpfFocusLost(evt);
            }
        });
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButaoAlterarDados = new javax.swing.JButton();
        CaixaDeTipodeConsultas = new javax.swing.JComboBox<>();
        ButaoAgendarCons = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CampoNomeDoPet = new javax.swing.JTextField();
        CampoDoCpf = new javax.swing.JTextField();
        CaixaDeHorasConsultas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CampoDiaConsulta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CampoIdade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CampoDaRaca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        ButaoAlterarDados.setBackground(new java.awt.Color(255, 255, 255));
        ButaoAlterarDados.setForeground(new java.awt.Color(0, 0, 0));
        ButaoAlterarDados.setText("Alterar");
        ButaoAlterarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButaoAlterarDadosActionPerformed(evt);
            }
        });

        CaixaDeTipodeConsultas.setForeground(new java.awt.Color(0, 0, 0));
        CaixaDeTipodeConsultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consulta de Rotina", "Vacinação", "Tratamento" }));

        ButaoAgendarCons.setBackground(new java.awt.Color(255, 255, 255));
        ButaoAgendarCons.setForeground(new java.awt.Color(0, 0, 0));
        ButaoAgendarCons.setText("Agendar");
        ButaoAgendarCons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButaoAgendarConsActionPerformed(evt);
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
        jLabel3.setText("CPF do Tutor");

        CampoDoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDoCpfActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(420, 420, 420)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(CampoDoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(CaixaDeHorasConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(280, 280, 280)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(CampoNomeDoPet, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(CampoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(CampoDiaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ButaoAlterarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(CampoDaRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CaixaDeTipodeConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(ButaoAgendarCons, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoDoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CaixaDeHorasConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5)))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoNomeDoPet, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoDiaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(CampoDaRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(CaixaDeTipodeConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButaoAlterarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButaoAgendarCons, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButaoAlterarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButaoAlterarDadosActionPerformed
        
        TelaConsConsulta cons = new TelaConsConsulta();
        cons.setVisible(true);
        
    }//GEN-LAST:event_ButaoAlterarDadosActionPerformed

    private void ButaoAgendarConsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButaoAgendarConsActionPerformed

         CadConsultatt alo = new CadConsultatt ();
        
        
        if (!CampoNomeDoPet.getText().isEmpty()) {
            alo.setNomePet(CampoNomeDoPet.getText()); 
        }else{
            JOptionPane.showMessageDialog(null, "Campo Nome Do Pet Inválido");
        }
        
        if (!CampoDoCpf.getText().isEmpty()) {
            alo.setCPF(CampoDoCpf.getText());
        }else{
           JOptionPane.showMessageDialog(null, "Campo Cpf do Tutor Inválido");
        }
        if (!CaixaDeTipodeConsultas.getSelectedItem().toString().isEmpty()) {
            alo.setConsulta(CaixaDeTipodeConsultas.getSelectedItem().toString());
            
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
        
        String nomeAnimal = CampoDoCpf.getText();
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
        
        alo.saveOrUpdateConsultas();
        
        
        
    }//GEN-LAST:event_ButaoAgendarConsActionPerformed

    private void CampoDoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDoCpfActionPerformed
       
    }//GEN-LAST:event_CampoDoCpfActionPerformed

    
    private void CampoDoCpfFocusLost(java.awt.event.FocusEvent evt) {
    
    String cpf = CampoDoCpf.getText();
    if (!cpf.isEmpty()) {
        CadPets pets = new CadPets();
        pets = pets.LerCPF(cpf);
        if (pets != null) {
            
            
            CampoNomeDoPet.setText(pets.getNomePet());
            CampoIdade.setText(pets.getIdade());
            CampoDaRaca.setText(pets.getraca());
           
        } else {
            JOptionPane.showMessageDialog(null, "CPF não encontrado.");
            }
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadConsultas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButaoAgendarCons;
    private javax.swing.JButton ButaoAlterarDados;
    private javax.swing.JComboBox<String> CaixaDeHorasConsultas;
    private javax.swing.JComboBox<String> CaixaDeTipodeConsultas;
    private javax.swing.JTextField CampoDaRaca;
    private javax.swing.JTextField CampoDiaConsulta;
    private javax.swing.JTextField CampoDoCpf;
    private javax.swing.JTextField CampoIdade;
    private javax.swing.JTextField CampoNomeDoPet;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
