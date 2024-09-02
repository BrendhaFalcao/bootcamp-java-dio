import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    /*
    Atributos:
    String nomeCliente;
    int numeroDaConta;
    String agencia;
    Double saldoDisponivel;
    
    */
    
    
    public static void main(String[] args) throws Exception {
      //Cria o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome.");
        String nomeCliente = scanner.next();

        System.out.println("Digite o número da sua conta.");
        int numeroDaConta = scanner.nextInt();

        System.out.println("Digite sua agência com dígito.");
        String agencia = scanner.next();

        System.out.println("Digite seu saldo.");
        Double saldoDisponivel = scanner.nextDouble();
    
        scanner.close();
        
        /*
        **A forma de impressão abaixo só funciona com dados do tipo String

        **System.out.println("Olá ".concat(nomeCliente).concat(", obrigado por criar uma conta em nosso banco. Sua agência é ")
        .concat(agencia).concat(", sua conta é ").concat(numeroDaConta).concat(", e seu saldo de R$ ")
        .concat(saldoDisponivel).concat(" já está disponível para saque."));
        */

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " 
        + agencia + ", sua conta é " + numeroDaConta + ", e seu saldo de R$ "+saldoDisponivel+" já está disponível para saque.");


    }
}
