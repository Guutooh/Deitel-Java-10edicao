package Cap_05_Instrucao_de_controle_parte_2_operadores_logicos;

/*
Você foi contratado por uma companhia de seguros de automóvel que atende estes estados do nordeste dos Estados
Unidos — Connecticut, Maine, Massachusetts, New Hampshire, Nova Jersey, Nova York, Pensilvânia, Rhode Island
e Vermont. A empresa quer que você crie um programa que produz um relatório indicando para cada uma das
apólices de seguro de automóvel se a apólice é válida em um estado com seguro de automóvel “sem culpa” (modalidade
de seguro em que o segurado é indenizado independentemente de sua responsabilidade no sinistro) — Massachusetts,
Nova Jersey, Nova York e Pensilvânia.
 */
public class _135_AutoPolicy {


    private int numeroConta;
    private String modeloApolice;
    private String estado;

    public _135_AutoPolicy(int numeroConta, String modeloApolice, String estado) {
        this.numeroConta = numeroConta;
        this.modeloApolice = modeloApolice;
        this.estado = estado;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getModeloApolice() {
        return modeloApolice;
    }

    public void setModeloApolice(String modeloApolice) {
        this.modeloApolice = modeloApolice;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    public boolean eSemCulpa() {
        boolean semCulpa;

        switch (getEstado()) {
            case "MA":
            case "NJ":
            case "NY":
            case "PA":
                semCulpa = true;
                break;
            default:
                semCulpa = false;
                break;
        }
        return semCulpa;
    }
}