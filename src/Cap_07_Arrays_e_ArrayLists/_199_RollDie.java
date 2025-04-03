package Cap_07_Arrays_e_ArrayLists;

import java.security.SecureRandom;

public class _199_RollDie {
    public static void main(String[] args) {

        SecureRandom random = new SecureRandom();
        int[] frequencia = new int[7];

        // lança o dado 6.000.000 vezes; usa o valor do dado como índice de frequência
        for (int i = 1; i < 6000000; i++) {
            ++frequencia[1 + random.nextInt(6)];
        }

        System.out.printf("%s%10s%n", "Face", "Frequency");

        // gera saída do valor de cada elemento do array
        for (int face = 1; face < frequencia.length; face++){
            System.out.printf("%4d%10d%n", face, frequencia[face]);
        }
    }

}
