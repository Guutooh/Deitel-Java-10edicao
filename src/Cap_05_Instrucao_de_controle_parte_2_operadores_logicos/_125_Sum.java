package Cap_05_Instrucao_de_controle_parte_2_operadores_logicos;

public class _125_Sum {

    public static void main(String[] args) {

        int total = 0;

        for (int numero = 2; numero <= 20; numero +=2){
            total +=  numero;

            System.out.printf("%d ", numero);

        }
        System.out.println();
            System.out.printf("A soma total é: %d ", total);
    }
}
