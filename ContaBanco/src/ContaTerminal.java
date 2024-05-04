// Conhecer e importar a classe Scanner
import java.util.Locale;
import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.getDefault());

        //Exibir as mensagens para o nosso usuario
        //Obter pelo scanner os valores digitados no terminal

        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência!");
        String numeroAgencia = scanner.nextLine();

        System.out.println("Por favor, digite seu nome!");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite seu saldo!");
        double saldoCliente = scanner.nextDouble();

        //Exibir a mensagem conta criada
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoCliente + " já está disponível para saque");
        scanner.close();
    }
}