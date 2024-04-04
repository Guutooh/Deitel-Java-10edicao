package Cap_05_Instrucao_de_controle_parte_2_operadores_logicos;

import java.util.Scanner;

/*
classe LetterGrades utiliza a instrução switch para contar as letras das notas escolares.
 */
public class _130_LetterGrades {
    public static void main(String[] args) {

        int sair = -1;

        int total = 0; // soma das notas
        int contadorNotas = 0; // número de notas inseridas
        int aCount = 0; // contagem de notas A
        int bCount = 0; // contagem de notas B
        int cCount = 0; // contagem de notas C
        int dCount = 0; // contagem de notas D
        int fCount = 0; // contagem de notas F

        Scanner input = new Scanner(System.in);


        System.out.printf("insira uma nota de 0 a 100 (pressione -1 para sair)");
        // faz loop até o usuário inserir o indicador de fim do arquivo
        while (input.hasNext()) {

            int grade = input.nextInt(); // lê a nota

            if (grade == sair) {
                // Se o usuário inseriu -1, saia do loop
                break;
            }

            total += grade; // adiciona nota a total
            ++contadorNotas; // incrementa o número de notas

            // incrementa o contador de letras de nota adequado
            switch (grade / 10) {
                case 9: // a nota estava entre 90
                case 10: // e 100, inclusivo
                    ++aCount;
                    break; // sai do switch

                case 8: // nota estava entre 80 e 89
                    ++bCount;
                    break; // sai do switch

                case 7: // nota estava entre 70 e 79
                    ++cCount;
                    break; // sai do switch

                case 6: // nota estava entre 60 e 69
                    ++dCount;
                    break; // sai do switch

                default: // a nota era menor que 60
                    ++fCount;
                    break; // opcional; fecha switch de qualquer maneira
            } // fim do switch
        } // fim do while

        // exibe o relatório da nota
        System.out.printf("%nGrade Report:%n");

        // se usuário inseriu pelo menos uma nota...
        if (contadorNotas != 0) {
            // calcula a média de todas as notas inseridas
            double average = (double) total / contadorNotas;

            // gera a saída de resumo de resultados
            System.out.printf("Total of the %d grades entered is %d%n",
                    contadorNotas, total);
            System.out.printf("Class average is %.2f%n", average);
            System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
                    "Número de alunos que receberam cada nota:",
                    "A: ", aCount, // exibe número de notas A
                    "B: ", bCount, // exibe número de notas B
                    "C: ", cCount, // exibe número de notas C
                    "D: ", dCount, // exibe número de notas D
                    "F: ", fCount); // exibe número de notas F
        } // fim do if
        else // nenhuma nota foi inserida, assim gera a saída da mensagem apropriada
            System.out.println("Nenhuma nota foi inserida");
    } // fim de main
} // finaliza a classe letterGrades


