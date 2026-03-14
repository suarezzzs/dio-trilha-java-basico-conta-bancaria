import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in).useLocale(java.util.Locale.US);

        System.out.println("Por favor, digite o número da conta: ");
        int numero = sc.nextInt();
        sc.nextLine();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo da conta: ");
        double saldo = sc.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo);
        sc.close();
    }

}
