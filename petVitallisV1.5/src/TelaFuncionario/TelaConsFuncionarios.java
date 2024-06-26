package TelaFuncionario;

import ClassesCadastro.CadFuncionario;
import ClassesCadastro.CadPets;
import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TelaConsFuncionarios extends javax.swing.JFrame implements java.awt.event.WindowListener  {

    /**
     * Creates new form TelaConsProduto
     */
    public TelaConsFuncionarios() {
        super("Consulta de Funcionarios");
        initComponents();
        addWindowListener((WindowListener) this);
        this.setLocationRelativeTo(null);
        setResizable(true);
        String caminhoImagem = "/icon/logo 100.png";        
         // Carrega a imagem do ícone
        ImageIcon icon = new ImageIcon(getClass().getResource( caminhoImagem ));
        // Define o ícone da janela
        this.setIconImage(icon.getImage());
        
        
        setBackground(new Color(255,183,101));
        consultaBancoFuncionarios.setSelectionBackground(Color.YELLOW);
    }
  
   
  
    
    
 public void windowActivated(WindowEvent e) {
        this.Listar();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotaoSairAlterar = new javax.swing.JButton();
        consultaProdPesquisarBotao = new javax.swing.JButton();
        consultaBarraDeTextoPesquisa = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        consultaBancoFuncionarios = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        BotaoSairAlterar.setBackground(new java.awt.Color(255, 183, 101));
        BotaoSairAlterar.setForeground(new java.awt.Color(0, 0, 0));
        BotaoSairAlterar.setText("Sair");
        BotaoSairAlterar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        BotaoSairAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoSairAlterarActionPerformed(evt);
            }
        });

        consultaProdPesquisarBotao.setBackground(new java.awt.Color(255, 183, 101));
        consultaProdPesquisarBotao.setForeground(new java.awt.Color(0, 0, 0));
        consultaProdPesquisarBotao.setText("+");
        consultaProdPesquisarBotao.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        consultaProdPesquisarBotao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaProdPesquisarBotaoActionPerformed(evt);
            }
        });

        consultaBarraDeTextoPesquisa.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), java.awt.Color.white, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255)));
        consultaBarraDeTextoPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaBarraDeTextoPesquisaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("CPF");

        consultaBancoFuncionarios.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0), new java.awt.Color(0, 0, 0)));
        consultaBancoFuncionarios.setForeground(new java.awt.Color(0, 0, 0));
        consultaBancoFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CPF", "Nome do Funcionario", "Data De Nascimento", "Cargo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        consultaBancoFuncionarios.setSelectionBackground(new java.awt.Color(255, 183, 101));
        jScrollPane1.setViewportView(consultaBancoFuncionarios);
        if (consultaBancoFuncionarios.getColumnModel().getColumnCount() > 0) {
            consultaBancoFuncionarios.getColumnModel().getColumn(0).setPreferredWidth(150);
            consultaBancoFuncionarios.getColumnModel().getColumn(1).setPreferredWidth(150);
            consultaBancoFuncionarios.getColumnModel().getColumn(2).setPreferredWidth(150);
            consultaBancoFuncionarios.getColumnModel().getColumn(3).setPreferredWidth(150);
        }

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(consultaBarraDeTextoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(consultaProdPesquisarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoSairAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 790, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1))
                    .addComponent(consultaBarraDeTextoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(consultaProdPesquisarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotaoSairAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoSairAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoSairAlterarActionPerformed
        dispose();
    }//GEN-LAST:event_BotaoSairAlterarActionPerformed

    private void consultaProdPesquisarBotaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaProdPesquisarBotaoActionPerformed
        TelasCadFuncionarios CadProd = new TelasCadFuncionarios ();
        CadProd.setVisible(true);
    }//GEN-LAST:event_consultaProdPesquisarBotaoActionPerformed

    private void consultaBarraDeTextoPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaBarraDeTextoPesquisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_consultaBarraDeTextoPesquisaActionPerformed
    
    public void Listar(){
       try{
           CadFuncionario funs = new CadFuncionario();
           List<CadFuncionario> listadeFuns = funs.ListarFuncionarios();

           DefaultTableModel model = (DefaultTableModel) consultaBancoFuncionarios.getModel();
           model.setNumRows(0);
           
           for(CadFuncionario v : listadeFuns ){
               model.addRow(new Object[]{
               v.getCpf(),
               v.getNome(),
               v.getDataDeNascimento(),
               v.getCargoFun(),   
               });
           }
       
       }catch(Exception e){

    }
   }
    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaConsFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsFuncionarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsFuncionarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoSairAlterar;
    private javax.swing.JTable consultaBancoFuncionarios;
    private javax.swing.JTextField consultaBarraDeTextoPesquisa;
    private javax.swing.JButton consultaProdPesquisarBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
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
