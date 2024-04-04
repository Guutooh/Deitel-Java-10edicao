package Cap_06_Metodos_um_exame_mais_profundo;

import java.util.Locale;
import java.util.Scanner;

public class _162_MaximumFinder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);;

        System.out.print("Entre com os valores separados por espaços: ");
        double numero1 = input.nextDouble();
        double numero2 = input.nextDouble();
        double numero3 = input.nextDouble();

        double resultado = maximo (numero1, numero2, numero3);

        System.out.println("Maximo é: " + resultado);

    }

    public static double maximo(double numero1, double numero2, double numero3) {

//        double maximoValor = numero1;
//
//        if(numero2> maximoValor)
//            maximoValor = numero2;
//
//        if(numero3 > maximoValor)
//            maximoValor = numero3;
//
//        return maximoValor;

        return Math.max(numero1,Math.max(numero2, numero3));
    }
}
