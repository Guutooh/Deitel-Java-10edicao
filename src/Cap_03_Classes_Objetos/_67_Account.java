package Cap_03_Classes_Objetos;

public class _67_Account {

    private String nome;
    private double balanco;

    // Construtor de Account que recebe dois parâmetros
    public _67_Account(String nome, double balanco) {
        this.nome = nome;

        if (balanco > 0.0)
            this.balanco = balanco;
    }

    // metodo que deposita apenas uma quantia valida no saldo
    public void deposito(double depositoQuantia) {
        if (depositoQuantia > 0.0)
            balanco += depositoQuantia;
    }

    // metodo que retorna o saldo da conta
    public double getBalanco() {
        return balanco;
    }

    // metodo que define o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // metodo que retorna o nome
    public String getNome() {

        return nome;
    }


}
