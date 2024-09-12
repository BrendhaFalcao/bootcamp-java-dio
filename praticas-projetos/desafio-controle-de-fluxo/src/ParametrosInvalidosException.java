// Define uma exceção personalizada chamada NumeroInvalidoException
// Esta classe estende (herda de) Exception, permitindo que seja usada como uma exceção verificável

class ParametrosInvalidosException extends Exception {
    // Construtor da exceção personalizada
    // Recebe uma mensagem como parâmetro para fornecer detalhes sobre o erro
    public ParametrosInvalidosException(String mensagem) {
        // Chama o construtor da superclasse (Exception) com a mensagem fornecida
        super(mensagem);
    }
}
