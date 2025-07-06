import java.util.Scanner;

public class Fatorial {

    public static long calcularFatorial(int numero) {
        if (numero == 0 || numero == 1) {
            return 1;
        } else {
            return numero * calcularFatorial(numero - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Calculadora de Fatorial (Recursiva) ---");
        System.out.print("Digite um número inteiro não negativo: ");
        int numeroDigitado = sc.nextInt();

        if (numeroDigitado < 0) {
            System.out.println("Erro: Não é possível calcular o fatorial de um número negativo.");
        } else {
            long resultadoFatorial = calcularFatorial(numeroDigitado);
            System.out.println("O fatorial de " + numeroDigitado + " é: " + resultadoFatorial);
        }

        sc.close();
    }
}