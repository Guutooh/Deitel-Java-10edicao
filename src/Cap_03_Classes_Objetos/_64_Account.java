package Cap_03_Classes_Objetos;

public class _64_Account {
    private String nome; // variavel de instacia


    public _64_Account (String nome){ // o construtor inicializa name com nome de parametro

        this.nome = nome;
    }


    public void setNome(String nome){

        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }


}
