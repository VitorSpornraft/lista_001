public class Numero {

    int valor;

    public void imprimirValor() {
        System.out.println("O valor do numero é: " + valor);
    }

    public static void main(String[] args) {

        Numero meuNumero = new Numero();
        meuNumero.valor = 10;

        System.out.println("--- Manipulando Dados do Objeto ---");
        meuNumero.imprimirValor();

        System.out.println("Endereço de memória (hashCode) do objeto: " + System.identityHashCode(meuNumero));
    }
}