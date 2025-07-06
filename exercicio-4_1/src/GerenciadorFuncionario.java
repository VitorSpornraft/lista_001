import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

class Funcionario {
    String nome;
    int id;
    double salario;
    String departamento;

    public Funcionario(String nome, int id, double salario, String departamento) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        this.departamento = departamento;
    }

    public void exibirDados() {
        System.out.printf("ID: %d | Nome: %s | Salário: %.2f | Departamento: %s%n",
                id, nome, salario, departamento);
    }
}

public class GerenciadorFuncionario {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        int opcao;

        System.out.println("--- Sistema de Gerenciamento de Funcionários ---");

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Cadastrar novo funcionário");
            System.out.println("2 - Calcular total de salários por departamento");
            System.out.println("3 - Listar todos os funcionários");
            System.out.println("0 - Sair");
            System.out.print("Sua escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Cadastro de Funcionário ---");
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("ID: ");
                    int id = sc.nextInt();
                    System.out.print("Salário: ");
                    double salario = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Departamento: ");
                    String departamento = sc.nextLine();

                    Funcionario novoFuncionario = new Funcionario(nome, id, salario, departamento);
                    listaFuncionarios.add(novoFuncionario);
                    System.out.println("Funcionário cadastrado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Salário Total por Departamento ---");
                    if (listaFuncionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado ainda.");
                        break;
                    }
                    System.out.print("Digite o nome do departamento para calcular o total de salários: ");
                    String depBusca = sc.nextLine();
                    double totalSalarios = 0;
                    boolean encontrouDepartamento = false;

                    for (Funcionario f : listaFuncionarios) {
                        if (f.departamento.equalsIgnoreCase(depBusca)) {
                            totalSalarios += f.salario;
                            encontrouDepartamento = true;
                        }
                    }

                    if (encontrouDepartamento) {
                        System.out.printf("Total de salários no departamento '%s': %.2f%n", depBusca, totalSalarios);
                    } else {
                        System.out.println("Departamento '" + depBusca + "' não encontrado ou sem funcionários.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Lista de Funcionários Cadastrados ---");
                    if (listaFuncionarios.isEmpty()) {
                        System.out.println("Nenhum funcionário cadastrado ainda.");
                    } else {
                        for (Funcionario f : listaFuncionarios) {
                            f.exibirDados();
                        }
                    }
                    break;

                case 0:
                    System.out.println("Saindo do sistema. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}