import java.util.Locale;
import java.util.Scanner;

public class SomaDiagonal {

    public static void preencherMatriz(Scanner sc, int[][] matriz, int ordem) {
        System.out.println("\nDigite os elementos da matriz:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public static void exibirMatriz(int[][] matriz, int ordem) {
        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.printf("%d\t", matriz[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int ordem;

        System.out.println("--- Soma das Diagonais de uma Matriz Quadrada ---");
        System.out.print("Digite a ordem da matriz quadrada (n): ");
        ordem = sc.nextInt();

        int[][] matriz = new int[ordem][ordem];

        preencherMatriz(sc, matriz, ordem);

        int somaPrincipal = 0;
        int somaSecundaria = 0;

        for (int i = 0; i < ordem; i++) {
            somaPrincipal += matriz[i][i];
            somaSecundaria += matriz[i][(ordem - 1) - i];
        }

        exibirMatriz(matriz, ordem);

        System.out.println("\nSoma da Diagonal Principal: " + somaPrincipal);
        System.out.println("Soma da Diagonal Secundária: " + somaSecundaria);

        sc.close();
    }
}