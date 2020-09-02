public class Registradora {
    private double total;

    public double getTotal() {
        return total;
    }

    public void addProduto(Produto produto) {
        total = total + produto.getPreco();
    }

    public String getNomeDoProduto(Produto produto) {
        //O nome do produto que deve aparecer na fatura do cliente segue o formato: código/modelo – marca.
        String nomeDoProduto = produto.getCodigo() + "/" + produto.getModelo() + " - " + produto.getMarca();
        return nomeDoProduto;
    }
}
