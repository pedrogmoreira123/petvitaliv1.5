package ClassesCadastro;

import javax.swing.JOptionPane;

public class CadClientes {
    
    //Nome, Email, Usuario, Senha, Numero;
    
   
    private String Nome;
    private String Email;
    private String Senha;
    private int Numero;
    private int Cpf;

    public CadClientes() {
    }
     
    public CadClientes(String Nome, String Email, int Cpf, String Senha, int Numero) {
       this.Nome = Nome;
       this.Email = Email;
       this.Cpf = Cpf;
       this.Senha = Senha;
       this.Numero = Numero;
     }
    
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

    public int getCpf() {
        return Cpf;
    }

    public void setCpf(int Cpf) {
        this.Cpf = Cpf;
    }

    public String getSenha() {
        return Senha;
    }

    public void setSenha(String Senha) {
        this.Senha = Senha;
    }

    public int getNumero() {
        return Numero;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }
    
    public void IncluiCli(){
        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso!");
    }
    
}
