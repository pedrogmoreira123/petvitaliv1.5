/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TelaConsultas;
import ClassesCadastro.CadConsultatt;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.FocusEvent;



public class TelaConsConsulta extends javax.swing.JFrame {

    /**
     * Creates new form TelaConsConsulta
     */
    public TelaConsConsulta() {
        super("TELA DE CONSULTA");
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        CampoDePesquisaCPFFocusLost(null);
        String caminhoImagem = "/icon/logo PET VITALLI.png";        
         // Carrega a imagem do ícone
        ImageIcon icon = new ImageIcon(getClass().getResource( caminhoImagem ));
        // Define o ícone da janela
        this.setIconImage(icon.getImage());
        
             CampoDePesquisaCPF.addFocusListener(new java.awt.event.FocusAdapter() {
             public void focusLost(java.awt.event.FocusEvent evt) {
             CampoDePesquisaCPFFocusLost(evt);

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

        consultaProdPesquisarBotao = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        consultaBancoConsultas = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        CampoDePesquisaCPF = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        consultaProdPesquisarBotao.setText("...");

        consultaBancoConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CPF Do Cliente", "Nome Do Pet", "Tipo de Consulta", "Dia e Hora"
            }
        ));
        jScrollPane1.setViewportView(consultaBancoConsultas);
        if (consultaBancoConsultas.getColumnModel().getColumnCount() > 0) {
            consultaBancoConsultas.getColumnModel().getColumn(0).setHeaderValue("CPF Do Cliente");
            consultaBancoConsultas.getColumnModel().getColumn(1).setHeaderValue("Nome Do Pet");
            consultaBancoConsultas.getColumnModel().getColumn(2).setHeaderValue("Tipo de Consulta");
            consultaBancoConsultas.getColumnModel().getColumn(3).setHeaderValue("Dia e Hora");
        }

        jLabel1.setText("Digite o CPF");

        CampoDePesquisaCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDePesquisaCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CampoDePesquisaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 605, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(consultaProdPesquisarBotao, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 794, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(consultaProdPesquisarBotao)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CampoDePesquisaCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoDePesquisaCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDePesquisaCPFActionPerformed
      
    }//GEN-LAST:event_CampoDePesquisaCPFActionPerformed

    private void CampoDePesquisaCPFFocusLost(java.awt.event.FocusEvent evt) {
        
         String cpf = CampoDePesquisaCPF.getText().trim();

    if (cpf.isEmpty()) {
        // Se o campo de pesquisa estiver vazio, mostramos todos os registros
        showAllRecords();
    } else {
        // Caso contrário, pesquisamos por um CPF específico
        searchByCPF(cpf);
        }
    }        

  
    private void searchByCPF(String cpf) {
            CadConsultatt consulta = new CadConsultatt();
            CadConsultatt rs = consulta.loadByCPF(cpf);

            if (rs != null) {
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("CPF do Cliente");
                model.addColumn("Nome do Pet");
                model.addColumn("Tipo de Consulta");
                model.addColumn("Dia e Hora");

            String cpfCliente = rs.getCPF();
            String nomePet = rs.getNomePet();
            String tipoConsulta = rs.getConsulta();
            String diaHora = rs.getDia() + " " + rs.getHora();
            model.addRow(new Object[]{cpfCliente, nomePet, tipoConsulta, diaHora});


                consultaBancoConsultas.setModel(model);
            } else {
                JOptionPane.showMessageDialog(null, "CPF não encontrado.");
            }
        }

        private void showAllRecords() {
            
            CadConsultatt consulta = new CadConsultatt();
            ResultSet rs = consulta.TodosDados();

            if (rs != null) {
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("CPF do Cliente");
                model.addColumn("Nome do Pet");
                model.addColumn("Tipo de Consulta");
                model.addColumn("Dia e Hora");

                try {
                    while (rs.next()) {
                        String cpfCliente = rs.getString("cpf");
                        String nomePet = rs.getString("nomePet");
                        String tipoConsulta = rs.getString("consulta");
                        String diaHora = rs.getString("dia") + " " + rs.getString("hora");
                        model.addRow(new Object[]{cpfCliente, nomePet, tipoConsulta, diaHora});
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }

                consultaBancoConsultas.setModel(model);
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
            java.util.logging.Logger.getLogger(TelaConsConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaConsConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaConsConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaConsConsulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaConsConsulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CampoDePesquisaCPF;
    private javax.swing.JTable consultaBancoConsultas;
    private javax.swing.JButton consultaProdPesquisarBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
