package Conexao_SQL;







// IGNORAR. Teteu estava testando......................
//
//
//
//







import ClassesCadastro.CadProdutos;
import TelaProdutos.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException; 

public class DAO {
    public CadProdutos[] obterProdutos() throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM tb_cadproduto";

        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obtemConexao();
             PreparedStatement ps = c.prepareStatement(
                     sql,
                     ResultSet.TYPE_SCROLL_INSENSITIVE,
                     ResultSet.CONCUR_READ_ONLY);

             ResultSet rs = ps.executeQuery()) {
            int totalDeProdutos = rs.last() ? rs.getRow() : 0;

            CadProdutos[] produto = new CadProdutos[totalDeProdutos];
            rs.beforeFirst();

            int contador = 0;

            while (rs.next()) {
                String CodProduto = rs.getString("Codigo Produto");
                int CodigoProdutoInt = Integer.parseInt(CodProduto);
                String NomeProduto = rs.getString("Nome Produto");
                String TipoDeProduto = rs.getString("Tipo Produto");

                produto[contador++] = new CadProdutos(CodigoProdutoInt, NomeProduto, TipoDeProduto);
            }
            return produto;
        }
    }
}
