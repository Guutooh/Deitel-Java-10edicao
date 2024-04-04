package Cap_06_Metodos_um_exame_mais_profundo;

public class _177_MethodOverload {

    public static void main(String[] args) {
        System.out.printf("O quadrado do número tipo inteiro 7 é %d%n ",square(7));
        System.out.printf("O quadrado do número tipo double 7 é %f%n ",square(7.5));
    }

    public static int square(int intValue) {
        System.out.printf("%nChamando método com argumento inteiro %d%n", intValue);
        return intValue * intValue;
    }

    public static double square(double doubleValue) {
        System.out.printf("%nChamando método com argumento double %.2f%n", doubleValue);
        return Math.pow(doubleValue,2);
    }
}
