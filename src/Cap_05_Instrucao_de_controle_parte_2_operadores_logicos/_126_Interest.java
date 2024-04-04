package Cap_05_Instrucao_de_controle_parte_2_operadores_logicos;

/*
Considere o seguinte problema:
Uma pessoa investe US$ 1.000 em uma conta-poupança que rende juros de 5% ao ano. Supondo que todo
o juro seja aplicado, calcule e imprima a quantia de dinheiro na conta no fim de cada ano por 10 anos.
Utilize a seguinte fórmula para determinar as quantidades:
a = p (1 + r)n
onde
p é a quantia original investida (isto é, o principal)
r é a taxa de juros anual (por exemplo, utilize 0,05 para 5%)
n é o número de anos
a é a quantia em depósito no fim do n-ésimo ano.
 */
public class _126_Interest {

    public static void main(String[] args) {


        double quantia; // quantia em deposito de cada ano
        double principal = 1000; // quantia inicial antes do juros
        double juros = 0.05; // taxa de juros


        System.out.printf("%5s %26s %n", "ano", "quantia depositada");

        //calculo para cada um dos dez anos
        for(int ano = 1; ano <= 10; ++ano){

            quantia = principal * Math.pow(1.0 + juros ,ano);

            System.out.printf("%4d%, 20.2f%n", ano, quantia);
        }

    }
}
