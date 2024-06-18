package TelaProdutos;

import TelaProdutos.TelaCadProdutos;
import javax.swing.ImageIcon;
import ClassesCadastro.CadProdutos;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaConsProduto extends javax.swing.JFrame {

    /**
     * Creates new form TelaConsProduto
     */
    public TelaConsProduto() {
        super("Produtos");
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(true);
        consultaBarraDeTextoPesquisaFocusLost (null);
        String caminhoImagem = "/icon/logo 100.png";
        
        // Carrega a imagem do ícone
        ImageIcon icon = new ImageIcon(getClass().getResource( caminhoImagem ));
        
        // Define o ícone da janela
        this.setIconImage(icon.getImage());
        
        consultaBarraDeTextoPesquisa.addFocusListener(new java.awt.event.FocusAdapter() {        
            public void focusLost(java.awt.event.FocusEvent evt) {
                consultaBarraDeTextoPesquisaFocusLost(evt);
                }
        });     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        consultaBancoProdutos = new javax.swing.JTable();
        consProdCriarNovoBotao = new javax.swing.JButton();
        consultaProdPesquisarBotao = new javax.swing.JButton();
        consultaBarraDeTextoPesquisa = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        consultaBancoProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Código do Produto", "Nome do Produto", "Tipo do Produto", "Quantidade do Produto"
            }
        ));
        consultaBancoProdutos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(consultaBancoProdutos);

        consProdCriarNovoBotao.setBackground(new java.awt.Color(255, 183, 101));
        consProdCriarNovoBotao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        consProdCriarNovoBotao.setForeground(new java.awt.Color(0, 0, 0));
        consProdCriarNovoBotao.setText("Criar Novo");
        consProdCriarNovoBotao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        consProdCriarNovoBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consProdCriarNovoBotaoActionPerformed(evt);
            }
        });

        consultaProdPesquisarBotao.setBackground(new java.awt.Color(255, 183, 101));
        consultaProdPesquisarBotao.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        consultaProdPesquisarBotao.setForeground(new java.awt.Color(0, 0, 0));
        consultaProdPesquisarBotao.setText("Pesquisar");
        consultaProdPesquisarBotao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        consultaProdPesquisarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaProdPesquisarBotaoActionPerformed(evt);
            }
        });

        consultaBarraDeTextoPesquisa.setBackground(new java.awt.Color(255, 183, 101));
        consultaBarraDeTextoPesquisa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        consultaBarraDeTextoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaBarraDeTextoPesquisaActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 183, 101));
        jPanel1.setForeground(new java.awt.Color(255, 183, 101));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CODIGO DO PRODUTO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(794, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(358, Short.MAX_VALUE))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(880, 880, 880)
                .addComponent(consProdCriarNovoBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(704, 704, 704)
                .addComponent(consultaProdPesquisarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(consultaBarraDeTextoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 945, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(consProdCriarNovoBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(consultaProdPesquisarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(consultaBarraDeTextoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consProdCriarNovoBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consProdCriarNovoBotaoActionPerformed
        TelaCadProdutos CadProd = new TelaCadProdutos ();
        CadProd.setVisible(true);
    }//GEN-LAST:event_consProdCriarNovoBotaoActionPerformed

    private void consultaProdPesquisarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaProdPesquisarBotaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultaProdPesquisarBotaoActionPerformed

    private void consultaBarraDeTextoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaBarraDeTextoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultaBarraDeTextoPesquisaActionPerformed

    private void consultaBarraDeTextoPesquisaFocusLost(java.awt.event.FocusEvent evt) {        
        String produto = consultaBarraDeTextoPesquisa.getText().trim();

        if (produto.isEmpty()) {
            // Se o campo de pesquisa estiver vazio, mostramos todos os registros
            todosRegistrosProdutos();
        } else {
            // Caso contrário, pesquisamos por um Produto específico
            procurarPorNomeProduto(produto);
        }
    }        
    
    private void procurarPorNomeProduto(String produto) {
        CadProdutos consultaProdNome = new CadProdutos();
        CadProdutos rs = consultaProdNome.carregarPorNome(produto);

        if (rs != null) {
            DefaultTableModel model = new DefaultTableModel();
            model.addColumn("Código do Produto");
            model.addColumn("Nome do Produto");
            model.addColumn("Tipo do Produto");
            model.addColumn("Quantidade do Produto");

            String codProduto = rs.getCodProduto();
            String nomeProduto = rs.getNomeProduto();
            String tipoProduto = rs.getTipoDeProduto();
            String quantidadeProduto = rs.getQuantidadeProduto();

            model.addRow(new Object[]{codProduto, nomeProduto, tipoProduto, quantidadeProduto});

            consultaBancoProdutos.setModel(model);
        } else {
            JOptionPane.showMessageDialog(null, "O produto digitado não existe.");
        }
    }

    private void todosRegistrosProdutos() {
    CadProdutos consultaProd = new CadProdutos();        
    ResultSet rs = consultaProd.TodosDadosProdutos();

    if (rs != null) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Código do Produto");
        model.addColumn("Nome do Produto");
        model.addColumn("Tipo do Produto");
        model.addColumn("Quantidade do Produto");

        try {
            while (rs.next()) {
                String codProd = rs.getString("codigoProduto");
                String nomeProd = rs.getString("nomeProduto");
                String tipoProd = rs.getString("tipoProduto");
                String quantidadeProd = rs.getString("quantidadeProduto");
                model.addRow(new Object[]{codProd, nomeProd, tipoProd, quantidadeProd});
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        consultaBancoProdutos.setModel(model);
    } else {
        JOptionPane.showMessageDialog(null, "Não há registros no banco de dados.");
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
            java.util.logging.Logger.getLogger(TelaConsProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsProduto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton consProdCriarNovoBotao;
    private javax.swing.JTable consultaBancoProdutos;
    private javax.swing.JTextField consultaBarraDeTextoPesquisa;
    private javax.swing.JButton consultaProdPesquisarBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
