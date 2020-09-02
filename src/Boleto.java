import java.time.LocalDate;

public class Boleto {
    private String comprador;
    private double valor;
    private LocalDate vencimento;
    private final double TAXA = 2; //constantes
    private final int PRAZO = 5;

    public String getComprador() {
        return comprador;
    }

    public void setComprador(String comprador) {
        this.comprador = comprador.toUpperCase();
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor + TAXA;
    }

    public LocalDate getVencimento() {
        setVencimento();
        return vencimento;
    }

    private void setVencimento() {
        LocalDate date = LocalDate.now();
        this.vencimento = date.plusDays(PRAZO);
    }
}
