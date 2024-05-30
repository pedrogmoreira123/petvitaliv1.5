package ClassesDeCadastro;

import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class CadFuncionario {
    
    
    private String Nome;
    private String Endereco;
    private String Rg;
    private String Cpf;
    private String DataDeNascimento;
    private String Pis;
    private String Cep;
    private String NumeroDaResidencia;

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEndereco() {
        return Endereco;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

    public String getDataDeNascimento() {
        return DataDeNascimento;
    }

    public void setDataDeNascimento(String DataDeNascimento) {
        this.DataDeNascimento = DataDeNascimento;
    }

    public String getPis() {
        return Pis;
    }

    public void setPis(String Pis) {
        this.Pis = Pis;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public String getNumeroDaResidencia() {
        return NumeroDaResidencia;
    }

    public void setNumeroDaResidencia(String NumeroDaResidencia) {
        this.NumeroDaResidencia = NumeroDaResidencia;
    }
    
    public void IncluirFun(){
        JOptionPane.showMessageDialog(null, "Funcionario cadastrado com sucesso");
    }
    
     public void inserir(){
    
    String sql = "INSERT INTO tb_cadfuncionario(Nome, Cpf, Rg, DataDeNascimento, Pis, Endereco, NumeroDaResidencia, Cep) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    ConnectionFactory factory = new ConnectionFactory();
    
    try (Connection c = factory.obtemConexao()){
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, Nome);
        ps.setString(2, Cpf);
        ps.setString(3, Rg);
        ps.setString(4, DataDeNascimento);
        ps.setString(5, Pis);
        ps.setString(6, Endereco);
        ps.setString(7, NumeroDaResidencia);
        ps.setString(8, Cep);
        ps.execute();
        
        JOptionPane.showMessageDialog(null, "Usuário Incluído com Sucesso!");
    }
    catch (Exception e){
        e.printStackTrace();
    }
    }
}
