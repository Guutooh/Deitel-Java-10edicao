package Cap_07_Arrays_e_ArrayLists;

public class _199_BarChart {
    public static void main(String[] args) {

        int[] array = { 0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1 };

        System.out.println("Distribuição das notas");

        //para cada elemento de array, gera saida de uma barra do grafico
        for (int i = 0; i < array.length; i++) {

            // gera saída do rótulo de barra ( "00-09: ", ..., "90-99: ", "100: ")
            if(i ==10)
                System.out.printf("%5d: ", 100);
            else
                System.out.printf("%02d-%2d: ", i * 10, i * 10 + 9);

            //imprime a barra de asteriscos
            for (int star = 0; star < array.length; star++) {
                System.out.print("*");
            }
                System.out.println();
        }
    }
}
