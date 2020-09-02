public class Produto {
    private String codigo;
    private String modelo;
    private String marca;
    private double impostoFederal;
    private double impostoProvincial;
    private double valor;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setImpostoFederal(double impostoFederal) {
        this.impostoFederal = impostoFederal;
    }

    public void setImpostoProvincial(double impostoProvincial) {
        this.impostoProvincial = impostoProvincial;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getPreco() {
        return valor + impostoFederal + impostoProvincial;
    }
}
