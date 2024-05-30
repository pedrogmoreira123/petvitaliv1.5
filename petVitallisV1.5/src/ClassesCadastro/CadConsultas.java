package ClassesCadastro;


import Conexao_SQL.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class CadConsultas {
        
    private String NomePet;
    private String CPF;
    private String Consulta;
    private String Dia;
    private String Hora;



    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getNomePet() {
        return NomePet;
    }

    public void setNomePet(String NomePet) {
        this.NomePet = NomePet;
    }
    
    public String getConsulta() {
        return Consulta;
    }

    public void setConsulta(String Consulta) {
        this.Consulta = Consulta;
    }

    
     public String getDia() {
        return Dia;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }
    
     public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

public void inserir(){
    
    String sql = "INSERT INTO tb_cadconsultas (CPF, NomePet , Consulta, Dia, Hora) VALUES (?, ?, ?, ?, ?)";
        ConnectionFactory factory = new ConnectionFactory();
    
    try (Connection c = factory.obtemConexao()){
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, CPF);
        ps.setString(2,NomePet);
        ps.setString(3,Consulta);
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
           
                Date utilDate = dateFormat.parse(Dia);
                java.sql.Date Diaa = new java.sql.Date(utilDate.getTime());
                ps.setDate(4, Diaa);
            
        ps.setString(5,Hora);
        ps.execute();
        
        JOptionPane.showMessageDialog(null, "Usuário Incluído com Sucesso!");
    }
    catch (Exception e){
        e.printStackTrace();
        }
    }
    
    public void atualizar (){
        //1: Definir o comando SQL
        String sql = "UPDATE tb_pessoa SET NomePet = ?, Consulta = ?, Dia = ?, Hora = ? WHERE CPF = ?";
        //2: Abrir uma conexão
        ConnectionFactory factory = new ConnectionFactory();
        try (Connection c = factory.obtemConexao()){
        //3: Pré compila o comando
        PreparedStatement ps = c.prepareStatement(sql);
        //4: Preenche os dados faltantes
        ps.setString(1, NomePet);
        ps.setString(2, Consulta);
        ps.setString(3, Dia);
        ps.setString(4, Hora);
        ps.setString(5, CPF);
        //5: Executa o comando
        ps.execute();
        }
        catch (Exception e){
        e.printStackTrace();
        
        }
    }

}