package ClassesDeCadastro;

public class CadConsultas {
        
    private String NomePet;
    private String NomeTutor;
    private String TipoCOnsultas;

    public CadConsultas(String NomePet, String NomeTutor, String TipoCOnsultas) {
        this.NomePet = NomePet;
        this.NomeTutor = NomeTutor;
        this.TipoCOnsultas = TipoCOnsultas;
    }

    public String getNomePet() {
        return NomePet;
    }

    public void setNomePet(String NomePet) {
        this.NomePet = NomePet;
    }

    public String getNomeTutor() {
        return NomeTutor;
    }

    public void setNomeTutor(String NomeTutor) {
        this.NomeTutor = NomeTutor;
    }

    public String getTipoCOnsultas() {
        return TipoCOnsultas;
    }

    public void setTipoCOnsultas(String TipoCOnsultas) {
        this.TipoCOnsultas = TipoCOnsultas;
    }

    public void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
