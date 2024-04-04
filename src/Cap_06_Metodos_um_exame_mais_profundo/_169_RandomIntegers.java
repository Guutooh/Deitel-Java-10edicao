package Cap_06_Metodos_um_exame_mais_profundo;

import java.security.SecureRandom;

public class _169_RandomIntegers {
    public static void main(String[] args) {

        //Números aleatórios seguros
        SecureRandom random = new SecureRandom();

        for(int contador =1; contador <=20; contador++){

            //seleciona o inteiro aleatorio entre 1 e 6
            int face = 1 + random.nextInt(6);

            System.out.printf("%d ", face); // valor gerado

            //se divisivel por 5, inicia uma nova linha
            // basicamente é para gerar 5 numeros e pular de linha
            if (contador % 5 == 0){
                System.out.println();
            }
        }
    }
}
