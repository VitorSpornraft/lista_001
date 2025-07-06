public class Calculadora {

    double n1;
    double n2;

    public double somar() {
        return n1 + n2;
    }

    public double subtrair() {
        return n1 - n2;
    }

    public double multiplicar() {
        return n1 * n2;
    }

    public double dividir() {
        if (n2 == 0) {
            System.out.println("Não é possível dividir por 0!.");
            return 0;
        }
        return n1 / n2;
    }
}