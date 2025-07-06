import java.util.Scanner;

public class CalculadoraMain {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Calculadora calc = new Calculadora();

        System.out.print("Digite o primeiro numero: ");
        calc.n1 = sc.nextDouble();

        System.out.print("Digite o segundo numero: ");
        calc.n2 = sc.nextDouble();

        System.out.print("Escolha a operação (+ - * /): ");
        char op = sc.next().charAt(0);

        double r;

        if (op == '+'){
            r = calc.somar();
        }else if (op == '-') {
            r = calc.subtrair();
        } else if (op == '*') {
            r = calc.multiplicar();
        } else if (op == '/') {
            r = calc.dividir();
        } else {
            System.out.println("Operação inválida.");
            sc.close();
            return;
        }

        System.out.printf("Resultado: %.2f%n", r);
        sc.close();
    }
}