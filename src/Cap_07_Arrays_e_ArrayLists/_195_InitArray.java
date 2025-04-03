package Cap_07_Arrays_e_ArrayLists;

public class _195_InitArray {
    public static void main(String[] args) {


        int[] array = new int[10];
        System.out.printf("%s%8s%n", "index", "valor");

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5d%8d%n", i, array[i]);
        }
    }

}
