package Cap_04_Instrucao_de_controle_parte_1_operadores_de_atribuição;

public class _87_Student {

    private String name;
    private double average;

    // construtor
    public _87_Student(String name, double average) {
        this.name = name;

        // valida que a media é >0 e <= 100, caso contrario
        // armazena o valor padrão da média da variavel de instacia (0.0)
        if (average > 0.0) if (average <= 100) this.average = average;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //definir a média de Student
    public void setAverage(double studentAverage) {
        // valida que a media é >0 e <= 100, caso contrario
        // armazena o valor padrão da média da variavel de instacia (0.0)
        if (average > 0.0) if (average <= 100) this.average = average;
    }

    //recupera a média de Student
    public double getAverage() {
        return average;
    }

    //determina e retorna a letra da nota de Student
    public String getLetterGrade() {

        String letterGrade = "";
        if (average >= 90.0) letterGrade = "A";
        else if (average >= 80.0) letterGrade = "B";
        else if (average >= 70.0) letterGrade = "C";
        else if (average >= 60.0) letterGrade = "D";
        else letterGrade = "F";

        return letterGrade;
    }


}
