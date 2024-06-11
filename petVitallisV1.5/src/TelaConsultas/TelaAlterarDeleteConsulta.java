
package TelaConsultas;

import java.util.Date;
import ClassesCadastro.CadConsulta;
import ClassesCadastro.CadPets;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * @author Andre Alves
 */
public class TelaAlterarDeleteConsulta extends javax.swing.JFrame implements java.awt.event.WindowListener {

    /**
     * Creates new form TelaCadConsultas
     */
    public TelaAlterarDeleteConsulta() {
        super("Cadastro de Consultas");
        initComponents();
        addWindowListener(this);
        this.setLocationRelativeTo(null);
        setResizable(false);
        addEnterKeyListener();
        String caminhoImagem = "/icon/logo PET VITALLI.png";        
         // Carrega a imagem do ícone
        ImageIcon icon = new ImageIcon(getClass().getResource( caminhoImagem ));
        // Define o ícone da janela
        this.setIconImage(icon.getImage());
         
    }
    
    private void addEnterKeyListener() {
        CampoDoCpf.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                   BotaoConsultarActionPerformed(null); // Chama a ação do botão Login
                }
            }
            
            public void keyReleased(KeyEvent e) {}
            
        });
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        consultaProdPesquisarBotao = new javax.swing.JButton();
        CaixaDeTipodeConsultas = new javax.swing.JComboBox<>();
        ButaoDelete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CampoNomeDoPet = new javax.swing.JTextField();
        CampoCodigoPet = new javax.swing.JTextField();
        CaixaDeHorasConsultas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CampoDiaConsulta = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CampoIdade = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        CampoDaRaca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        consultaBancoConsultas = new javax.swing.JTable();
        CampoSexo = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        CampoDoCpf = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        BotaoAlterar = new javax.swing.JButton();
        BotaoConsultar = new javax.swing.JButton();

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

        ButaoDelete.setBackground(new java.awt.Color(255, 255, 255));
        ButaoDelete.setForeground(new java.awt.Color(0, 0, 0));
        ButaoDelete.setText("Deletar");
        ButaoDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButaoDeleteActionPerformed(evt);
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
        jLabel3.setText("Codigo do Pet");

        CampoCodigoPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCodigoPetActionPerformed(evt);
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

        consultaBancoConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Códigos", "CPF Do Cliente", "Nome Do Pet  /  Sexo", "Raça  /  Idade(Anos) ", "Tipo de Consulta", "Dia e Hora"
            }
        ));
        consultaBancoConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultaBancoConsultasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(consultaBancoConsultas);

        CampoSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSexoActionPerformed(evt);
            }
        });

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Sexo");

        CampoDoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDoCpfActionPerformed(evt);
            }
        });

        jLabel8.setText("Digite o Cpf");

        BotaoAlterar.setBackground(new java.awt.Color(255, 255, 255));
        BotaoAlterar.setForeground(new java.awt.Color(0, 0, 0));
        BotaoAlterar.setText("Alterar");
        BotaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarActionPerformed(evt);
            }
        });

        BotaoConsultar.setBackground(new java.awt.Color(255, 255, 255));
        BotaoConsultar.setForeground(new java.awt.Color(0, 0, 0));
        BotaoConsultar.setText("Consultar");
        BotaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1, 1, 1)
                                .addComponent(CampoCodigoPet, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(CampoDaRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(CampoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(CampoNomeDoPet, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(CampoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addComponent(jLabel9)
                                                        .addGap(23, 23, 23))))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(85, 85, 85)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CampoDiaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CaixaDeHorasConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(jLabel5))
                                    .addComponent(CaixaDeTipodeConsultas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(35, 35, 35))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(ButaoDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(BotaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoDoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BotaoConsultar)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(CampoCodigoPet, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CaixaDeHorasConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(CampoNomeDoPet, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CampoDiaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CampoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CaixaDeTipodeConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CampoDaRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CampoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButaoDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoDoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(BotaoConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

  
    private void ButaoDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButaoDeleteActionPerformed

      
    }//GEN-LAST:event_ButaoDeleteActionPerformed

    private void CampoCodigoPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCodigoPetActionPerformed
       
    }//GEN-LAST:event_CampoCodigoPetActionPerformed

    private void consultaProdPesquisarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaProdPesquisarBotaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultaProdPesquisarBotaoActionPerformed

    private void CampoSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoSexoActionPerformed

    private void CaixaDeTipodeConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaDeTipodeConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaixaDeTipodeConsultasActionPerformed

    private void consultaBancoConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaBancoConsultasMouseClicked
                                       
        //Funciona pra clicar
        CampoCodigoPet.setText(consultaBancoConsultas.getValueAt(consultaBancoConsultas.getSelectedRow(), 0).toString());
        String nomePetESexo = consultaBancoConsultas.getValueAt(consultaBancoConsultas.getSelectedRow(), 2).toString();
        String[] partes = nomePetESexo.split("  /  ");
        CampoNomeDoPet.setText(partes[0]);
        CampoSexo.setText(partes[1]);
        String racaIdade = consultaBancoConsultas.getValueAt(consultaBancoConsultas.getSelectedRow(), 3).toString();
        String[] parte = racaIdade.split("  /  ");
        CampoDaRaca.setText(parte[0]);
        CampoIdade.setText(parte [1]);
        
        
        
          
    }//GEN-LAST:event_consultaBancoConsultasMouseClicked

    private void CampoDoCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDoCpfActionPerformed
      
    }//GEN-LAST:event_CampoDoCpfActionPerformed

    private void BotaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAlterarActionPerformed
       
         CadConsulta alo = new CadConsulta();
        
        
        if (!CampoNomeDoPet.getText().isEmpty()) {
            alo.setnomePet(CampoNomeDoPet.getText()); 
           
        }else{
            JOptionPane.showMessageDialog(null, "Campo Nome Do Pet Inválido");
        }
        if (!CampoCodigoPet.getText().isEmpty()) {
            alo.setCPF(CampoCodigoPet.getText());
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
     
        
        String nomeAnimal = CampoCodigoPet.getText();
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
        
        alo.alterarConsultas();
        
    }//GEN-LAST:event_BotaoAlterarActionPerformed

    private void BotaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConsultarActionPerformed
        
        try{
           String cpf = CampoDoCpf.getText();
           CadPets pets = new CadPets();
           List<CadPets> listadepets = pets.ListarPetsPorCpf(cpf);

           DefaultTableModel model = (DefaultTableModel) consultaBancoConsultas.getModel();
           model.setNumRows(0);
           
           for(CadPets v : listadepets ){
               model.addRow(new Object[]{
               v.getCodigo(),
               v.getCpf(),
               v.getNomePet() + "    /    " + v.getSexo(),
               v.getraca() + "    /    " + v.getIdade(),
               });
           }
       
       }catch(Exception e){
            e.printStackTrace();

       }
    }//GEN-LAST:event_BotaoConsultarActionPerformed

    
   public void Listar(){
    try{
        // Instanciar as classes e obter as listas
        CadPets pets = new CadPets();
        List<CadPets> listaDePets = pets.ListarPets();
        
        CadConsulta consultas = new CadConsulta();
        List<CadConsulta> listaDeConsultas = consultas.ListarConsultas();

        // Obter o modelo da tabela
        DefaultTableModel model = (DefaultTableModel) consultaBancoConsultas.getModel();
        model.setNumRows(0);

        // Iterar sobre a lista de pets e de consultas
        for(CadPets pet : listaDePets){
            // Para cada pet, você pode iterar sobre a lista de consultas se precisar associar consultas a pets
            for(CadConsulta consulta : listaDeConsultas){
                // Adicionar uma nova linha à tabela com dados combinados
                model.addRow(new Object[]{
                    pet.getCodigo(),
                    pet.getCpf(),
                    pet.getNomePet() + " / " + pet.getSexo(),
                    pet.getraca() + " / " + pet.getIdade(),
                    consulta.getconsulta(), consulta.getDia() + " / " + consulta.getHora()
                });
            }
        }
    } catch(Exception e) {
        e.printStackTrace();
    }
}

     public void windowActivated(WindowEvent e) {
        this.Listar();
        
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
            java.util.logging.Logger.getLogger(TelaAlterarDeleteConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarDeleteConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarDeleteConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAlterarDeleteConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAlterarDeleteConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoAlterar;
    private javax.swing.JButton BotaoConsultar;
    private javax.swing.JButton ButaoDelete;
    private javax.swing.JComboBox<String> CaixaDeHorasConsultas;
    private javax.swing.JComboBox<String> CaixaDeTipodeConsultas;
    private javax.swing.JTextField CampoCodigoPet;
    private javax.swing.JTextField CampoDaRaca;
    private javax.swing.JTextField CampoDiaConsulta;
    private javax.swing.JTextField CampoDoCpf;
    private javax.swing.JTextField CampoIdade;
    private javax.swing.JTextField CampoNomeDoPet;
    private javax.swing.JTextField CampoSexo;
    private javax.swing.JTable consultaBancoConsultas;
    private javax.swing.JButton consultaProdPesquisarBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
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
