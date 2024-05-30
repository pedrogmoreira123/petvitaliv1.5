package ClassesCadastro;

import Conexao_SQL.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class CadPet {
    
    private String NomeTutor;
    private String Nome;
    private String Raca;               
    private String Idade;
    private String Num;
    private String CpfTutor;


    public CadPet() {
    }
    
    public CadPet(String NomeTutor, String Nome, String Raca, String Idade, String Num) {
        this.NomeTutor = NomeTutor;
        this.Nome = Nome;
        this.Raca = Raca;
        this.Idade = Idade;
        this.Num = Num;
    }


    public String getNomeTutor() {
        return NomeTutor;
    }

    public void setNomeTutor(String NomeTutor) {
        this.NomeTutor = NomeTutor;
    }
    
    public String getCpfTutor() {
        return CpfTutor;
    }

    public void setCpfTutor(String CpfTutor) {
        this.CpfTutor = CpfTutor;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getRaca() {
        return Raca;
    }

    public void setRaca(String Raca) {
        this.Raca = Raca;
    }

    public String getIdade() {
        return Idade;
    }

    public void setIdade(String Idade) {
        this.Idade = Idade;
    }

    public String getNum() {
        return Num;
    }

    public void setNum(String Num) {
        this.Num = Num;
    }
    
   
    
     public void IncluirPet(){
        String sql = "INSERT INTO tb_pets(NomeTutor,CpfTutor, Nome, Idade, Raça, Numero)VALUES (?,?,?,?,?,?)";
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, NomeTutor);
            ps.setString(2, CpfTutor);
            ps.setString(3, Nome);
            ps.setString(4, Idade);
            ps.setString(5, Raca);
            ps.setString(6, Num);
            ps.execute(); 

           JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!"); 

         }  
        catch(Exception e)
        {
            System.out.println("");
        }
    }
    
    
    
    public void AlterarCli(){
    
    String querry = "UPDATE tb_pets SET NomeTutor = ?, CpfTutor= ?, Nome= ?, Idade= ?, Raça= ? WHERE CpfTutor= ?";
    ConnectionFactory factory = new ConnectionFactory();
    
        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(querry);
            ps.setString(1, NomeTutor);
            ps.setString(2, CpfTutor);
            ps.setString(3, Nome);
            ps.setString(4, );
            ps.execute(); 

            JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!"); 

         }  

        catch(Exception e)
        {
            System.out.println("");
        } 
    
    }
   
}
