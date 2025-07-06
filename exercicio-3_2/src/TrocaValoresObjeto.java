import java.util.Locale;
import java.util.Scanner;

class ValorContainer {
    int valor;
}

public class TrocaValoresObjeto {

    public static void trocarValores(ValorContainer refA, ValorContainer refB) {
        int temp = refA.valor;
        refA.valor = refB.valor;
        refB.valor = temp;
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ValorContainer objA = new ValorContainer();
        ValorContainer objB = new ValorContainer();

        System.out.println("--- Troca de Valores entre Objetos ---");

        System.out.print("Digite um valor para objA: ");
        objA.valor = sc.nextInt();

        System.out.print("Digite um valor para objB: ");
        objB.valor = sc.nextInt();

        System.out.println("\nValores ANTES da troca:");
        System.out.println("objA.valor = " + objA.valor);
        System.out.println("objB.valor = " + objB.valor);

        trocarValores(objA, objB);

        System.out.println("\nValores DEPOIS da troca:");
        System.out.println("objA.valor = " + objA.valor);
        System.out.println("objB.valor = " + objB.valor);

        sc.close();
    }
}