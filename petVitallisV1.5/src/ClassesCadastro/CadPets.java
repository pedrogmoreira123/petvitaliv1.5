package ClassesCadastro;

import Conexao_SQL.ConnectionFactory;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


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
    private int Codigo;
   
    
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    
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
    
    public CadPets(int Codigo, String Nome, String Cpf, String Numero, String NomePet, String Idade, String raca, String Sexo) {
        this.Codigo = Codigo;
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
    
    String querry = "UPDATE tb_pets SET nome=?, número=?, nomepet=?, idade=?, especie_raça=?, sexo=?, cpf=? WHERE codigo=?";
    
    try (Connection c = factory.obtemConexao()){
        PreparedStatement ps = c.prepareStatement(querry);
        ps.setString(1, Nome);
        ps.setString(2,Numero);
        ps.setString(3, NomePet);
        ps.setString(4, Idade);
        ps.setString(5, raca);
        ps.setString(6, Sexo);
        ps.setString(7, Cpf);
        ps.setInt(8, Codigo);
        ps.execute(); 

        JOptionPane.showMessageDialog(null,NomePet +", alterado com sucesso!"); 
    
     }  
  
    catch(Exception e)
    {
        System.out.println("");
    } 
    
    }
    
    public void DeletarPet(){
    
    String querry = "DELETE FROM tb_pets WHERE codigo = ?";
    
    try (Connection c = factory.obtemConexao()){
        PreparedStatement ps = c.prepareStatement(querry);
        ps.setInt(1, Codigo);
        ps.execute(); 

        JOptionPane.showMessageDialog(null,"Deletado com sucesso!"); 
    
     }  
  
    catch(Exception e)
    {
        System.out.println("");
    } 
    
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
   

   //Lista dos pets
   
   public List<CadPets> ListarPets(){
       try{
           List<CadPets> lista=new ArrayList<CadPets>();
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
   
   public List<CadPets> ListarPetsPorCpf(String Cpf){
       try{
           List<CadPets> lista=new ArrayList<CadPets>();
           String sql= "SELECT*FROM tb_pets WHERE cpf=?";
           
           Connection conn = factory.obtemConexao();
           PreparedStatement pstmt = conn.prepareStatement(sql);
           pstmt.setString(1, Cpf);
          
           
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
   
   
   
   
   
     public List<CadPets> ListarPetsPorCpfeNome(String Cpf, String nomepet){
       try{
           List<CadPets> lista=new ArrayList<CadPets>();
           String sql= "SELECT*FROM tb_pets WHERE cpf=? AND nomepet = ? ";
           
           Connection conn = factory.obtemConexao();
           PreparedStatement pstmt = conn.prepareStatement(sql);
           pstmt.setString(1, Cpf);
           pstmt.setString(2, nomepet);
           
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
           
        rs.close();
        pstmt.close();
        conn.close();

        return lista;
        
        }catch (SQLException e) {
            e.printStackTrace();
        }
        
        return null;
   
   }
}
