package ClassesDeCadastro;

import javax.swing.JOptionPane;

public class CadClientes {
    
    //Nome, Email, Usuario, Senha, Numero;
    
   
    private String Nome;
    private String Email;
    private int Numero;
    private int Cpf;

    public CadClientes() {
    }
     
    public CadClientes(String Nome, String Email, int Cpf, String Senha, int Numero) {
       this.Nome = Nome;
       this.Email = Email;
       this.Cpf = Cpf;
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
