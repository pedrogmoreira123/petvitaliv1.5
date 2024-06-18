
package TelaConsultas;

import java.util.Date;
import ClassesCadastro.CadConsulta;
import ClassesCadastro.CadPets;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/*
 * @author Andre Alves
 */
public class TelaAlterarDeleteConsulta extends javax.swing.JFrame implements java.awt.event.WindowListener {

   
    
    public TelaAlterarDeleteConsulta() {
        super("Alteração de Consultas");
        initComponents();
        addWindowListener(this);
        this.setLocationRelativeTo(null);
        setResizable(true);
        addEnterKeyListener();
        String caminhoImagem = "/icon/logo 100.png";        
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
        jPanel1 = new javax.swing.JPanel();
        CampoDaRaca = new javax.swing.JTextField();
        CampoIdade = new javax.swing.JTextField();
        CampoNomeDoPet = new javax.swing.JTextField();
        BotaoConsultar = new javax.swing.JButton();
        CampoDoCpf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        consultaBancoConsultas = new javax.swing.JTable();
        CaixaDeTipodeConsultas = new javax.swing.JComboBox<>();
        CaixaDeHorasConsultas = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CampoDiaConsulta = new javax.swing.JTextField();
        CampoCpf = new javax.swing.JTextField();
        CampoSexo = new javax.swing.JTextField();
        ButaoDelete = new javax.swing.JButton();
        BotaoAlterar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

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

        CampoDaRaca.setBackground(new java.awt.Color(255, 183, 101));
        CampoDaRaca.setToolTipText("");
        CampoDaRaca.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white), "Raça", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        CampoIdade.setBackground(new java.awt.Color(255, 183, 101));
        CampoIdade.setToolTipText("");
        CampoIdade.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white), "Idade", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        CampoNomeDoPet.setBackground(new java.awt.Color(255, 183, 101));
        CampoNomeDoPet.setToolTipText("");
        CampoNomeDoPet.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white), "Nome Do Pet", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N

        BotaoConsultar.setBackground(new java.awt.Color(255, 134, 47));
        BotaoConsultar.setForeground(new java.awt.Color(0, 0, 0));
        BotaoConsultar.setText("Consultar");
        BotaoConsultar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoConsultarActionPerformed(evt);
            }
        });

        CampoDoCpf.setBackground(new java.awt.Color(255, 183, 101));
        CampoDoCpf.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white), "Pesquise o CPF", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        CampoDoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDoCpfActionPerformed(evt);
            }
        });

        consultaBancoConsultas.setAutoCreateRowSorter(true);
        consultaBancoConsultas.setBorder(new javax.swing.border.MatteBorder(new javax.swing.ImageIcon(getClass().getResource("/icon/check.png")))); // NOI18N
        consultaBancoConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "CPF Do Cliente", "Nome Do Pet  /  Sexo", "Raça  /  Idade(Anos) ", "Tipo de Consulta", "Dia e Hora"
            }
        ));
        consultaBancoConsultas.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        consultaBancoConsultas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                consultaBancoConsultasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(consultaBancoConsultas);

        CaixaDeTipodeConsultas.setBackground(new java.awt.Color(255, 183, 101));
        CaixaDeTipodeConsultas.setForeground(new java.awt.Color(0, 0, 0));
        CaixaDeTipodeConsultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Consulta de Rotina", "Vacinação", "Tratamento" }));
        CaixaDeTipodeConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaDeTipodeConsultasActionPerformed(evt);
            }
        });

        CaixaDeHorasConsultas.setBackground(new java.awt.Color(255, 183, 101));
        CaixaDeHorasConsultas.setForeground(new java.awt.Color(0, 0, 0));
        CaixaDeHorasConsultas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "08:00", "08:30", "09:00", "09:30", "10:00", "10:30" }));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Hora Da Consulta");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Dia da Consulta");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Tipo da Consulta");

        CampoDiaConsulta.setBackground(new java.awt.Color(255, 183, 101));
        CampoDiaConsulta.setToolTipText("");
        CampoDiaConsulta.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));

        CampoCpf.setBackground(new java.awt.Color(255, 183, 101));
        CampoCpf.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white), "CPF", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        CampoCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCpfActionPerformed(evt);
            }
        });

        CampoSexo.setBackground(new java.awt.Color(255, 183, 101));
        CampoSexo.setToolTipText("");
        CampoSexo.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white), "Sexo", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 3, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        CampoSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoSexoActionPerformed(evt);
            }
        });

        ButaoDelete.setBackground(new java.awt.Color(255, 134, 47));
        ButaoDelete.setForeground(new java.awt.Color(0, 0, 0));
        ButaoDelete.setText("Deletar");
        ButaoDelete.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ButaoDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButaoDeleteActionPerformed(evt);
            }
        });

        BotaoAlterar.setBackground(new java.awt.Color(255, 134, 47));
        BotaoAlterar.setForeground(new java.awt.Color(0, 0, 0));
        BotaoAlterar.setText("Alterar");
        BotaoAlterar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAlterarActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 183, 101));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo 100.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(CampoDoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotaoConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CampoNomeDoPet, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CampoDaRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(77, 77, 77)
                                                .addComponent(ButaoDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(59, 59, 59)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(CampoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(CampoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(CampoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CaixaDeHorasConsultas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoDiaConsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(BotaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(CaixaDeTipodeConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(90, 90, 90))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CaixaDeTipodeConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CampoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoNomeDoPet, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(CampoDiaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CaixaDeHorasConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoDaRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButaoDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CampoDoCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

  
    
    
    private void ButaoDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButaoDeleteActionPerformed

      
    }//GEN-LAST:event_ButaoDeleteActionPerformed

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

    private void consultaBancoConsultasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_consultaBancoConsultasMouseClicked
                                       
        //Funciona pra clicar
        CampoCpf.setText(consultaBancoConsultas.getValueAt(consultaBancoConsultas.getSelectedRow(), 0).toString());
        String nomePetESexo = consultaBancoConsultas.getValueAt(consultaBancoConsultas.getSelectedRow(), 1).toString();
        String[] partes = nomePetESexo.split(" / ");
        CampoNomeDoPet.setText(partes[0]);
        CampoSexo.setText(partes[1]);   
        String racaIdade = consultaBancoConsultas.getValueAt(consultaBancoConsultas.getSelectedRow(), 2).toString();
        String[] parte = racaIdade.split(" / ");
        CampoDaRaca.setText(parte[0]);
        CampoIdade.setText(parte [1]);
        
        CaixaDeTipodeConsultas.setSelectedItem(consultaBancoConsultas.getValueAt(consultaBancoConsultas.getSelectedRow(), 3).toString());
        
        String diaHora = consultaBancoConsultas.getValueAt(consultaBancoConsultas.getSelectedRow(), 4).toString();
        String[] part = diaHora.split(" -- ");
        CampoDiaConsulta.setText(part[0]);
        CaixaDeHorasConsultas.setSelectedItem(part[1]);
    
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
        
        alo.alterarConsultas();
        
    }//GEN-LAST:event_BotaoAlterarActionPerformed

    private void BotaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoConsultarActionPerformed
        
        try{
          
            String Cpf = CampoDoCpf.getText();
            
        CadConsulta consultas = new CadConsulta();
        List<CadConsulta> listaDeConsultas = consultas.ListarConsultaPorCpf(Cpf);

        DefaultTableModel model = (DefaultTableModel) consultaBancoConsultas.getModel();
        model.setNumRows(0);
        
            for(CadConsulta cons : listaDeConsultas){
                model.addRow(new Object[]{
                    cons.getCPF(),
                    cons.getnomePet() + " / " + cons.getSexo(),
                    cons.getraca() + " / " + cons.getidade(),
                    cons.getconsulta(), cons.getDia() + " -- " + cons.getHora()
                });
            }
        
    } catch(Exception e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_BotaoConsultarActionPerformed

    
   public void Listar(){
    try{
        CadConsulta consultas = new CadConsulta();
        List<CadConsulta> listaDeConsultas = consultas.ListarConsultas();

        DefaultTableModel model = (DefaultTableModel) consultaBancoConsultas.getModel();
        model.setNumRows(0);
        
            for(CadConsulta cons : listaDeConsultas){
                model.addRow(new Object[]{
                    cons.getCPF(),
                    cons.getnomePet() + " / " + cons.getSexo(),
                    cons.getraca() + " / " + cons.getidade(),
                    cons.getconsulta(), cons.getDia() + " -- " + cons.getHora()
                });
            }
        
    } catch(Exception e) {
        e.printStackTrace();
    }
}

     public void windowActivated(WindowEvent e) {
        this.Listar();
        
    }
  
    
    public static void main(String args[]) {
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
    private javax.swing.JTextField CampoCpf;
    private javax.swing.JTextField CampoDaRaca;
    private javax.swing.JTextField CampoDiaConsulta;
    private javax.swing.JTextField CampoDoCpf;
    private javax.swing.JTextField CampoIdade;
    private javax.swing.JTextField CampoNomeDoPet;
    private javax.swing.JTextField CampoSexo;
    private javax.swing.JTable consultaBancoConsultas;
    private javax.swing.JButton consultaProdPesquisarBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
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
