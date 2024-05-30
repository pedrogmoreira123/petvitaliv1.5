package ClassesCadastro;

import Conexao_SQL.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class CadProdutos {
    private String CodProduto;
    private String NomeProduto;
    private String  TipoDeProduto;
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

    //CRUDs
    public void IncluirProduto(){        
        String sql = "INSERT INTO tb_cadproduto (nomeProduto, tipoProduto, validadeProduto) VALUES (?, ?, ?)";
        
        ConnectionFactory factory = new ConnectionFactory();

        try (Connection c = factory.obtemConexao()){
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, NomeProduto);
            ps.setString(2, TipoDeProduto);
            ps.setString(3, validadeProduto);
            
            ps.execute();

            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
            
    } catch (Exception e){
        e.printStackTrace();
        }
    }
        public void atualizar (){
            String sql = "UPDATE tb_pessoa SET nome = ?, fone = ?, email = ? WHERE codigo = ?";
        
            ConnectionFactory factory = new ConnectionFactory();
            try (Connection c = factory.obtemConexao()){
        
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, NomeProduto);
            ps.setString(2, TipoDeProduto);
            ps.setString(3, validadeProduto);
      
            ps.execute();
        }
        catch (Exception e){
        e.printStackTrace();
        }
        
        
        
        
        
        }
    }

