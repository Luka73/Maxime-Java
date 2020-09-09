import java.time.DayOfWeek;
import java.time.LocalDate;

public class Boleto {
    private String comprador;
    private double valor;
    private LocalDate vencimento;
    private double taxa;
    private final int PRAZO = 5; //constante

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
        this.valor = valor + taxa;
    }

    private void setVencimento() {
        LocalDate date = LocalDate.now();
        vencimento = date.plusDays(PRAZO);

        if(vencimento.getDayOfWeek() == DayOfWeek.SATURDAY) {
            vencimento = vencimento.plusDays(2);
        } else if (vencimento.getDayOfWeek() == DayOfWeek.SUNDAY) {
            vencimento = vencimento.plusDays(1);
        }
    }

    public String getVencimento() {
        setVencimento();
        return vencimento.toString();
    }

    public void setTaxa(double taxa) {
        this.taxa = taxa;
    }

    public void aplicaDesconto(double desconto, boolean porcentagem) {
        if(porcentagem)
            valor = Calculadora.subtrai(valor, Calculadora.porcento(valor, desconto));
        else
            valor = Calculadora.subtrai(valor, desconto);
    }

}
