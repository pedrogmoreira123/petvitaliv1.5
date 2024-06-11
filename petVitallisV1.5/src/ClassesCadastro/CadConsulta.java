 package ClassesCadastro;

import Conexao_SQL.ConnectionFactory;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CadConsulta {
    
    ConnectionFactory factory = new ConnectionFactory();
    private String Codigo;
    private String nomePet;
    private String CPF;
    private String consulta;
    private String dia;
    private String hora;
    private int valor;
    
    
     public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getnomePet() {
        return nomePet;
    }

    public void setnomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getconsulta() {
        return consulta;
    }

    public void setconsulta(String consulta) {
        this.consulta = consulta;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
    
    public int getvalor() {
        return valor;
    }

    public void setvalor(int valor) {
        this.valor = valor;
    }
    
    public CadConsulta(){
    
    }

     public CadConsulta(String Codigo, String nomePet, String CPF, String consulta, String dia, String hora, int valor) {
        this.Codigo = Codigo;
        this.nomePet = nomePet;
        this.CPF = CPF;
        this.consulta = consulta;
        this.dia = dia;
        this.hora = hora;
        this.valor = valor;
    }
    
    
       public void inserirConsultas() {
        String query = "INSERT INTO tb_cadconsultas  (Código, cpf, NomePet, consulta, Dia, Hora) VALUES ( ?, ?, ?, ?, ?, ?)";
        try (Connection conn = factory.obtemConexao();
            PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, Codigo);
            pstmt.setString(2, CPF);
            pstmt.setString(3, nomePet);
            pstmt.setString(4, consulta);
            pstmt.setString(5, dia);
            pstmt.setString(6, hora);
            pstmt.executeUpdate();
            
           JOptionPane.showMessageDialog(null,nomePet +", Consulta Registrada com sucesso!"); 

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
       
       
        public void alterarConsultas() {
        String query = "UPDATE tb_cadconsultas  SET consulta = ?, dia = ?, hora = ? WHERE cpf = ?";
        try (Connection conn = factory.obtemConexao();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, consulta);
            pstmt.setString(2, dia);
            pstmt.setString(3, hora);
            pstmt.setString(4, CPF);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



       public List<CadConsulta> ListarConsultas(){
       try{
           List<CadConsulta> lista = new ArrayList<CadConsulta>();
           String sql= "SELECT*FROM tb_cadconsultas";
           
           Connection conn = factory.obtemConexao();
           PreparedStatement pstmt = conn.prepareStatement(sql);
           
           ResultSet rs= pstmt.executeQuery();
           
           while(rs.next()){
            CadConsulta cons = new CadConsulta();
            cons.setCodigo(rs.getString("Código"));
            cons.setnomePet(rs.getString("NomePet"));
            cons.setCPF(rs.getString("cpf"));
            cons.setconsulta(rs.getString("Consulta"));
            cons.setDia(rs.getString("Dia"));
            cons.setHora(rs.getString("Hora"));
         
           
            lista.add(cons);
            
           }
           return lista;
        }catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
   
   }
   
   public List<CadConsulta> ListarConsultaPorCpf(String Cpf){
       try{
           List<CadConsulta> lista=new ArrayList<CadConsulta>();
           String sql= "SELECT*FROM tb_cadconsultas WHERE cpf = ? , NomePet = ?";
           
           Connection conn = factory.obtemConexao();
           PreparedStatement pstmt = conn.prepareStatement(sql);
           pstmt.setString(1, Cpf);
           
           ResultSet rs= pstmt.executeQuery();
           
           while(rs.next()){
            CadConsulta cons = new CadConsulta();
            cons.setCodigo(rs.getString("Código"));
            cons.setnomePet(rs.getString("NomePet"));
            cons.setCPF(rs.getString("cpf"));
            cons.setconsulta(rs.getString("Consulta"));
            cons.setDia(rs.getString("Dia"));
            cons.setHora(rs.getString("Hora"));
           
            lista.add(cons);
           }
           return lista;
           
        }catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
   
   }  

        
}