import java.util.Scanner;
public class ContaBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int conta;
        String nomeCliente;
        double saldo = 237.48;
        String agencia;

        System.out.print("Digite o numero da conta: ");
        conta = sc.nextInt();


        System.out.print("Digite o numero da agencia: ");
        String agenciaString = sc.next();
        double agenciaDouble = Double.parseDouble(agenciaString);

        System.out.print("Digite o seu nome: ");
        nomeCliente = sc.next();

        System.out.printf("Olá %s,obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",nomeCliente,agenciaString,conta,saldo);


        sc.close();

    }
}
