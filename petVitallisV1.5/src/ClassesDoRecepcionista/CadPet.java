/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClassesDoRecepcionista;

import javax.swing.JOptionPane;

/**
 *
 * @author kauan
 */
public class CadPet {
    
    private String NomeTutor;
    private String Nome;
    private String Raca;               
    private int Idade;
    private int Num;
    
    
    
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
        JOptionPane.showMessageDialog(null, Nome + " cadrastro com sucesso");
    }
    
   
}
