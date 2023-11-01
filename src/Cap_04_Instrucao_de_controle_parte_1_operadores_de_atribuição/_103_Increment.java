package Cap_04_Instrucao_de_controle_parte_1_operadores_de_atribuição;

public class _103_Increment {
    public static void main(String[] args) {

        //demonstra o operador de pós incremento
        int c = 5;

        System.out.printf("C antes do pós-incremento: %d%n", c); // imprime 5
        System.out.printf("pós-incremento de C: %d%n", c++); // imprime 5
        System.out.printf("pré-incremento de C: %d%n", c); // imprime 6

        System.out.println(); // pula uma linha

        // demonstra o operador de pré-incremento
        c = 5;
        System.out.printf("C antes do pós-incremento: %d%n", c); // imprime 5
        System.out.printf("pré-incremento de C: %d%n", ++c); // imprime 6
        System.out.printf("C após pré-incremento: %d%n", c); // imprime 6
    }
}


