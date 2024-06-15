package TelaProdutos;

import ClassesCadastro.CadProdutos;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TelaCadProdutos extends javax.swing.JFrame {
    //Creates new form TelaDeCadPro
    
    public TelaCadProdutos() {
        super("Cadastro de Produtos");
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(true);
        String caminhoImagem = "/icon/logo 100.png";        
         // Carrega a imagem do ícone
        ImageIcon icon = new ImageIcon(getClass().getResource( caminhoImagem ));
        // Define o ícone da janela
        this.setIconImage(icon.getImage());  
        
        cadastroNomeDoProduto.addFocusListener(new java.awt.event.FocusAdapter() {        
            public void focusLost(java.awt.event.FocusEvent evt) {
                cadastroNomeDoProdutoFocusLost(evt);
                }
        });    
        
        cadastroCodigoDoProduto.addFocusListener(new java.awt.event.FocusAdapter() {        
            public void focusLost(java.awt.event.FocusEvent evt) {
                cadastroCodigoDoProdutoFocusLost(evt);
                }
        });   
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonCadProdVoltarParaMenu = new javax.swing.JButton();
        cadastroNomeDoProduto = new javax.swing.JTextField();
        cadastroQuantidadeDeProduto = new javax.swing.JTextField();
        labelNomeDoProduto = new javax.swing.JLabel();
        labelQuantidadeDoProduto = new javax.swing.JLabel();
        labelTipoDeProduto = new javax.swing.JLabel();
        cadastroTipoDeProduto = new javax.swing.JComboBox<>();
        buttonConfirmarProd = new javax.swing.JButton();
        cadastroCodigoDoProduto = new javax.swing.JTextField();
        labelCódigoDoProduto = new javax.swing.JLabel();
        buttonAtualizarProd1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        buttonCadProdVoltarParaMenu.setText("Voltar");
        buttonCadProdVoltarParaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadProdVoltarParaMenuActionPerformed(evt);
            }
        });

        cadastroNomeDoProduto.setAlignmentX(0.0F);
        cadastroNomeDoProduto.setAlignmentY(0.0F);
        cadastroNomeDoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroNomeDoProdutoActionPerformed(evt);
            }
        });

        cadastroQuantidadeDeProduto.setAlignmentX(0.0F);
        cadastroQuantidadeDeProduto.setAlignmentY(0.0F);
        cadastroQuantidadeDeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroQuantidadeDeProdutoActionPerformed(evt);
            }
        });

        labelNomeDoProduto.setText("Nome do Produto");
        labelNomeDoProduto.setAlignmentY(0.0F);

        labelQuantidadeDoProduto.setText("Quantidade");
        labelQuantidadeDoProduto.setAlignmentY(0.0F);

        labelTipoDeProduto.setText("Tipo de Produto");
        labelTipoDeProduto.setAlignmentY(0.0F);

        cadastroTipoDeProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Higiene", "Medicamento", "Acessório", "Alimentação" }));
        cadastroTipoDeProduto.setAlignmentX(0.0F);
        cadastroTipoDeProduto.setAlignmentY(0.0F);
        cadastroTipoDeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroTipoDeProdutoActionPerformed(evt);
            }
        });

        buttonConfirmarProd.setText("Confirmar");
        buttonConfirmarProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfirmarProdActionPerformed(evt);
            }
        });

        cadastroCodigoDoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroCodigoDoProdutoActionPerformed(evt);
            }
        });

        labelCódigoDoProduto.setText("Código do Produto");

        buttonAtualizarProd1.setText("Excluir");
        buttonAtualizarProd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAtualizarProd1ActionPerformed(evt);
            }
        });

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Cadastro de Produto");
        jLabel11.setToolTipText("");
        jLabel11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTipoDeProduto)
                            .addComponent(cadastroTipoDeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCódigoDoProduto)
                            .addComponent(cadastroCodigoDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCadProdVoltarParaMenu))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonAtualizarProd1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonConfirmarProd))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cadastroQuantidadeDeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelQuantidadeDoProduto)
                                .addComponent(labelNomeDoProduto)
                                .addComponent(cadastroNomeDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeDoProduto)
                    .addComponent(labelCódigoDoProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastroCodigoDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroNomeDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQuantidadeDoProduto)
                    .addComponent(labelTipoDeProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastroQuantidadeDeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroTipoDeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonConfirmarProd)
                    .addComponent(buttonAtualizarProd1)
                    .addComponent(buttonCadProdVoltarParaMenu))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroTipoDeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroTipoDeProdutoActionPerformed

    }//GEN-LAST:event_cadastroTipoDeProdutoActionPerformed

    private void buttonCadProdVoltarParaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadProdVoltarParaMenuActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCadProdVoltarParaMenuActionPerformed

    private void buttonConfirmarProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfirmarProdActionPerformed
        CadProdutos produtos = new CadProdutos();          
        
        if (!cadastroCodigoDoProduto.getText().isEmpty()) {
            produtos.setCodProduto(cadastroCodigoDoProduto.getText());
            
        }else{
            JOptionPane.showMessageDialog(null, "Campo Código do Produto Inválido");
        }
        
        if (!cadastroNomeDoProduto.getText().isEmpty()) {
            produtos.setNomeProduto(cadastroNomeDoProduto.getText());
            
        }else{
            JOptionPane.showMessageDialog(null, "Campo Nome Inválido");
        }
        
        if (!cadastroTipoDeProduto.getSelectedItem().toString().isEmpty()) {
            //tipoProduto.setTipoDeProduto(cadastroTipoDeProduto.getSelectedItem().toString());
            produtos.setTipoDeProduto((String) cadastroTipoDeProduto.getSelectedItem());
            
        }else{
            JOptionPane.showMessageDialog(null, "Campo Tipo de Produto Inválido");
        }                      
                     
        if (!cadastroQuantidadeDeProduto.getText().isEmpty()) {
            produtos.setQuantidadeProduto(cadastroQuantidadeDeProduto.getText());
            
        }else{
            JOptionPane.showMessageDialog(null, "Campo Quantidade Inválido");
        }
        
        if (/*cadastroCodigoDoProduto.getText().isEmpty()
            || */cadastroQuantidadeDeProduto.getText().isEmpty()
            || cadastroNomeDoProduto.getText().isEmpty()) {

            //JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente");                 
        } else {        
            String codProd = (String) cadastroCodigoDoProduto.getText();
            String nomeProd = cadastroNomeDoProduto.getText();
            String tipoProd = (String) cadastroTipoDeProduto.getSelectedItem();
            String quantidadeProd = cadastroQuantidadeDeProduto.getText(); 
                        
            JOptionPane.showMessageDialog(this, "Produto cadastrado!:\n\n"
                                        + "Cód. do Produto: " + codProd + "\n"
                                        + "Nome do Produto: " + nomeProd + "\n"
                                        + "Tipo do Produto: " + tipoProd + "\n"
                                        + "Quantidade do Produto: " + quantidadeProd);
            
            produtos.setNomeProduto(cadastroNomeDoProduto.getText());
            produtos.setTipoDeProduto (cadastroTipoDeProduto.getSelectedItem().toString());
            produtos.setQuantidadeProduto (cadastroQuantidadeDeProduto.getText());
            
            produtos.salvarOuAtualizarProdutos();          
        }
        
        
    }//GEN-LAST:event_buttonConfirmarProdActionPerformed
      
    
    private void cadastroQuantidadeDeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroQuantidadeDeProdutoActionPerformed

    }//GEN-LAST:event_cadastroQuantidadeDeProdutoActionPerformed

    private void cadastroCodigoDoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroCodigoDoProdutoActionPerformed
        
    }//GEN-LAST:event_cadastroCodigoDoProdutoActionPerformed
        
    private void cadastroCodigoDoProdutoFocusLost(java.awt.event.FocusEvent evt) {        
        String produto = cadastroCodigoDoProduto.getText();

        if (!produto.isEmpty()) {
            CadProdutos produtos = new CadProdutos ();
            produtos = produtos.carregarPorCodigoProduto(produto);
            
            if (produtos != null) {
                cadastroNomeDoProduto.setText(produtos.getNomeProduto());
                cadastroTipoDeProduto.setSelectedItem(produtos.getTipoDeProduto());
                cadastroQuantidadeDeProduto.setText(produtos.getQuantidadeProduto());
            }
            
        }
    }     
    
    private void cadastroNomeDoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroNomeDoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroNomeDoProdutoActionPerformed

    private void cadastroNomeDoProdutoFocusLost(java.awt.event.FocusEvent evt) {        
        String produto = cadastroNomeDoProduto.getText();

        if (!produto.isEmpty()) {
            CadProdutos produtos = new CadProdutos ();
            produtos = produtos.carregarPorNome(produto);
            
            if (produtos != null) {
                cadastroCodigoDoProduto.setText(produtos.getCodProduto());
                cadastroTipoDeProduto.setSelectedItem(produtos.getTipoDeProduto());
                cadastroQuantidadeDeProduto.setText(produtos.getQuantidadeProduto());
            }
            
        }
    }     
    
    private void buttonAtualizarProd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarProd1ActionPerformed
        CadProdutos produto = new CadProdutos ();
        
        String codProd = (String) cadastroCodigoDoProduto.getText();
        
        produto.excluirProduto(codProd);
    }//GEN-LAST:event_buttonAtualizarProd1ActionPerformed
      
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
            java.util.logging.Logger.getLogger(TelaCadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaCadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaCadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaCadProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaCadProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAtualizarProd1;
    private javax.swing.JButton buttonCadProdVoltarParaMenu;
    private javax.swing.JButton buttonConfirmarProd;
    private javax.swing.JTextField cadastroCodigoDoProduto;
    private javax.swing.JTextField cadastroNomeDoProduto;
    private javax.swing.JTextField cadastroQuantidadeDeProduto;
    private javax.swing.JComboBox<String> cadastroTipoDeProduto;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel labelCódigoDoProduto;
    private javax.swing.JLabel labelNomeDoProduto;
    private javax.swing.JLabel labelQuantidadeDoProduto;
    private javax.swing.JLabel labelTipoDeProduto;
    // End of variables declaration//GEN-END:variables
}
