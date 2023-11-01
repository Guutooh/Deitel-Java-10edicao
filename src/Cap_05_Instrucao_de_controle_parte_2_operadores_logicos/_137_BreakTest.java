package Cap_05_Instrucao_de_controle_parte_2_operadores_logicos;

public class _137_BreakTest {
    public static void main(String[] args) {

        int count;

        for (count = 1; count <= 10; count++){
            if (count == 5)
                break;
            System.out.printf("%d ", count);
        }
        System.out.printf("%nSaiu do loop na contagem = %d%n", count);
    }
}
