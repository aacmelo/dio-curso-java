import java.util.IllegalFormatException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        String nomeCliente, agencia;
        int numeroConta;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o Nome do Cliente: ");
        nomeCliente = scanner.nextLine();
        System.out.print("Digite a Agencia do Cliente: ");
        agencia = scanner.nextLine();
        System.out.print("Digite o Numero da Conta do Cliente: ");
        numeroConta = scanner.nextInt();
        System.out.print("Digite o Saldo da Conta: ");
        saldo = scanner.nextDouble();
        System.out.println("Olá " + nomeCliente + " Obrigado por criar uma conta em nosso banco");
        System.out.println("Sua Agencia é " + agencia);
        System.out.println("Sua conta é " + numeroConta);
        System.out.println("O seu saldo: " + saldo + " Já está disponivel para saque");
    }
}
