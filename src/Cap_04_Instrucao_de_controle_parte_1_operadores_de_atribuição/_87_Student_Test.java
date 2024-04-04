package Cap_04_Instrucao_de_controle_parte_1_operadores_de_atribuição;

public class _87_Student_Test {
    public static void main(String[] args) {

        _87_Student account1 = new _87_Student("Jane Green" ,93.5);
        _87_Student account2 = new _87_Student("John Blue" ,18.75);

        System.out.printf("%s's, letter grade is: %s%n",account1.getName(), account1.getLetterGrade());
        System.out.printf("%s's, letter grade is: %s%n",account2.getName(), account2.getLetterGrade());


    }


}
