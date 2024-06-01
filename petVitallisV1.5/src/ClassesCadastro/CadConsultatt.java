 package ClassesCadastro;

import Conexao_SQL.ConnectionFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CadConsultatt {
    
    ConnectionFactory connect = new ConnectionFactory();
    
    private String nomePet;
    private String CPF;
    private String consulta;
    private String dia;
    private String hora;
    
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

    

    public boolean cpfExists() {
        String query = "SELECT COUNT(*) FROM tb_cadconsultas  WHERE cpf = ?";
        try (Connection conn = connect.obtemConexao();
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
    
    
    public void inserirConsultas() {
        String query = "INSERT INTO tb_cadconsultas  (cpf, nomePet, consulta, dia, hora) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = connect.obtemConexao();
            PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, CPF);
            pstmt.setString(2, nomePet);
            pstmt.setString(3, consulta);
            pstmt.setString(4, dia);
            pstmt.setString(5, hora);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void alterarConsultas() {
        String query = "UPDATE tb_cadconsultas  SET nomePet = ?, consulta = ?, dia = ?, hora = ? WHERE cpf = ?";
        try (Connection conn = connect.obtemConexao();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, nomePet);
            pstmt.setString(2, consulta);
            pstmt.setString(3, dia);
            pstmt.setString(4, hora);
            pstmt.setString(5, CPF);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


   

    public CadConsultatt loadByCPF(String cpf) {
        String query = "SELECT * FROM tb_cadconsultas WHERE cpf = ?";
        try (Connection conn = connect.obtemConexao();
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
    
    
        public ResultSet TodosDados() {
        String query = "SELECT cpf, nomePet, consulta, dia, hora FROM tb_cadconsultas";
        try {
            Connection conn = connect.obtemConexao();
            PreparedStatement pstmt = conn.prepareStatement(query);
            return pstmt.executeQuery();
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