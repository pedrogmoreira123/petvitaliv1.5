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

 
    public void Inserir(){
    String sql = "INSERT INTO tb_clientes( nome, cpf , número, nomepet, idade, raca )VALUES (?,?,?,?,?,?)";
    
    
    try (Connection c = factory.obtemConexao()){
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, Nome);
        ps.setString(2,Cpf);
        ps.setString(3, Numero);
        ps.setString(4, NomePet);
        ps.setString(5, Idade);
        ps.setString(6, raca);
        ps.execute(); 

       JOptionPane.showMessageDialog(null,NomePet +", Cadastrado com sucesso!"); 
    
     }  
    catch(Exception e)
    {
        System.out.println("");
    }
    }
    
    
    
    public void AlterarCli(){
    
    String querry = "UPDATE tb_clientes SET nome = ?, raca= ?, número= ?, WHERE cpf= ?";
    ConnectionFactory factory = new ConnectionFactory();
    
    try (Connection c = factory.obtemConexao()){
        PreparedStatement ps = c.prepareStatement(querry);
        ps.setString(1, Nome);
        ps.setString(2,Cpf);
        ps.setString(3, Numero);
        ps.setString(4, NomePet);
        ps.setString(5, Idade);
        ps.setString(6, raca);
        ps.execute(); 

        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!"); 
    
     }  
  
    catch(Exception e)
    {
        System.out.println("");
    } 
    
    }
    
   public CadPets LerCPF(String cpf) {
        String query = "SELECT * FROM tb_clientes WHERE cpf = ?";
        
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
                    this.raca = rs.getString("raca");
                    
                    return this;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    
}
