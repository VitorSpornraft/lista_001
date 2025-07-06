import java.util.Locale;
import java.util.Scanner;

public class MaiorMenor {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int linhas, colunas;

        System.out.println("--- Encontrar Maior e Menor Elemento na Matriz ---");

        System.out.print("Digite o número de linhas da matriz: ");
        linhas = sc.nextInt();

        System.out.print("Digite o número de colunas da matriz: ");
        colunas = sc.nextInt();

        int[][] matriz = new int[linhas][colunas];

        System.out.println("\nDigite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Elemento [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        int maior = matriz[0][0];
        int menor = matriz[0][0];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }

        System.out.println("\nMatriz digitada:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("%d\t", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nMaior elemento: " + maior);
        System.out.println("Menor elemento: " + menor);

        sc.close();
    }
}