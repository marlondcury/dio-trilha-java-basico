import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Por favor insira seu nome:");
        String nomeCliente = input.next();
        System.out.println("Por favor insira o número da conta:");
        int numeroConta = input.nextInt();
        System.out.println("Por favor insira a agencia da conta:");
        String agenciaConta = input.next();
        System.out.println("Por favor insira o saldo da conta:");
        double saldo = input.nextDouble();
        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agenciaConta +", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");
    }
}
