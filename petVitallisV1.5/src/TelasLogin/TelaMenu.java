package TelasLogin;

import Conexao_SQL.ConnectionFactory;
import TelaRelatorios.TelaRelCliEPet;
import TelaFuncionario.TelaConsFuncionarios;
import TelaFuncionario.TelasCadFuncionarios;
import javax.swing.*;
import TelaProdutos.TelaCadProdutos;
import TelaProdutos.TelaConsProduto;
import TelaConsultas.TelaAlterarDeleteConsulta;
import TelaConsultas.TelaCadConsultas;
import TelaPet.TelaCadPet;
import TelaPet.TelaConsultarAlterarPets;
import TelaRelatorios.TelaRelConsultas;
import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

public class TelaMenu extends javax.swing.JFrame {
    
    public double total = 0.0;
    public int numeroDeCompras = 0;
    private String cargo;
    
    public TelaMenu(String cargo) {
        super("TELA DE MENUS");
        initComponents();
        setResizable(false);
        this.setLocationRelativeTo(null);
        this.cargo=cargo;
        String caminhoImagem = "/icon/logo 100.png";
         // Carrega a imagem do ícone
        ImageIcon icon = new ImageIcon(getClass().getResource( caminhoImagem ));
        // Define o ícone da janela
        this.setIconImage(icon.getImage());
        configurarVisibilidadeItensMenu(cargo);
        carregarDados();
 }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoNovaComprar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        AreaDoCarrinho = new javax.swing.JTextArea();
        Total = new javax.swing.JLabel();
        FinalizarCarrinho = new javax.swing.JButton();
        CaixaDeTipoDeProdutos = new javax.swing.JComboBox<>();
        BotaoAdicionarAoCarrinho = new javax.swing.JButton();
        CampoDoPreco = new javax.swing.JTextField();
        dbAgendamento = new javax.swing.JPanel();
        textAgendamento = new javax.swing.JLabel();
        dbTabelaAgendamentos = new javax.swing.JScrollPane();
        TabelaAgendamentos = new JTable();
        IconMenu = new javax.swing.JLabel();
        barraMenu = new javax.swing.JMenuBar();
        cadastrosConsultas = new javax.swing.JMenu();
        MenuFuncionarios = new javax.swing.JMenu();
        CadFuncionarios = new javax.swing.JMenuItem();
        ConsFuncionarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        MenuPets = new javax.swing.JMenu();
        CadClientes = new javax.swing.JMenuItem();
        ConsClientes = new javax.swing.JMenuItem();
        MenuProdutos = new javax.swing.JMenu();
        CadProdutos = new javax.swing.JMenuItem();
        ConsProdutos = new javax.swing.JMenuItem();
        MenuConsultas = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        relatorios = new javax.swing.JMenu();
        relCliPet = new javax.swing.JMenuItem();
        relConsultas = new javax.swing.JMenuItem();
        menuSair = new javax.swing.JMenu();
        voltar = new javax.swing.JMenuItem();
        sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 222, 173));

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

        CaixaDeTipoDeProdutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ração", "Shampoo", "Brinquedos" }));
        CaixaDeTipoDeProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CaixaDeTipoDeProdutosActionPerformed(evt);
            }
        });

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

        dbAgendamento.setForeground(new java.awt.Color(255, 222, 173));

        textAgendamento.setBackground(new java.awt.Color(0, 0, 0));
        textAgendamento.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        textAgendamento.setText("CONSULTAS PARA HOJE:");

        TabelaAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CPF", "Nome do Pet", "Consulta", "Hora"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        dbTabelaAgendamentos.setViewportView(TabelaAgendamentos);

        javax.swing.GroupLayout dbAgendamentoLayout = new javax.swing.GroupLayout(dbAgendamento);
        dbAgendamento.setLayout(dbAgendamentoLayout);
        dbAgendamentoLayout.setHorizontalGroup(
            dbAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dbTabelaAgendamentos, javax.swing.GroupLayout.DEFAULT_SIZE, 669, Short.MAX_VALUE)
            .addGroup(dbAgendamentoLayout.createSequentialGroup()
                .addGap(264, 264, 264)
                .addComponent(textAgendamento)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dbAgendamentoLayout.setVerticalGroup(
            dbAgendamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dbAgendamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textAgendamento)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dbTabelaAgendamentos, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
        );

        IconMenu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        IconMenu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/logo 100.png"))); // NOI18N

        barraMenu.setBackground(new java.awt.Color(255, 134, 47));
        barraMenu.setForeground(new java.awt.Color(255, 134, 47));

        cadastrosConsultas.setBackground(new java.awt.Color(255, 134, 47));
        cadastrosConsultas.setForeground(new java.awt.Color(0, 0, 0));
        MenuFuncionarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconFuncionario.png"))); // Ícone do menu
        cadastrosConsultas.setText("Cadastros/Consultas");

        MenuFuncionarios.setBackground(new java.awt.Color(255, 134, 47));
        MenuFuncionarios.setForeground(new java.awt.Color(0, 0, 0));
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

        cadastrosConsultas.add(MenuFuncionarios);

        MenuPets.setBackground(new java.awt.Color(255, 134, 47));
        MenuPets.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        MenuPets.setForeground(new java.awt.Color(0, 0, 0));
        MenuPets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconCliente.png"))); // NOI18N
        MenuPets.setText("Pets");

        CadClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconCadCleintee.png"))); // NOI18N
        CadClientes.setText("Cadastrar");
        CadClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadClientesActionPerformed(evt);
            }
        });
        MenuPets.add(CadClientes);

        ConsClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconConsCliente.png"))); // NOI18N
        ConsClientes.setText("Consultar/Alterar");
        ConsClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsClientesActionPerformed(evt);
            }
        });
        MenuPets.add(ConsClientes);

        cadastrosConsultas.add(MenuPets);

        MenuProdutos.setBackground(new java.awt.Color(255, 134, 47));
        MenuProdutos.setForeground(new java.awt.Color(0, 0, 0));
        MenuProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconProdutos.png"))); // NOI18N
        MenuProdutos.setText("Produtos");

        CadProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconCadProduto.png"))); // NOI18N
        CadProdutos.setText("Cadastrar");
        CadProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CadProdutosActionPerformed(evt);
            }
        });
        MenuProdutos.add(CadProdutos);

        ConsProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconConsProdutos.png"))); // NOI18N
        ConsProdutos.setText("Consultar");
        ConsProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsProdutosActionPerformed(evt);
            }
        });
        MenuProdutos.add(ConsProdutos);

        cadastrosConsultas.add(MenuProdutos);

        MenuConsultas.setBackground(new java.awt.Color(255, 134, 47));
        MenuConsultas.setForeground(new java.awt.Color(0, 0, 0));
        MenuConsultas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconCons.png"))); // NOI18N
        MenuConsultas.setText("Consultas");

        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconCadCons.png"))); // NOI18N
        jMenuItem10.setText("Cadastrar");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        MenuConsultas.add(jMenuItem10);

        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/IconConsCons.png"))); // NOI18N
        jMenuItem11.setText("Consultar");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        MenuConsultas.add(jMenuItem11);

        cadastrosConsultas.add(MenuConsultas);

        barraMenu.add(cadastrosConsultas);

        relatorios.setBackground(new java.awt.Color(255, 134, 47));
        relatorios.setForeground(new java.awt.Color(0, 0, 0));
        relatorios.setText("Relatorios");

        relCliPet.setText("Clientes e Pets");
        relCliPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relCliPetActionPerformed(evt);
            }
        });
        relatorios.add(relCliPet);

        relConsultas.setText("Consultas Marcadas");
        relConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                relConsultasActionPerformed(evt);
            }
        });
        relatorios.add(relConsultas);

        barraMenu.add(relatorios);

        menuSair.setBackground(new java.awt.Color(255, 134, 47));
        menuSair.setForeground(new java.awt.Color(0, 0, 0));
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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(dbAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(467, 467, 467)
                        .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(BotaoAdicionarAoCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CampoDoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(CaixaDeTipoDeProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addComponent(BotaoNovaComprar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(368, 368, 368)
                        .addComponent(FinalizarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addComponent(IconMenu)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(369, 369, 369)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(473, 473, 473)
                        .addComponent(FinalizarCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(IconMenu)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dbAgendamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(Total, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(BotaoAdicionarAoCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(CampoDoPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(CaixaDeTipoDeProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(BotaoNovaComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(9, 9, 9))
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
        
        TelaCadPet CadPet = new TelaCadPet();
        CadPet.setVisible(true);
        
    }//GEN-LAST:event_CadClientesActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        
        TelaCadPet CadPet = new TelaCadPet();
        CadPet.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void ConsClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsClientesActionPerformed
     
        TelaConsultarAlterarPets consCli = new TelaConsultarAlterarPets();
        consCli.setVisible(true);
    }//GEN-LAST:event_ConsClientesActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

      
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
       
    }//GEN-LAST:event_FinalizarCarrinhoActionPerformed

    private void ConsFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsFuncionariosActionPerformed

        TelaConsFuncionarios CadFuncionarios = new TelaConsFuncionarios();
        CadFuncionarios.setVisible(true);
        
    }//GEN-LAST:event_ConsFuncionariosActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
       
        TelaCadConsultas cadconsultas = new TelaCadConsultas();
        cadconsultas.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem10ActionPerformed
    private void carregarDados() {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Criação de instância de ConnectionFactory
            ConnectionFactory connectionFactory = new ConnectionFactory();

            // Obtenção da conexão
            conn = connectionFactory.obtemConexao();

            // Verificação se a conexão foi estabelecida
            if (conn != null) {
                // SQL para seleção dos dados
                String sql = "SELECT cpf, nomepet, consulta, hora FROM tb_cadconsultas";
                stmt = conn.prepareStatement(sql);

                // Execução da consulta
                rs = stmt.executeQuery();

                // Verificação se o ResultSet não é nulo
                if (rs != null) {
                    // Mapeamento entre os nomes das colunas retornadas pela consulta SQL e os cabeçalhos personalizados
            Map<String, String> columnMapping = new HashMap<>();
            columnMapping.put("cpf", "CPF");
            columnMapping.put("nomepet", "Nome do Pet");
            columnMapping.put("consulta", "Consulta");
            columnMapping.put("hora", "Hora");

                // Preparação do modelo da tabela
            DefaultTableModel model = new DefaultTableModel() {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }
            };

                // Definição dos nomes das colunas
            String[] colunas = {"cpf", "nomepet", "consulta", "hora"};
            model.setColumnIdentifiers(colunas);

                // Setando o model na tabela
            TabelaAgendamentos.setModel(model);

                // Adição das linhas
            Vector<Object> row;
            while (rs.next()) {
                row = new Vector<>(colunas.length);
                for (String coluna : colunas) {
                    row.add(rs.getObject(coluna)); // Adiciona os valores das colunas
                }
                model.addRow(row);
            }

                Vector<String> newColumnNames = new Vector<>();
                for (int i = 0; i < model.getColumnCount(); i++) {
                    String columnName = model.getColumnName(i);
                    if (columnMapping.containsKey(columnName)) {
                        newColumnNames.add(columnMapping.get(columnName));
                    } else {
                        newColumnNames.add(columnName); // Mantém o nome original da coluna se não houver mapeamento
                        }
                    }
                    model.setColumnIdentifiers(newColumnNames);
                } else {
                    System.out.println("O ResultSet está vazio.");
                }
            } else {
                System.out.println("Erro ao conectar ao banco de dados.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
     
        TelaAlterarDeleteConsulta cons = new TelaAlterarDeleteConsulta();
        cons.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void CaixaDeTipoDeProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CaixaDeTipoDeProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CaixaDeTipoDeProdutosActionPerformed

    private void relCliPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relCliPetActionPerformed
        TelaRelCliEPet relatorio = new TelaRelCliEPet ();
        relatorio.setVisible(true);
    }//GEN-LAST:event_relCliPetActionPerformed

    private void relConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_relConsultasActionPerformed
        TelaRelConsultas relatorio = new TelaRelConsultas ();
        relatorio.setVisible(true);
    }//GEN-LAST:event_relConsultasActionPerformed

    private void configurarVisibilidadeItensMenu(String cargo) {
       
        if (!"adm".equals(cargo)) {
            // Não é administrador, oculta os itens
            MenuFuncionarios.setVisible(false);
            MenuPets.setVisible(true);
            MenuProdutos.setVisible(false);
            MenuConsultas.setVisible(true);
      
        } else  {
            // Se for administrador, tudo é visível
            MenuFuncionarios.setVisible(true);
            MenuPets.setVisible(true);
            MenuProdutos.setVisible(true);
            MenuConsultas.setVisible(true);
            
            }
       
    }
    
    /**
     * @param args the command line arguments
     */
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu("cargo").setVisible(true);
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
    private javax.swing.JLabel IconMenu;
    private javax.swing.JMenu MenuConsultas;
    private javax.swing.JMenu MenuFuncionarios;
    private javax.swing.JMenu MenuPets;
    private javax.swing.JMenu MenuProdutos;
    private javax.swing.JTable TabelaAgendamentos;
    private javax.swing.JLabel Total;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JMenu cadastrosConsultas;
    private javax.swing.JPanel dbAgendamento;
    private javax.swing.JScrollPane dbTabelaAgendamentos;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuSair;
    private javax.swing.JMenuItem relCliPet;
    private javax.swing.JMenuItem relConsultas;
    private javax.swing.JMenu relatorios;
    private javax.swing.JMenuItem sair;
    private javax.swing.JLabel textAgendamento;
    private javax.swing.JMenuItem voltar;
    // End of variables declaration//GEN-END:variables
   
}
