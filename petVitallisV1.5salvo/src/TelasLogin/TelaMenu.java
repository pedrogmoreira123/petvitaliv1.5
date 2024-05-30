package TelasLogin;

import ClassesDeConsultas.CadConsultatt;
import TelaFuncionario.TelaConsFuncionarios;
import TelasLogin.TelaLogin;
import TelaFuncionario.TelasCadFuncionarios;
import javax.swing.ImageIcon;
import TelaProdutos.TelaCadProdutos;
import TelaProdutos.TelaConsProduto;
import TelaCliente.TelaCadClientes;
import TelaConsultas.TelaCadConsultas;
import TelaCliente.TelaCadPet;
import TelaCliente.TelaConsClientes;
import TelaCliente.TelaConsPets;
import TelaRecepcionista.TiposDePagamentos;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class TelaMenu extends javax.swing.JFrame {

    public double total = 0.0;
    public int numeroDeCompras = 0;

    public TelaMenu() {
        super("TELA DE MENUS");
        initComponents();
        setResizable(false);
        this.setLocationRelativeTo(null);
        String caminhoImagem = "/icon/logo PET VITALLI.png";
        
         // Carrega a imagem do ícone
        ImageIcon icon = new ImageIcon(getClass().getResource( caminhoImagem ));
        // Define o ícone da janela
        this.setIconImage(icon.getImage());
        
         }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        consultaBancoCli = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        consultaBarraDeTextoPesquisa = new javax.swing.JTextPane();
        TelaDeVendas = new javax.swing.JPanel();
        CaixaDeTipoDeProdutos = new javax.swing.JComboBox<>();
        BotaoAdicionarAoCarrinho = new javax.swing.JButton();
        CampoDoPreco = new javax.swing.JTextField();
        BotaoNovaComprar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        AreaDoCarrinho = new javax.swing.JTextArea();
        Total = new javax.swing.JLabel();
        FinalizarCarrinho = new javax.swing.JButton();
        barraMenu = new javax.swing.JMenuBar();
        cadastros = new javax.swing.JMenu();
        MenuFuncionarios = new javax.swing.JMenu();
        CadFuncionarios = new javax.swing.JMenuItem();
        ConsFuncionarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu4 = new javax.swing.JMenu();
        CadClientes = new javax.swing.JMenuItem();
        ConsClientes = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        CadProdutos = new javax.swing.JMenuItem();
        ConsProdutos = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        menuSair1 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        relatorios = new javax.swing.JMenu();
        vendas = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        voltar = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 0));

        consultaBancoCli.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nome", "Numero", "Consultas"
            }
        ));
        jScrollPane1.setViewportView(consultaBancoCli);

        consultaBarraDeTextoPesquisa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Consultar Consultas", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(0, 0, 0))); // NOI18N
        jScrollPane2.setViewportView(consultaBarraDeTextoPesquisa);

        TelaDeVendas.setForeground(new java.awt.Color(193, 171, 46));

        CaixaDeTipoDeProdutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ração", "Shampoo", "Brinquedos" }));

        BotaoAdicionarAoCarrinho.setText("Adicionar");
        BotaoAdicionarAoCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoAdicionarAoCarrinhoActionPerformed(evt);
            }
        });

        CampoDoPreco.setBorder(javax.swing.BorderFactory.createTitledBorder("Preço"));
        CampoDoPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDoPrecoActionPerformed(evt);
            }
        });

        BotaoNovaComprar.setText("Nova Compra");
        BotaoNovaComprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoNovaComprarActionPerformed(evt);
            }
        });

        AreaDoCarrinho.setColumns(20);
        AreaDoCarrinho.setRows(5);
        AreaDoCarrinho.setDropMode(javax.swing.DropMode.INSERT);
        jScrollPane3.setViewportView(AreaDoCarrinho);

        Total.setText("TOTAL : R$ 0.00");

        FinalizarCarrinho.setText("Finalizar");
        FinalizarCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinalizarCarrinhoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout TelaDeVendasLayout = new javax.swing.GroupLayout(TelaDeVendas);
        TelaDeVendas.setLayout(TelaDeVendasLayout);
        TelaDeVendasLayout.setHorizontalGroup(
            TelaDeVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TelaDeVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(TelaDeVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(FinalizarCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, 87, Short.MAX_VALUE)
                    .addComponent(BotaoAdicionarAoCarrinho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(TelaDeVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaDeVendasLayout.createSequentialGroup()
                        .addGroup(TelaDeVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(CampoDoPreco)
                            .addComponent(CaixaDeTipoDeProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(BotaoNovaComprar))
                    .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        TelaDeVendasLayout.setVerticalGroup(
            TelaDeVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TelaDeVendasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TelaDeVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TelaDeVendasLayout.createSequentialGroup()
                        .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(TelaDeVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(TelaDeVendasLayout.createSequentialGroup()
                                .addGroup(TelaDeVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(CampoDoPreco)
                                    .addComponent(BotaoAdicionarAoCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(TelaDeVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(FinalizarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CaixaDeTipoDeProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(BotaoNovaComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        cadastros.setText("Cadastros/Consultas");

        MenuFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconFuncionario.png"))); // NOI18N
        MenuFuncionarios.setText("Funcionarios");

        CadFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconCadFuncionario.png"))); // NOI18N
        CadFuncionarios.setText("Cadastrar");
        CadFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadFuncionariosActionPerformed(evt);
            }
        });
        MenuFuncionarios.add(CadFuncionarios);

        ConsFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconConsFuncionario.png"))); // NOI18N
        ConsFuncionarios.setText("Consultar");
        ConsFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsFuncionariosActionPerformed(evt);
            }
        });
        MenuFuncionarios.add(ConsFuncionarios);
        MenuFuncionarios.add(jSeparator1);

        cadastros.add(MenuFuncionarios);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconCliente.png"))); // NOI18N
        jMenu4.setText("Clientes");

        CadClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconCadCleintee.png"))); // NOI18N
        CadClientes.setText("Cadastrar");
        CadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadClientesActionPerformed(evt);
            }
        });
        jMenu4.add(CadClientes);

        ConsClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconConsCliente.png"))); // NOI18N
        ConsClientes.setText("Consultar");
        ConsClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsClientesActionPerformed(evt);
            }
        });
        jMenu4.add(ConsClientes);

        cadastros.add(jMenu4);

        jMenu9.setText("Pets");

        jMenuItem4.setText("Cadastrar");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem4);

        jMenuItem5.setText("Consultar");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu9.add(jMenuItem5);

        cadastros.add(jMenu9);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconProdutos.png"))); // NOI18N
        jMenu5.setText("Produtos");

        CadProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconCadProduto.png"))); // NOI18N
        CadProdutos.setText("Cadastrar");
        CadProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadProdutosActionPerformed(evt);
            }
        });
        jMenu5.add(CadProdutos);

        ConsProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconConsProdutos.png"))); // NOI18N
        ConsProdutos.setText("Consultar");
        ConsProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsProdutosActionPerformed(evt);
            }
        });
        jMenu5.add(ConsProdutos);

        cadastros.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconCons.png"))); // NOI18N
        jMenu6.setText("Consultas");

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconCadCons.png"))); // NOI18N
        jMenuItem10.setText("Cadastrar");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem10);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconConsCons.png"))); // NOI18N
        jMenuItem11.setText("Consultar");
        jMenu6.add(jMenuItem11);

        cadastros.add(jMenu6);

        barraMenu.add(cadastros);

        menuSair1.setText("Alterar");
        menuSair1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSair1ActionPerformed(evt);
            }
        });

        jMenuItem7.setText("Funcionarios");
        menuSair1.add(jMenuItem7);

        jMenuItem6.setText("Clientes");
        menuSair1.add(jMenuItem6);

        jMenuItem8.setText("Pets");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        menuSair1.add(jMenuItem8);

        jMenuItem12.setText("Produtos");
        menuSair1.add(jMenuItem12);

        jMenuItem9.setText("Consultas");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        menuSair1.add(jMenuItem9);

        barraMenu.add(menuSair1);

        relatorios.setText("Relatorios");

        vendas.setText("Vendas");
        relatorios.add(vendas);

        barraMenu.add(relatorios);

        menuSair.setText("Sair");
        menuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSairActionPerformed(evt);
            }
        });

        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        menuSair.add(voltar);

        sair.setText("Sair");
        sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairActionPerformed(evt);
            }
        });
        menuSair.add(sair);

        barraMenu.add(menuSair);

        setJMenuBar(barraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(369, 369, 369)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TelaDeVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(TelaDeVendas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void menuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSairActionPerformed
        dispose();
    }//GEN-LAST:event_menuSairActionPerformed

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairActionPerformed
        dispose();
    }//GEN-LAST:event_sairActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed

        TelaLogin Login = new TelaLogin ();
        Login.setVisible(true);
        dispose();

    }//GEN-LAST:event_voltarActionPerformed

    private void CadFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadFuncionariosActionPerformed
     
        TelasCadFuncionarios CadFuncionarios = new TelasCadFuncionarios();
        CadFuncionarios.setVisible(true);
                
    }//GEN-LAST:event_CadFuncionariosActionPerformed

    private void CadProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadProdutosActionPerformed
        
        TelaCadProdutos CadProdutos = new TelaCadProdutos();
        CadProdutos.setVisible(true);
        
    }//GEN-LAST:event_CadProdutosActionPerformed

    private void ConsProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsProdutosActionPerformed
        
        TelaConsProduto ConsProdutos = new TelaConsProduto();
        ConsProdutos.setVisible(true);
        
    }//GEN-LAST:event_ConsProdutosActionPerformed

    private void CadClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CadClientesActionPerformed
        
        TelaCadClientes CadClientes = new TelaCadClientes();
        CadClientes.setVisible(true);
        
    }//GEN-LAST:event_CadClientesActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        TelaCadPet CadPet = new TelaCadPet();
        CadPet.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void ConsClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsClientesActionPerformed
     
        TelaConsClientes consCli = new TelaConsClientes();
        consCli.setVisible(true);
    }//GEN-LAST:event_ConsClientesActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
      
        TelaConsPets consPets = new TelaConsPets();
      consPets.setVisible(true);
      
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void BotaoAdicionarAoCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoAdicionarAoCarrinhoActionPerformed
        String tipoProdutos = (String) CaixaDeTipoDeProdutos.getSelectedItem();
        String item = "Item"; // Lógica para obter o item a ser adicionado
        double preco = Double.parseDouble(CampoDoPreco.getText()); // Obtém o preço do campo de texto
        total += preco;
        AreaDoCarrinho.append(tipoProdutos + " - R$ "  + preco + "\n");
        CampoDoPreco.setText("");
        atualizarTotal();
      
    }//GEN-LAST:event_BotaoAdicionarAoCarrinhoActionPerformed

    private void BotaoNovaComprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoNovaComprarActionPerformed

        numeroDeCompras++;
        total = 0.0;
        AreaDoCarrinho.setText("");
        atualizarTotal();
        
    }//GEN-LAST:event_BotaoNovaComprarActionPerformed

    public void atualizarTotal() {
        Total.setText("Total: R$ " + String.format("%.2f", total));
    }
    
    private void CampoDoPrecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDoPrecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoDoPrecoActionPerformed

    private void FinalizarCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinalizarCarrinhoActionPerformed
       
       TiposDePagamentos pagar =  new TiposDePagamentos();
       pagar.setVisible(true);
            
    }//GEN-LAST:event_FinalizarCarrinhoActionPerformed

    private void menuSair1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSair1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuSair1ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void ConsFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsFuncionariosActionPerformed
        TelaConsFuncionarios CadFuncionarios = new TelaConsFuncionarios();
        CadFuncionarios.setVisible(true);
    }//GEN-LAST:event_ConsFuncionariosActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
       
        TelaCadConsultas cadconsultas = new TelaCadConsultas();
        cadconsultas.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea AreaDoCarrinho;
    private javax.swing.JButton BotaoAdicionarAoCarrinho;
    private javax.swing.JButton BotaoNovaComprar;
    private javax.swing.JMenuItem CadClientes;
    private javax.swing.JMenuItem CadFuncionarios;
    private javax.swing.JMenuItem CadProdutos;
    private javax.swing.JComboBox<String> CaixaDeTipoDeProdutos;
    private javax.swing.JTextField CampoDoPreco;
    private javax.swing.JMenuItem ConsClientes;
    private javax.swing.JMenuItem ConsFuncionarios;
    private javax.swing.JMenuItem ConsProdutos;
    private javax.swing.JButton FinalizarCarrinho;
    private javax.swing.JMenu MenuFuncionarios;
    private javax.swing.JPanel TelaDeVendas;
    private javax.swing.JLabel Total;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu cadastros;
    private javax.swing.JTable consultaBancoCli;
    private javax.swing.JTextPane consultaBarraDeTextoPesquisa;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenu menuSair1;
    private javax.swing.JMenu relatorios;
    private javax.swing.JMenuItem sair;
    private javax.swing.JMenuItem vendas;
    private javax.swing.JMenuItem voltar;
    // End of variables declaration//GEN-END:variables
    private JPanel painelDoAdm;
}
