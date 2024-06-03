package ClassesDeCadastro;


import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import javax.swing.JOptionPane;


public class CadConsultas {
        
    private String NomePet;
    private String CpfTutor;
    private String TipoConsultas;
    private Date DiaDaConsulta;
    private int HoraDaConsulta;


    public String getNomePet() {
        return NomePet;
    }

    public void setNomePet(String NomePet) {
        this.NomePet = NomePet;
    }

    public String getCpfTutor() {
        return CpfTutor;
    }

    public void setCpfTutor(String CpfTutor) {
        this.CpfTutor = CpfTutor;
    }

    public String getTipoConsultas() {
        return TipoConsultas;
    }

    public void setTipoConsultas(String TipoConsultas) {
        this.TipoConsultas = TipoConsultas;
    }

    
     public Date getDiaDaConsulta() {
        return DiaDaConsulta;
    }

    public void setDiaDaConsulta(Date DiaDaConsulta) {
        this.DiaDaConsulta = DiaDaConsulta;
    }
    
     public int getHoraDaConsulta() {
        return HoraDaConsulta;
    }

    public void setHoraDaConsulta(int HoraDaConsulta) {
        this.HoraDaConsulta = HoraDaConsulta;
    }

public void inserir(){
    
    String sql = "INSERT INTO tb_cadfuncionario(Nome, Cpf, Rg, DataDeNascimento, Pis, Endereco, NumeroDaResidencia, Cep) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    ConnectionFactory factory = new ConnectionFactory();
    
    try (Connection c = factory.obtemConexao()){
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, CpfTutor);
        ps.setString(2,NomePet);
        ps.setString(3,TipoConsultas);
        ps.setDate(4, (java.sql.Date) DiaDaConsulta);
        
        JOptionPane.showMessageDialog(null, "Usuário Incluído com Sucesso!");
    }
    catch (Exception e){
        e.printStackTrace();
    }
    }
}