package ClassesCadastro;

import Conexao_SQL.ConnectionFactory;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class CadClientes {
    
    //Nome, Email, Usuario, Senha, Numero;
    
   
    private String Nome;
    private String Email;
    private String Numero;
    private String Cpf;


    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public CadClientes() {
    }

    public CadClientes(String Nome, String Email, String Numero, String Cpf) {
        this.Nome = Nome;
        this.Email = Email;
        this.Numero = Numero;
        this.Cpf = Cpf;
    }
    
    

    
    public void IncluiCli(){
        
    }
    
    public void Inserir(){
    String sql = "INSERT INTO tb_clientes(nome,email,"+"número, cpf)VALUES (?,?,?,?)";
    ConnectionFactory factory = new ConnectionFactory();
    
    try (Connection c = factory.obtemConexao()){
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, Nome);
        ps.setString(2, Email);
        ps.setString(3, Numero);
        ps.setString(4, Cpf);
        ps.execute(); 

       JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!"); 
    
     }  
    catch(Exception e)
    {
        System.out.println("");
    }
    }
    
    
    
    public void AlterarCli(){
    
    String querry = "UPDATE tb_clientes SET nome = ?, email= ?, número= ?, WHERE cpf= ?";
    ConnectionFactory factory = new ConnectionFactory();
    
    try (Connection c = factory.obtemConexao()){
        PreparedStatement ps = c.prepareStatement(querry);
        ps.setString(1, Nome);
        ps.setString(2, Email);
        ps.setString(3, Numero);
        ps.setString(4, Cpf);
        ps.execute(); 

        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!"); 
    
     }  
  
    catch(Exception e)
    {
        System.out.println("");
    } 
    
    }
    
   public void listaCliente(){
    
    String sql = "SELECT * FROM tb_pessoa";
    ConnectionFactory factory = new ConnectionFactory();
    
    try (Connection c = factory.obtemConexao()){
        
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                int codigo = rs.getInt("codigo");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String numero = rs.getString("numero");
                String cpf = rs.getString("cpf");
                String aux = String.format(
                    "Código: %d, Nome: %s, Email: %s, Numero: %s, Cpf: %s",
                    codigo,
                    nome,   // Corrigido para a variável correta
                    email,  // Corrigido para a variável correta
                    numero, // Corrigido para a variável correta
                    cpf     // Corrigido para a variável correta
                );
                JOptionPane.showMessageDialog(null, aux);
            }
        } catch(Exception e) {
            e.printStackTrace(); // Imprimir a stack trace para depuração
        } 
    }

    
}
