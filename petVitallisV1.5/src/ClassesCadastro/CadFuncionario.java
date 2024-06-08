
package ClassesCadastro;

import Conexao_SQL.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadFuncionario {
    
  ConnectionFactory factory = new ConnectionFactory();
    
    private String codFunc;

    public String getCodFunc() {
        return codFunc;
    }

    public void setCodFunc(String codFunc) {
        this.codFunc = codFunc;
    }
    private String Nome;
    private String Endereco;
    private String Rg;
    private String Cpf;
    private String DataDeNascimento;
    private String Pis;
    private String Cep;
    private String NumeroDaResidencia;
    private String CargoFun;

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
    
    public String getCargoFun() {
        return CargoFun;
    }

    public void setCargoFun(String CargoFun) {
        this.CargoFun = CargoFun;
    }
    
     public boolean cpfExists() {
        String query = "SELECT COUNT(*) FROM tb_cadfuncionario  WHERE Cpf = ?";
        try (Connection conn = factory.obtemConexao();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, Cpf);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
             e.printStackTrace();
        }
        return false;
    }
    
    public void inserirFuncionario() {
    String sql = "INSERT INTO tb_cadfuncionario (Nome, Cpf, Rg, DataDeNascimento, Pis, Endereco, NumeroDaResidencia, Cep, CargoFuncionario) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
    
    try (Connection c = factory.obtemConexao()) {
        PreparedStatement ps = c.prepareStatement(sql);
        ps.setString(1, Nome);
        ps.setString(2, Cpf);
        ps.setString(3, Rg);
        ps.setString(4, DataDeNascimento);
        ps.setString(5, Pis);
        ps.setString(6, Endereco);
        ps.setString(7, NumeroDaResidencia);
        ps.setString(8, Cep);
        ps.setString(9, CargoFun);
        ps.executeUpdate();
        
    } catch (SQLException e) {
         e.printStackTrace();
    }
    }
     
     public void atualizarFuncionario (){
        String sql = "UPDATE tb_cadfuncionario SET Endereco = ?, NumeroDaResidencia = ?, Cep = ?, CargoFuncionario = ? WHERE Cpf = ?";

    try (Connection c = factory.obtemConexao()) {
        PreparedStatement ps = c.prepareStatement(sql);
      
        ps.setString(1, Endereco);
        ps.setString(2, NumeroDaResidencia);
        ps.setString(3, Cep);
        ps.setString(4, CargoFun);
        ps.setString(5, Cpf); // CPF para identificar o registro a ser atualizado
        ps.executeUpdate();
        JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso!");
    } catch (SQLException e) {
         e.printStackTrace();
    }
}
     
     
     public CadFuncionario lerCPF(String cpf) {
        String query = "SELECT * FROM tb_cadfuncionario WHERE Cpf = ?";
        try (Connection conn = factory.obtemConexao();
            PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, cpf);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    this.Cpf = rs.getString("cpf");
                    this.Nome = rs.getString("Nome");
                    this.Rg = rs.getString("Rg");
                    this.DataDeNascimento = rs.getString("DataDeNascimento");
                    this.Pis = rs.getString("Pis");
                    this.Endereco = rs.getString("endereco");
                    this.NumeroDaResidencia = rs.getString("NumeroDaResidencia");
                    this.Cep = rs.getString("Cep");
                    this.CargoFun = rs.getString("CargoFuncionario");
                    return this;
                }
            }
        } catch (SQLException e) {
             e.printStackTrace();
        }
        return null;
    }
    
    
        public ResultSet TodosDados() {
        String query = "SELECT Nome, Cpf, Rg, DataDeNascimento, Pis, Endereco, NumeroDaResidencia, Cep, CargoFuncionario FROM tb_cadfuncionario";
        try {
            Connection conn = factory.obtemConexao();
            PreparedStatement pstmt = conn.prepareStatement(query);
            return pstmt.executeQuery();
        }catch (SQLException e) {
             e.printStackTrace();
        }
        
        return null;
        
        }
     
     
        public void atualizareInserirFuncionario() {
        if (cpfExists()) {
            atualizarFuncionario();
        } else {
            inserirFuncionario();
            }
         }
        
}
