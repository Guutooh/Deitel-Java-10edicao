package Cap_07_Arrays_e_ArrayLists;

public class _196_InitArray2 {

    public static void main(String[] args) {

       final int ARRAY_LENGTH = 10;

       int[] array = new int[ARRAY_LENGTH];

       for (int i = 0; i < array.length; i++) {
           array[i] = 2 + 2 * i;
       }
        System.out.printf("%s%8s%n", "Index", "Value");

       for (int i = 0; i < array.length; i++) {
           System.out.printf("%5d%8d%n", i, array[i]);
       }
    }
}
