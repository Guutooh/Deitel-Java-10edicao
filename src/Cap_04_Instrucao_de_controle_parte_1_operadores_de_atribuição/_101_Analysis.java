package Cap_04_Instrucao_de_controle_parte_1_operadores_de_atribuição;

import java.util.Scanner;

public class _101_Analysis {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //inicializando as variaveis
        int passes = 0;
        int falhas = 0;
        int contadorEstudante = 1;

        //Processa 10 alunos utilizando loop
        while (contadorEstudante <= 10){

            // solicitacao de um valor para usuario
            System.out.print("Entre com um resultado (1 = passou, 2 = falhou): ");
            int resultado = input.nextInt();

            if (resultado == 1){
               passes +=1;
                //passes = passes + 1;
            }else{
                falhas +=1;
                //falhas = falhas + 1;
            }


            //incremeta contador
            contadorEstudante += 1;
        }

        //preparacao e exibição dos resultados
        System.out.printf("Passou: %d%nFalhou: %d%n", passes, falhas);

        //determinacao se mais de 8 alunos foram aprovados
        if (passes>8){
            System.out.println("Bonus!");
        }

    }
}
