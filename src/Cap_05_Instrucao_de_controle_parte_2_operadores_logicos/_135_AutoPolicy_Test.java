package Cap_05_Instrucao_de_controle_parte_2_operadores_logicos;

public class _135_AutoPolicy_Test {

    public static void main(String[] args) {

        _135_AutoPolicy policy1 = new _135_AutoPolicy(1111111, "Toyota", "NJ");
        _135_AutoPolicy policy2 = new _135_AutoPolicy(2222222, "Fusion", "ME");


        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);

    }

    public static void policyInNoFaultState(_135_AutoPolicy policy) {
        System.out.println("The auto policy:");
        System.out.printf(
                "Account #: %d; Car: %s; State %s %s a no-fault state%n%n",
                policy.getNumeroConta(),
                policy.getModeloApolice(),
                policy.getEstado(),
                (policy.eSemCulpa() ? "is" : "is not"));
    }
}
