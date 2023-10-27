package Cap_04_Instruções_de_controle_parte_1_operadores_de_atribuição;

import java.util.Scanner;

public class _96_ClassAverage {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int total = 0;
        int gradeCounter = 0;

        System.out.print("Entre com a nota e -1 para sair: ");
        int grade = input.nextInt();

        while (grade != -1){
            total += grade; // adiciona nota ao total
            gradeCounter += 1; //incrementa contador

            System.out.print("Entre com a nota e -1 para sair: ");
            grade = input.nextInt();

        }

        //fase de termino
        // se usuario inseriu ao menos uma nota.

        if(gradeCounter != 0){
            double media = (double) total / gradeCounter;

            System.out.printf("%nTota de notas %d inseridas é %d%n",gradeCounter, total);
            System.out.printf("média de notas é %.2f%n", media);
        }
        else {
            //Se nenhuma nota for inserida;
            System.out.println("Nenhuma nota inserida");
        }



        input.close();
    }
}
