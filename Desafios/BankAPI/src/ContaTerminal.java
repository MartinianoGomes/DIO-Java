import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        System.out.print("Por favor, digite o número: ");
        Integer numero = input.nextInt();

        System.out.print("Por favor, digite a Agência: ");
        String agencia = input.next();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nome_cliente = input.next();

        System.out.print("Por favor, digite o saldo da conta: ");
        Double saldo = input.nextDouble();

        System.out.printf("Olá %d, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", numero, agencia, numero, saldo);
    }
}