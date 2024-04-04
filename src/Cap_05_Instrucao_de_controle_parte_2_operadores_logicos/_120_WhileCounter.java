package Cap_05_Instrucao_de_controle_parte_2_operadores_logicos;

public class _120_WhileCounter {
    public static void main(String[] args) {
        int contador = 1;

        while (contador <= 10){
            System.out.printf("%d ", contador);
            ++contador;
        }
        System.out.println();
    }

}
