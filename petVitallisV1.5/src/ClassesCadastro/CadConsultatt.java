 package ClassesCadastro;

import Conexao_SQL.ConnectionFactory;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class CadConsultatt {
    
    ConnectionFactory factory = new ConnectionFactory();
    
    private String nomePet;
    private String CPF;
    private String consulta;
    private String dia;
    private String hora;
    private int valor;
    
    public String getNomePet() {
        return nomePet;
    }

    public void setNomePet(String nomePet) {
        this.nomePet = nomePet;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
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
    
    public CadConsultatt(){
    
    }

     public CadConsultatt(String nomePet, String CPF, String consulta, String dia, String hora, int valor) {
        this.nomePet = nomePet;
        this.CPF = CPF;
        this.consulta = consulta;
        this.dia = dia;
        this.hora = hora;
        this.valor = valor;
    }
    
    
       public void inserirConsultas() {
        String query = "INSERT INTO tb_cadconsultas  (cpf, nomePet, consulta, dia, hora) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = factory.obtemConexao();
            PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, CPF);
            pstmt.setString(2, nomePet);
            pstmt.setString(3, consulta);
            pstmt.setString(4, dia);
            pstmt.setString(5, hora);
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
        
        
    public boolean cpfExists() {
        String query = "SELECT COUNT(*) FROM tb_cadconsultas  WHERE cpf = ?";
        try (Connection conn = factory.obtemConexao();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, CPF);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return false;
        
    }
    


    public CadConsultatt LerCPF(String cpf) {
        String query = "SELECT * FROM tb_cadconsultas WHERE cpf = ?";
        try (Connection conn = factory.obtemConexao();
            PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, cpf);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    this.CPF = rs.getString("cpf");
                    this.nomePet = rs.getString("nomePet");
                    this.consulta = rs.getString("consulta");
                    this.dia = rs.getString("dia");
                    this.hora = rs.getString("hora");
                    return this;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    
     public List<CadPets> ListarPets(){
       try{
           List<CadPets> lista = new ArrayList<CadPets>();
           String sql= "SELECT*FROM tb_pets";
           
           Connection conn = factory.obtemConexao();
           PreparedStatement pstmt = conn.prepareStatement(sql);
           
           ResultSet rs= pstmt.executeQuery();
           
           while(rs.next()){
            CadPets pets = new CadPets();
            pets.setCodigo(rs.getInt("codigo"));
            pets.setNome(rs.getString("nome"));
            pets.setCpf(rs.getString("cpf"));
            pets.setNumero(rs.getString("número"));
            pets.setNomePet(rs.getString("nomepet"));
            pets.setIdade(rs.getString("idade"));
            pets.setraca(rs.getString("especie_raça"));
            pets.setSexo(rs.getString("sexo"));
           
            lista.add(pets);
           }
           return lista;
        }catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
   
   }
        
         public void saveOrUpdateConsultas() {
        if (cpfExists()) {
            alterarConsultas();
        } else {
            inserirConsultas();
            }
         }
     }