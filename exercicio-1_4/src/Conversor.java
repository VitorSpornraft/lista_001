import java.util.Locale;
import java.util.Scanner;

class ConversorTemperatura {

    public double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

public class Conversor {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ConversorTemperatura conversor = new ConversorTemperatura();

        double temperaturaEntrada;
        double temperaturaConvertida;
        int escolha;

        System.out.println("--- Conversor de Temperaturas ---");
        System.out.println("Escolha a direção da conversão:");
        System.out.println("1 - Celsius para Fahrenheit");
        System.out.println("2 - Fahrenheit para Celsius");
        System.out.print("Sua escolha: ");
        escolha = sc.nextInt();

        if (escolha == 1) {
            System.out.print("Digite a temperatura em Celsius: ");
            temperaturaEntrada = sc.nextDouble();
            temperaturaConvertida = conversor.celsiusParaFahrenheit(temperaturaEntrada);
            System.out.printf("%.2f C equivalem a %.2f F%n", temperaturaEntrada, temperaturaConvertida);
        } else if (escolha == 2) {
            System.out.print("Digite a temperatura em Fahrenheit: ");
            temperaturaEntrada = sc.nextDouble();
            temperaturaConvertida = conversor.fahrenheitParaCelsius(temperaturaEntrada);
            System.out.printf("%.2f F equivalem a %.2f C%n", temperaturaEntrada, temperaturaConvertida);
        } else {
            System.out.println("Opção inválida! Escolha 1 ou 2.");
        }

        sc.close();
    }
}