package Cap_06_Metodos_um_exame_mais_profundo;

import java.security.SecureRandom;

public class _170_RollDie {
    public static void main(String[] args) {

        //Números aleatórios seguros
        SecureRandom random = new SecureRandom();

        // contagem de lançados
        int frequencia1 = 0;
        int frequencia2 = 0;
        int frequencia3 = 0;
        int frequencia4 = 0;
        int frequencia5 = 0;
        int frequencia6 = 0;

        for (int roll = 1; roll <= 600000000; roll++) {
            int face = 1 + random.nextInt(6);

            switch (face) {
                case 1:
                    ++frequencia1; // incrementa o contador de 1s
                    break;
                case 2:
                    ++frequencia2; // incrementa o contador de 2s
                    break;
                case 3:
                    ++frequencia3; // incrementa o contador de 3s
                    break;
                case 4:
                    ++frequencia4; // incrementa o contador de 4s
                    break;
                case 5:
                    ++frequencia5; // incrementa o contador de 5s
                    break;
                case 6:
                    ++frequencia6; // incrementa o contador de 6s
                    break;
            }
        }

        System.out.println("Face\tFrequencia"); // cabeçalhos de saída
        System.out.printf("1\t\t%d%n2\t\t%d%n3\t\t%d%n4\t\t%d%n5\t\t%d%n6\t\t%d%n",
                frequencia1, frequencia2, frequencia3, frequencia4, frequencia5, frequencia6);

    }
}
