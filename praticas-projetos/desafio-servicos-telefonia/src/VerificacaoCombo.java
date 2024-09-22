import java.util.Scanner;

public class VerificacaoCombo {

    // Função para verificar se o cliente contratou um combo completo
    public static String verificarComboCompleto(String[] servicosContratados) {
        // Variáveis booleanas para verificar a contratação de cada serviço
        boolean movelContratado = false;
        boolean bandaLargaContratada = false;
        boolean tvContratada = false;

        //Itere sobre os serviços contratados
        for (String servico : servicosContratados) {
            // tira os espaços em branco do texto de input
            servico = servico.trim();

            
            if (servico.equalsIgnoreCase("tv")) { //compara a string que foi puxada em serviço com "tv"
                tvContratada = true;
            } else if (servico.equalsIgnoreCase("movel")) {//compara a string que foi puxada em serviço com "movel"
                movelContratado = true;
            } else if (servico.equalsIgnoreCase("banda larga")) {//compara a string que foi puxada em serviço com "banda larga"
                bandaLargaContratada = true;
            }
        }

        //Verifique se todos os serviços foram contratados
        if (tvContratada == true && movelContratado == true && bandaLargaContratada == true) {
            return "Combo Completo";
        } else {
            return "Combo Incompleto";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de serviços contratados
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] servicosContratados = input.split(",");

        // Verificando se o cliente contratou um combo completo
        String resultado = verificarComboCompleto(servicosContratados);

        // Exibindo o resultado
        System.out.println(resultado);

        // Fechando o scanner
        scanner.close();
    }
}