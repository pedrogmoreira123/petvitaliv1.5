
package TelaConsultas;

import ClassesCadastro.CadConsulta;
import ClassesCadastro.CadPets;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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
        setResizable(false);
        this.setLocationRelativeTo(null);
        autoPreencherData();
        addWindowListener((WindowListener) this);
        this.setLocationRelativeTo(null);
        String caminhoImagem = "/icon/logo 100.png";        
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
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        CampoCpf = new javax.swing.JTextField();
        CampoNomeDoPet = new javax.swing.JTextField();
        CampoDaRaca = new javax.swing.JTextField();
        CampoSexo = new javax.swing.JTextField();
        CampoIdade = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CaixaDeTipodeConsultas = new javax.swing.JComboBox<>();
        CaixaDeHorasConsultas = new javax.swing.JComboBox<>();
        CampoDiaConsulta = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        BotaoDeConsultar = new javax.swing.JButton();
        BotaoCadastrar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        consultaProdPesquisarBotao.setText("...");
        consultaProdPesquisarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaProdPesquisarBotaoActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setBackground(new java.awt.Color(255, 183, 101));

        jLabel8.setBackground(new java.awt.Color(255, 183, 101));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo 100.png"))); // NOI18N

        CampoCpf.setFont(new java.awt.Font("Arial", 2, 12)); // NOI18N
        CampoCpf.setForeground(new java.awt.Color(0, 0, 0));
        CampoCpf.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white), "CPF", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        CampoCpf.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        CampoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCpfActionPerformed(evt);
            }
        });

        CampoNomeDoPet.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white), "Nome Do Pet", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        CampoDaRaca.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white), "Raça", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        CampoDaRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDaRacaActionPerformed(evt);
            }
        });

        CampoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white), "Sexo", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        CampoSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSexoActionPerformed(evt);
            }
        });

        CampoIdade.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white), "Idade", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tipo da Consulta");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Hora Da Consulta");

        CaixaDeTipodeConsultas.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        CaixaDeTipodeConsultas.setForeground(new java.awt.Color(0, 0, 0));
        CaixaDeTipodeConsultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consulta de Rotina", "Vacinação", "Tratamento" }));
        CaixaDeTipodeConsultas.setToolTipText("");
        CaixaDeTipodeConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaDeTipodeConsultasActionPerformed(evt);
            }
        });

        CaixaDeHorasConsultas.setForeground(new java.awt.Color(0, 0, 0));
        CaixaDeHorasConsultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30" }));

        CampoDiaConsulta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        CampoDiaConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDiaConsultaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Dia da Consulta");

        BotaoDeConsultar.setBackground(new java.awt.Color(255, 183, 101));
        BotaoDeConsultar.setForeground(new java.awt.Color(0, 0, 0));
        BotaoDeConsultar.setText("Consultar");
        BotaoDeConsultar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoDeConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoDeConsultarActionPerformed(evt);
            }
        });

        BotaoCadastrar.setBackground(new java.awt.Color(255, 183, 101));
        BotaoCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        BotaoCadastrar.setText("Cadastrar");
        BotaoCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Agendamento de Consultas");
        jLabel12.setToolTipText("");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoNomeDoPet, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoDaRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(CampoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CaixaDeTipodeConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoDiaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CaixaDeHorasConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(92, 92, 92))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(BotaoDeConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(443, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CaixaDeTipodeConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoNomeDoPet, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoDiaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(CampoDaRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CaixaDeHorasConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotaoDeConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
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
         boolean campoValidos = true;
        
        if (!CampoNomeDoPet.getText().isEmpty()) {
            alo.setnomePet(CampoNomeDoPet.getText());
        }else{
            JOptionPane.showMessageDialog(null, "Campo Nome Do Pet Inválido");
            campoValidos = false;
        }
        if (!CampoCpf.getText().isEmpty()) {
            alo.setCPF(CampoCpf.getText());
        }else{
           JOptionPane.showMessageDialog(null, "Campo Cpf do Tutor Inválido");
           campoValidos = false;
        }
        
        if (!CampoSexo.getText().isEmpty()) {
            alo.setSexo(CampoSexo.getText());
        }else{
           JOptionPane.showMessageDialog(null, "Campo Sexo do pet Inválido");
           campoValidos = false;
        }
         if (!CampoDaRaca.getText().isEmpty()) {
            alo.setraca(CampoDaRaca.getText());
        }else{
           JOptionPane.showMessageDialog(null, "Campo Raça do pet Inválido");
           campoValidos = false;
        }
         if (!CampoIdade.getText().isEmpty()) {
            alo.setidade(CampoIdade.getText());
        }else{
           JOptionPane.showMessageDialog(null, "Campo Idade do pet Inválido");
           campoValidos = false;
        }
         
        if (!CaixaDeTipodeConsultas.getSelectedItem().toString().isEmpty()) {
            alo.setconsulta(CaixaDeTipodeConsultas.getSelectedItem().toString());
        }
        
        if (!CampoDiaConsulta.getText().isEmpty()) {
           alo.setDia(CampoDiaConsulta.getText());
        }else {
          JOptionPane.showMessageDialog(null, "Campo dia da Consulta Inválido");
          campoValidos = false;
        }
        if (!CaixaDeHorasConsultas.getSelectedItem().toString().isEmpty()) {
            alo.setHora(CaixaDeHorasConsultas.getSelectedItem().toString());
        } else {
           JOptionPane.showMessageDialog(null, "Campo Hora Esta Inválido");
           campoValidos = false;
        }
     
        
         if (campoValidos) {

           alo.setnomePet(CampoNomeDoPet.getText());
           alo.setCPF(CampoCpf.getText());
           alo.setSexo(CampoSexo.getText());
           alo.setraca(CampoDaRaca.getText());
           alo.setidade(CampoIdade.getText());
           alo.setconsulta(CaixaDeTipodeConsultas.getSelectedItem().toString());
           alo.setDia(CampoDiaConsulta.getText());
           alo.setHora(CaixaDeHorasConsultas.getSelectedItem().toString());

           String cpf = CampoCpf.getText();
           String nomePet = CampoNomeDoPet.getText();
           String sexo = CampoSexo.getText();
           String raca = CampoDaRaca.getText();
           String idade = CampoIdade.getText();
           String tipoConsulta = (String) CaixaDeTipodeConsultas.getSelectedItem();
           String diaConsulta = CampoDiaConsulta.getText();
           String tipoHoras = (String) CaixaDeHorasConsultas.getSelectedItem();

           JOptionPane.showMessageDialog(this, "Consulta agendada:\n\n"
               + "-CPF do Cliente: " + cpf + "\n"
               + "-Nome do Animal:  " + nomePet + "\n"
               + "-Sexo do Animal: " + sexo + "\n"
               + "-Raça do Animal: " + raca + "\n"
               + "-Idade do Animal: " + idade + "\n"
               + "-Tipo de Consulta: " + tipoConsulta + "\n"
               + "-Dia da Consulta: " + diaConsulta + "\n" 
               + "-Hora da Consulta: " + tipoHoras + "\n");
           
           alo.inserirConsultas();
           
         }
    }//GEN-LAST:event_BotaoCadastrarActionPerformed

    private void CampoDiaConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDiaConsultaActionPerformed

    }//GEN-LAST:event_CampoDiaConsultaActionPerformed

    private void CampoDaRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDaRacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDaRacaActionPerformed

  private void autoPreencherData() {
      
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        CampoDiaConsulta.setText(today.format(formatter));
    }

    
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
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
