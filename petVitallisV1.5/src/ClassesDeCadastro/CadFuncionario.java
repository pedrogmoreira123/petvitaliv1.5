package ClassesDeCadastro;

import DAO.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class CadFuncionario {
    
    
    private String Nome;
    private String Endereco;
    private int Rg;
    private int Cpf;
    private int DataDeNascimento;
    private int Pis;
    private int Cep;
    private int NumeroDaResidencia;

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

    public int getRg() {
        return Rg;
    }

    public void setRg(int Rg) {
        this.Rg = Rg;
    }

    public int getCpf() {
        return Cpf;
    }

    public void setCpf(int Cpf) {
        this.Cpf = Cpf;
    }

    public int getDataDeNascimento() {
        return DataDeNascimento;
    }

    public void setDataDeNascimento(int DataDeNascimento) {
        this.DataDeNascimento = DataDeNascimento;
    }

    public int getPis() {
        return Pis;
    }

    public void setPis(int Pis) {
        this.Pis = Pis;
    }

    public int getCep() {
        return Cep;
    }

    public void setCep(int Cep) {
        this.Cep = Cep;
    }

    public int getNumeroDaResidencia() {
        return NumeroDaResidencia;
    }

    public void setNumeroDaResidencia(int NumeroDaResidencia) {
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
        ps.setInt(2, Cpf);
        ps.setInt(3, Rg);
        ps.setInt(4, DataDeNascimento);
        ps.setInt(5, Pis);
        ps.setString(6, Endereco);
        ps.setInt(7, NumeroDaResidencia);
        ps.setInt(8, Cep);
        ps.execute();
        
        JOptionPane.showMessageDialog(null, "Usuário Incluído com Sucesso!");
    }
    catch (Exception e){
        e.printStackTrace();
    }
    }
}
