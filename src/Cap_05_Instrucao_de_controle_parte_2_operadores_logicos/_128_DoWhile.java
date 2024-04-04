package Cap_05_Instrucao_de_controle_parte_2_operadores_logicos;

public class _128_DoWhile {
    public static void main(String[] args) {
        int contador = 1;
        do{
            System.out.printf("%d ", contador);
            ++contador;
        }while (contador<=10);

        System.out.println();
    }
}
