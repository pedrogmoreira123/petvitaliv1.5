package ClassesCadastro;

import Conexao_SQL.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadProdutos {
    private String CodProduto;
    private String NomeProduto;
    private String TipoDeProduto;
    private String validadeProduto;

    public String getCodProduto() {
        return CodProduto;
    }

    public void setCodProduto(String CodProduto) {
        this.CodProduto = CodProduto;
    }

    public String getNomeProduto() {
        return NomeProduto;
    }

    public void setNomeProduto(String NomeProduto) {
        this.NomeProduto = NomeProduto;
    }

    public String getTipoDeProduto() {
        return TipoDeProduto;
    }

    public void setTipoDeProduto(String TipoDeProduto) {
        this.TipoDeProduto = TipoDeProduto;
    }

    public String getValidadeProduto() {
        return validadeProduto;
    }

    public void setValidadeProduto(String validadeProduto) {
        this.validadeProduto = validadeProduto;
    }

    ConnectionFactory connect = new ConnectionFactory();

    // Verificar se o produto existe
    public boolean produtoExiste() {
        String query = "SELECT COUNT(*) FROM tb_cadproduto WHERE nomeProduto = ?";

        try (Connection conn = connect.obtemConexao();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, NomeProduto);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    int count = rs.getInt(1);
                    return count > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public void salvarOuAtualizarProdutos() {
        if (produtoExiste()) {
            atualizarProduto();
        } else {
            IncluirProduto();
        }
    }

    public CadProdutos carregarPorNome(String NomeProduto) {
        String query = "SELECT * FROM tb_cadproduto WHERE nomeProduto = ?";
        try (Connection conn = connect.obtemConexao();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, NomeProduto);

            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    this.CodProduto = rs.getString("Codigo Produto");
                    this.NomeProduto = rs.getString("Nome Produto");
                    this.TipoDeProduto = rs.getString("Tipo de Produto");
                    this.validadeProduto = rs.getString("Validade do Produto");
                    return this;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // CRUDs
    public void IncluirProduto() {
        String sql = "INSERT INTO tb_cadproduto (codigoProduto, nomeProduto, tipoProduto, validadeProduto) VALUES (?, ?, ?, ?)";

        try (Connection c = connect.obtemConexao()) {
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, CodProduto);
            ps.setString(2, NomeProduto);
            ps.setString(3, TipoDeProduto);
            ps.setString(4, validadeProduto);

            ps.execute();

            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void atualizarProduto() {
        String sql = "UPDATE tb_cadproduto SET codigoProduto = ?, tipoProduto = ?, validadeProduto = ? WHERE nomeProduto = ?";

        try (Connection c = connect.obtemConexao()) {

            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, CodProduto);
            ps.setString(2, TipoDeProduto);
            ps.setString(3, validadeProduto);
            ps.setString(4, NomeProduto);

            ps.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Puxar Banco de Dados Completo
    public ResultSet TodosDadosProdutos() {
        String query = "SELECT codigoProduto, nomeProduto, tipoProduto, validadeProduto FROM tb_cadproduto";
        try {
            Connection conn = connect.obtemConexao();
            PreparedStatement pstmt = conn.prepareStatement(query);
            return pstmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}