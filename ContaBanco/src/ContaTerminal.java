import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome");
        String nome = scanner.next();

        System.out.println("Digite sua agência");
        String agencia = scanner.next();

        System.out.println("Digite o número da sua conta");
        int numero = scanner.nextInt();

        System.out.println("Qual valor inicial depositado");
        double saldo = scanner.nextDouble();

        //Exibir informações do usuário
        System.out.println("Olá " + nome + ", " + "obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", " + "conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}

