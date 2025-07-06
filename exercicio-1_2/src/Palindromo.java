import java.util.Scanner;

public class Palindromo {

    public static boolean ehPalindromo(String texto) {
        String textoLimpo = texto.replaceAll("\\s+", "").toLowerCase();
        String textoInvertido = new StringBuilder(textoLimpo).reverse().toString();
        return textoLimpo.equals(textoInvertido);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Verificador de Palíndromos ---");
        System.out.print("Digite uma palavra ou frase: ");
        String entradaDoUsuario = sc.nextLine();

        boolean resultado = ehPalindromo(entradaDoUsuario);

        if (resultado) {
            System.out.println("'" + entradaDoUsuario + "' É um palíndromo!");
        } else {
            System.out.println("'" + entradaDoUsuario + "' NÃO é um palíndromo.");
        }

        sc.close();
    }
}