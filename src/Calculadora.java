public class Calculadora {

    public static double soma(double n1, double n2) {
        return n1 + n2;
    }

    public static double subtrai(double n1, double n2) {
        return n1 - n2;
    }

    public static double mutiplica(double n1, double n2) {
        return n1 * n2;
    }

    public static double divide(double n1, double n2) {
        if(n2 == 0) {
            System.out.println("Não existe divisão por zero.");
            return 0;
        }

        return n1 / n2;
    }

    public static double porcento(double n, double p) {
        return (n * p) / 100;
    }
}
