import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Double saldo = 0.0;
        Boolean continuar = true;

        while (continuar) {
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    // TODO: Ler o valor a ser depositado e atualizar/imprimir o saldo.
                    Double vDeposito = scanner.nextDouble();

                    saldo += vDeposito;

                    System.out.printf("Saldo atual: %.1f\n", saldo);

                    break;
                case 2:
                    // TODO: Ler o valor a ser sacado e verificar/imprimir se há saldo suficiente.
                    Double vSaque = scanner.nextDouble();

                    if (saldo < vSaque) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldo -= vSaque;
                        System.out.printf("Saldo atual: %.1f\n", saldo);
                    }
                    
                    break;
                case 3:
                    // TODO: Exibir o saldo atual da conta.
                    System.out.printf("Saldo atual: %.1f\n", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        
        scanner.close();
    }
}