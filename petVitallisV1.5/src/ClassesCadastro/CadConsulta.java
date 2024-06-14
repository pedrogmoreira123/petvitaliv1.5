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
    
    private String nomePet;
    private String CPF;
    private String Sexo;
    private String raca;
    private String idade;
    private String consulta;
    private String dia;
    private String hora;
    private int valor;
    
   
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

      public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
    
      public String getraca() {
        return raca;
    }

    public void setraca(String raca) {
        this.raca = raca;
    }
    
    
      public String getidade() {
        return idade;
    }

    public void setidade(String idade) {
        this.idade = idade;
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
        public CadConsulta(String nomePet, String CPF, String Sexo, String raca, String idade, String consulta, String dia, String hora, int valor) {
        this.nomePet = nomePet;
        this.CPF = CPF;
        this.Sexo = Sexo;
        this.raca = raca;
        this.idade = idade;
        this.consulta = consulta;
        this.dia = dia;
        this.hora = hora;
        this.valor = valor;
    }
    
       public void inserirConsultas() {
        String query = "INSERT INTO tb_cadconsultas ( cpf, NomePet, sexo, raca, idade, consulta,Dia, Hora) VALUES ( ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try (Connection conn = factory.obtemConexao();
            PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, CPF);
            pstmt.setString(2, nomePet);
            pstmt.setString(3, Sexo);
            pstmt.setString(4, raca);
            pstmt.setString(5, idade);
            pstmt.setString(6, consulta);
            pstmt.setString(7, dia);
            pstmt.setString(8, hora);
           
            pstmt.execute();
            
           JOptionPane.showMessageDialog(null,nomePet +", Consulta Registrada com sucesso!"); 

        } catch (SQLException e) {
            e.printStackTrace();
           JOptionPane.showMessageDialog(null, "Erro ao inserir consulta no banco de dados: " + e.getMessage());
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
            cons.setnomePet(rs.getString("NomePet"));
            cons.setCPF(rs.getString("cpf"));
            cons.setSexo(rs.getString("sexo"));
            cons.setraca(rs.getString("raca"));
            cons.setidade(rs.getString("idade"));
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
           String sql= "SELECT*FROM tb_cadconsultas WHERE cpf = ?";
           
           Connection conn = factory.obtemConexao();
           PreparedStatement pstmt = conn.prepareStatement(sql);
           pstmt.setString(1, Cpf);
           
           ResultSet rs= pstmt.executeQuery();
           
           while(rs.next()){
            CadConsulta cons = new CadConsulta();
            cons.setnomePet(rs.getString("NomePet"));
            cons.setCPF(rs.getString("cpf"));
            cons.setSexo(rs.getString("sexo"));
            cons.setraca(rs.getString("raca"));
            cons.setidade(rs.getString("idade"));
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