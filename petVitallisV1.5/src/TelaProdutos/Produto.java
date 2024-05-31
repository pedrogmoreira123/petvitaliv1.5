package TelaProdutos;

public class Produto {
    private String CodProduto;
    int CodigoProdutoInt = Integer.parseInt(CodProduto);
    private String NomeProduto;
    private String TipoDeProduto;
    private String validadeProduto;
    
    public Produto (int CodigoProdutoInt, String NomeProduto, String TipoDeProduto) {
        this.CodigoProdutoInt = CodigoProdutoInt;
        this.NomeProduto = NomeProduto;
        this.TipoDeProduto = TipoDeProduto;
        this.validadeProduto = validadeProduto;
    }
    
    public int getCodigoProdutoInt() {
        return CodigoProdutoInt;
    }

    public void setCodigoProdutoInt(int CodigoProdutoInt) {
        this.CodigoProdutoInt = CodigoProdutoInt;
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
}
