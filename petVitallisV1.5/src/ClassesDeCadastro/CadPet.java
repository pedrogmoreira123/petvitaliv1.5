package ClassesDeCadastro;

import javax.swing.JOptionPane;

public class CadPet {
    
    private String NomeTutor;
    private String Nome;
    private String Raca;               
    private int Idade;
    private int Num;
    private int CpfTutor;


    public CadPet() {
    }
    
    public CadPet(String NomeTutor, String Nome, String Raca, int Idade, int Num) {
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
    
    public int getCpfTutor() {
        return CpfTutor;
    }

    public void setCpfTutor(int CpfTutor) {
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

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        this.Idade = Idade;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int Num) {
        this.Num = Num;
    }
    
    public void IncluirPet(){
        JOptionPane.showMessageDialog(null,"Cadastrado com sucesso");
    }
    
   
}
