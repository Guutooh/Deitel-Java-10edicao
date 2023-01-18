package Cap_03_Classes_Objetos;

import java.util.Scanner;

public class _59_AccountTest {

    public static void main(String[] args) {

        // Obter entrada
        Scanner entrada = new Scanner(System.in);

        // Criando um objeto do tipo Account e atribuindo a myAccount
        _57_Account myAccount = new _57_Account();

        System.out.printf("Nome inicial é: %s%n%n", myAccount.getName());

        System.out.print("Entre com nome: ");
        String nome = entrada.nextLine();
        myAccount.setName(nome);
        System.out.println();

        // exibindo o nome armazenado no objeto que foi criado MyAccount
        System.out.printf("Nome no objeto MyAccount é: %n%s%n", myAccount.getName());

        entrada.close();

    }
}