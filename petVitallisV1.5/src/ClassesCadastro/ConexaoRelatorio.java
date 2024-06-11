package ClassesCadastro;

import Conexao_SQL.ConnectionFactory;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
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
        JasperViewer.viewReport(relatorio_preenchido);
      
           } catch (Exception e){
               JOptionPane.showMessageDialog(null, e);
        }
    }
}
