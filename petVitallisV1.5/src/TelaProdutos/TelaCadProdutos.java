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
        setResizable(false);
        String caminhoImagem = "/icon/logo PET VITALLI.png";        
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
        cadastroValidadeDeProduto = new javax.swing.JTextField();
        labelNomeDoProduto = new javax.swing.JLabel();
        labelValidadeDoProduto = new javax.swing.JLabel();
        labelTipoDeProduto = new javax.swing.JLabel();
        cadastroTipoDeProduto = new javax.swing.JComboBox<>();
        buttonInserirProd = new javax.swing.JButton();
        cadastroCodigoDoProduto = new javax.swing.JTextField();
        labelCódigoDoProduto = new javax.swing.JLabel();
        buttonAtualizarProd1 = new javax.swing.JButton();

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

        cadastroValidadeDeProduto.setAlignmentX(0.0F);
        cadastroValidadeDeProduto.setAlignmentY(0.0F);
        cadastroValidadeDeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroValidadeDeProdutoActionPerformed(evt);
            }
        });

        labelNomeDoProduto.setText("Nome do Produto");
        labelNomeDoProduto.setAlignmentY(0.0F);

        labelValidadeDoProduto.setText("Validade");
        labelValidadeDoProduto.setAlignmentY(0.0F);

        labelTipoDeProduto.setText("Tipo de Produto");
        labelTipoDeProduto.setAlignmentY(0.0F);

        cadastroTipoDeProduto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Limpeza", "Medicamento", "Utencílio", "Ração" }));
        cadastroTipoDeProduto.setAlignmentX(0.0F);
        cadastroTipoDeProduto.setAlignmentY(0.0F);
        cadastroTipoDeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroTipoDeProdutoActionPerformed(evt);
            }
        });

        buttonInserirProd.setText("Inserir");
        buttonInserirProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonInserirProdActionPerformed(evt);
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTipoDeProduto)
                            .addComponent(cadastroTipoDeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelCódigoDoProduto)
                            .addComponent(cadastroCodigoDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonAtualizarProd1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonInserirProd))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cadastroValidadeDeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(labelValidadeDoProduto)
                                .addComponent(labelNomeDoProduto)
                                .addComponent(cadastroNomeDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(buttonCadProdVoltarParaMenu)))
                .addContainerGap(153, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(86, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNomeDoProduto)
                    .addComponent(labelCódigoDoProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastroCodigoDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroNomeDoProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelValidadeDoProduto)
                    .addComponent(labelTipoDeProduto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cadastroValidadeDeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroTipoDeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonInserirProd)
                    .addComponent(buttonAtualizarProd1))
                .addGap(41, 41, 41)
                .addComponent(buttonCadProdVoltarParaMenu)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastroTipoDeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroTipoDeProdutoActionPerformed

    }//GEN-LAST:event_cadastroTipoDeProdutoActionPerformed

    private void buttonCadProdVoltarParaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadProdVoltarParaMenuActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCadProdVoltarParaMenuActionPerformed

    private void buttonInserirProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonInserirProdActionPerformed
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
                     
        if (!cadastroValidadeDeProduto.getText().isEmpty()) {
            produtos.setValidadeProduto(cadastroValidadeDeProduto.getText());
            
        }else{
            JOptionPane.showMessageDialog(null, "Campo Validade Inválido");
        }
        
        if (/*cadastroCodigoDoProduto.getText().isEmpty()
            || */cadastroValidadeDeProduto.getText().isEmpty()
            || cadastroNomeDoProduto.getText().isEmpty()) {

            //JOptionPane.showMessageDialog(null, "Preencha todos os campos corretamente");                 
        } else {        
            String codProd = (String) cadastroCodigoDoProduto.getText();
            String nomeProd = cadastroNomeDoProduto.getText();
            String tipoProd = (String) cadastroTipoDeProduto.getSelectedItem();
            String validadeProd = cadastroValidadeDeProduto.getText(); 
                        
            JOptionPane.showMessageDialog(this, "Produto cadastrado!:\n\n"
                                        + "Cód. do Produto: " + codProd + "\n"
                                        + "Nome do Produto: " + nomeProd + "\n"
                                        + "Tipo do Produto: " + tipoProd + "\n"
                                        + "Validade do Produto: " + validadeProd);
            
            produtos.setNomeProduto(cadastroNomeDoProduto.getText());
            produtos.setTipoDeProduto (cadastroTipoDeProduto.getSelectedItem().toString());
            produtos.setValidadeProduto (cadastroValidadeDeProduto.getText());
            
            produtos.salvarOuAtualizarProdutos();          
        }
        
        
    }//GEN-LAST:event_buttonInserirProdActionPerformed
      
    
    private void cadastroValidadeDeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroValidadeDeProdutoActionPerformed

    }//GEN-LAST:event_cadastroValidadeDeProdutoActionPerformed

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
                cadastroValidadeDeProduto.setText(produtos.getValidadeProduto());
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
                cadastroValidadeDeProduto.setText(produtos.getValidadeProduto());
            }
            
        }
    }     
    
    private void buttonAtualizarProd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAtualizarProd1ActionPerformed
        // TODO add your handling code here:
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
    private javax.swing.JButton buttonInserirProd;
    private javax.swing.JTextField cadastroCodigoDoProduto;
    private javax.swing.JTextField cadastroNomeDoProduto;
    private javax.swing.JComboBox<String> cadastroTipoDeProduto;
    private javax.swing.JTextField cadastroValidadeDeProduto;
    private javax.swing.JLabel labelCódigoDoProduto;
    private javax.swing.JLabel labelNomeDoProduto;
    private javax.swing.JLabel labelTipoDeProduto;
    private javax.swing.JLabel labelValidadeDoProduto;
    // End of variables declaration//GEN-END:variables
}
