package Cap_03_Classes_Objetos;

import java.util.Scanner;

public class _68_AccountTest {

    public static void main(String[] args) {

        _67_Account  account1 = new _67_Account("Jane Green", 50.00);
        _67_Account  account2 = new _67_Account("John Blue", -7.53);

        // exibe saldo inicial de cada objeto
        System.out.printf("%s balanço: $%.2f %n", account1.getNome(),account1.getBalanco());
        System.out.printf("%s balanço: $%.2f %n%n", account2.getNome(),account2.getBalanco());

        // Obter entrada a partir do input
        Scanner input = new Scanner(System.in);

        System.out.print("Entre com valor de deposito para conta1: ");
        double depositarValor = input.nextDouble();

       System.out.printf("adicionado %.2f  na conta1: %n%n", depositarValor);
       account1.deposito(depositarValor); // add o saldo na conta1

//     Exibir os saldos
       System.out.printf("%s, saldo: $%.2f %n", account1.getNome(), account1.getBalanco());
       System.out.printf("%s, saldo: $%.2f %n%n", account2.getNome(), account2.getBalanco());

        System.out.print("Entre com valor de deposito para conta2: ");
        depositarValor = input.nextDouble();

        System.out.printf("adicionado %.2f  na conta2: %n%n", depositarValor);
        account2.deposito(depositarValor); // add o saldo na conta1

//     Exibir os saldos
        System.out.printf("%s, saldo: $%.2f %n", account1.getNome(), account1.getBalanco());
        System.out.printf("%s, saldo: $%.2f %n", account2.getNome(), account2.getBalanco());




        input.close();

    }

}
