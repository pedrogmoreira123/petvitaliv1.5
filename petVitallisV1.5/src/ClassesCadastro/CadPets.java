package ClassesCadastro;

import Conexao_SQL.ConnectionFactory;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class CadPets {
    
    ConnectionFactory factory = new ConnectionFactory();
    
    //Nome, raca, Usuario, Senha, Numero;
    
   
    private String Nome;
    private String Cpf;
    private String Numero;
    private String NomePet;
    private String Idade;
    private String raca;
    private String Sexo;

    
    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
  
    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getNomePet() {
        return NomePet;
    }

    public void setNomePet(String NomePet) {
        this.NomePet = NomePet;
    }

    public String getIdade() {
        return Idade;
    }

    public void setIdade(String Idade) {
        this.Idade = Idade;
    }

    public String getraca() {
        return raca;
    }

    public void setraca(String raca) {
        this.raca = raca;
    }
    
    public CadPets(){
    
    }
    
    public CadPets(String Nome, String Cpf, String Numero, String NomePet, String Idade, String raca, String Sexo) {
        this.Nome = Nome;
        this.Cpf = Cpf;
        this.Numero = Numero;
        this.NomePet = NomePet;
        this.Idade = Idade;
        this.raca = raca;
        this.Sexo = Sexo;
    }
    
    
    public void Inserir(){
    String sql = "INSERT INTO tb_pets( nome, cpf , número, nomepet, idade, especie_raça, sexo  )VALUES (?,?,?,?,?,?,?)";
    
    
    try (Connection c = factory.obtemConexao()){
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, Nome);
        ps.setString(2, Cpf);
        ps.setString(3, Numero);
        ps.setString(4, NomePet);
        ps.setString(5, Idade);
        ps.setString(6, raca);
        ps.setString(7, Sexo);
        ps.execute(); 

       JOptionPane.showMessageDialog(null,NomePet +", Cadastrado com sucesso!"); 
    
     }  
    catch(Exception e)
    {
        System.out.println("");
    }
    }
    
    
    
    public void AlterarPet(){
    
    String querry = "UPDATE tb_pets SET nome = ?,número = ?, nomepet = ?, idade = ?, especie_raça = ?, WHERE cpf= ?";
    ConnectionFactory factory = new ConnectionFactory();
    
    try (Connection c = factory.obtemConexao()){
        PreparedStatement ps = c.prepareStatement(querry);
        ps.setString(1, Nome);
        ps.setString(2,Numero);
        ps.setString(3, NomePet);
        ps.setString(4, Idade);
        ps.setString(5, raca);
        ps.setString(6, Cpf);
        ps.execute(); 

        JOptionPane.showMessageDialog(null,"Alterado com sucesso!"); 
    
     }  
  
    catch(Exception e)
    {
        System.out.println("");
    } 
    
    }
    
    public boolean cpfExists() {
        String query = "SELECT COUNT(*) FROM tb_pets  WHERE cpf = ?";
        try (Connection conn = factory.obtemConexao();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, Cpf);
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
    
   public CadPets LerCPF(String cpf) {
        String query = "SELECT * FROM tb_pets WHERE cpf = ?";
        
        try (Connection conn = factory.obtemConexao();
            PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, cpf);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    this.Nome = rs.getString("nome");
                    this.Cpf = rs.getString("cpf");
                    this.Numero = rs.getString("número");
                    this.NomePet = rs.getString("nomePet");
                    this.Idade = rs.getString("idade");
                    this.raca = rs.getString("especie_raça");
                    this.Sexo = rs.getString("sexo");
                    return this;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
   
   
   
   public ResultSet TodosDados() {
        String query = "SELECT nome, cpf, número, nomepet, idade, especie_raça, sexo FROM tb_pets";
        try {
            Connection conn = factory.obtemConexao();
            PreparedStatement pstmt = conn.prepareStatement(query);
            return pstmt.executeQuery();
        }catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
        
        }

    
}
