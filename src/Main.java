import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do cliente: ");
        String name = scanner.nextLine();
        System.out.println("Digite o numero da agencia: ");
        String agencia = scanner.nextLine();
        System.out.println("Digite o numero da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Digite o Saldo da conta: ");
        double saldo = scanner.nextDouble();
        scanner.nextLine();
        ContaTerminal contaTerminal = new ContaTerminal(name, agencia, numero, saldo);

        System.out.println(contaTerminal);
        scanner.close();
    }
}