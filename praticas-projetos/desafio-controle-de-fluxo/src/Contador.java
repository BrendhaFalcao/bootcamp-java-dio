import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicita o primeiro parâmetro e tenta ler um número válido
            System.out.println("Digite o primeiro parâmetro.");
            int primeiroNumero = lerNumero(scanner);
            // Solicita o segundo parâmetro e tenta ler um número válido
            System.out.println("Digite o segundo parâmetro.");
            int segundoNumero = lerNumero(scanner);

            // Chama o método contar para imprimir números entre primeiroNumero e
            // segundoNumero
            contar(primeiroNumero, segundoNumero);
        } catch (ParametrosInvalidosException e) {
            // Captura a exceção personalizada e imprime a mensagem de erro
            System.out.println(e.getMessage());
        }

        // Fecha o Scanner para liberar recursos
        scanner.close();
    }

    // Método que tenta ler um número inteiro do Scanner
    // Lança a exceção ParametrosInvalidosException se a entrada não for um número
    // válido
    public static int lerNumero(Scanner scanner) throws ParametrosInvalidosException {
        try {
            // Tenta ler um número inteiro da entrada do usuário
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            // Lança a exceção personalizada com uma mensagem de erro se a entrada não for
            // válida
            throw new ParametrosInvalidosException("Digite um número válido");
        }
    }

    // Método que imprime números de primeiroNumero até segundoNumero
    public static void contar(int primeiroNumero, int segundoNumero) throws ParametrosInvalidosException {
        // Verifica se o primeiro número é maior que o segundo
        if (primeiroNumero > segundoNumero) {
            // Lança a exceção personalizada com uma mensagem de erro
            throw new ParametrosInvalidosException("O primeiro número não pode ser maior que o segundo");
        }

        // Loop que vai de primeiroNumero até segundoNumero (inclusive)
        for (int x = primeiroNumero; x <= segundoNumero; x++) {
            // Imprime o número atual
            System.out.println("Imprimindo o número: " + x);
        }
    }
}