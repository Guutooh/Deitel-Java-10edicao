package Cap_05_Instrucao_de_controle_parte_2_operadores_logicos;

public class _138_ContinueTest {
    public static void main(String[] args) {

        for (int count = 1; count <= 10; count++){
            if (count == 5)
                continue;
            System.out.printf("%d ", count);
        }
        System.out.printf("%nUsado continuar para pular a impressão 5%n");
    }
}
