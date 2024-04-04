package Cap_04_Instruções_de_controle_parte_1_operadores_de_atribuição;

import java.util.Scanner;

public class _91_ClassAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //inicialização
        int total = 0;
        int contador = 1;

        while (contador <=10) { // fazer o looping 10x

            System.out.print("Insira a nota: ");
            int nota = input.nextInt();
            total += nota;
            contador += +1;

        }

        int media = total /10;
        // exibe o total e a média das notas
        System.out.printf("%nTotal de todas as  10 notas é %d%n", total);
        System.out.printf("média da turma é: %d%n", media);

    }
}
