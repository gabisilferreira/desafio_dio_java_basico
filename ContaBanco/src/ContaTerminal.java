import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, digite o número da agência! \n");
        int numeroAgencia = scanner.nextInt(); 
        scanner.nextLine(); 
        System.out.println("Por favor, digite sua  agência! \n");
        String agencia = scanner.next();
        scanner.nextLine(); 
        System.out.println("Por favor, digite seu nome: \n");
        String nomeCliente = scanner.next();
        scanner.nextLine(); 
        System.out.println("Por favor, digite o seu saldo! \n");
        int saldo = scanner.nextInt(); 
        scanner.nextLine();
        System.out.println("Olá, "+nomeCliente+ " obrigado por criar uma conta em nosso banco, sua agência é " + agencia+ " conta " + numeroAgencia+" e seu saldo " + saldo+ " já está disponível para saque");
    }
}
