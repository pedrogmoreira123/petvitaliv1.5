package ClassesCadastro;

import Conexao_SQL.ConnectionFactory;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.view.JasperViewer;

public class ConexaoRelatorio {
    
    public void carregarRelatorio(String caminho_relatorio, Map<String, Object> parametros) {
    try { 
        ConnectionFactory c = new ConnectionFactory();
        JasperReport relatorio = JasperCompileManager.compileReport(caminho_relatorio);              
        JasperPrint relatorio_preenchido = JasperFillManager.fillReport(relatorio, parametros, c.obtemConexao());
        JasperViewer viewer = new JasperViewer(relatorio_preenchido, false);
            viewer.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); // Configura para fechar apenas a janela do relatório
            viewer.setVisible(true);
           } catch (Exception e){
               JOptionPane.showMessageDialog(null, e);
           
        }
    }
    public void salvarRelatorioPdf(String caminho_relatorio, Map<String, Object> parametros, String caminho_destino) {
        try { 
            ConnectionFactory c = new ConnectionFactory();
            JasperReport relatorio = JasperCompileManager.compileReport(caminho_relatorio);              
            JasperPrint relatorio_preenchido = JasperFillManager.fillReport(relatorio, parametros, c.obtemConexao());
            
            // Exporta o relatório para um arquivo PDF
            JasperExportManager.exportReportToPdfFile(relatorio_preenchido, caminho_destino);
          
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }    
}
