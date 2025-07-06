import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

class Contato {
    String nome;
    String telefone;
    String email;

    public Contato(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public void exibirContato() {
        System.out.println("Nome: " + nome);
        System.out.println("Telefone: " + telefone);
        System.out.println("Email: " + email);
    }
}

public class AgendaDeContatos {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        ArrayList<Contato> listaContatos = new ArrayList<>();
        final int MAX_CONTATOS = 10;
        int opcao;

        System.out.println("--- Agenda de Contatos ---");

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1 - Adicionar novo contato");
            System.out.println("2 - Listar todos os contatos");
            System.out.println("3 - Procurar contato por nome");
            System.out.println("0 - Sair");
            System.out.print("Sua escolha: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    if (listaContatos.size() < MAX_CONTATOS) {
                        System.out.println("\n--- Adicionar Contato ---");
                        System.out.print("Nome: ");
                        String nome = sc.nextLine();
                        System.out.print("Telefone: ");
                        String telefone = sc.nextLine();
                        System.out.print("Email: ");
                        String email = sc.nextLine();

                        Contato novoContato = new Contato(nome, telefone, email);
                        listaContatos.add(novoContato);
                        System.out.println("Contato adicionado com sucesso!");
                    } else {
                        System.out.println("A agenda está cheia! Máximo de " + MAX_CONTATOS + " contatos.");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Lista de Contatos ---");
                    if (listaContatos.isEmpty()) {
                        System.out.println("A agenda está vazia. Nenhum contato cadastrado.");
                    } else {
                        for (int i = 0; i < listaContatos.size(); i++) {
                            System.out.println("--- Contato " + (i + 1) + " ---");
                            listaContatos.get(i).exibirContato();
                        }
                    }
                    break;

                case 3:
                    System.out.println("\n--- Procurar Contato ---");
                    if (listaContatos.isEmpty()) {
                        System.out.println("A agenda está vazia. Nenhum contato para procurar.");
                        break;
                    }
                    System.out.print("Digite o nome do contato que deseja procurar: ");
                    String nomeBusca = sc.nextLine();
                    boolean encontrado = false;

                    for (Contato c : listaContatos) {
                        if (c.nome.equalsIgnoreCase(nomeBusca)) {
                            System.out.println("\nContato encontrado:");
                            c.exibirContato();
                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("Contato '" + nomeBusca + "' não encontrado na agenda.");
                    }
                    break;

                case 0:
                    System.out.println("Saindo da agenda. Até mais!");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }

        } while (opcao != 0);

        sc.close();
    }
}
