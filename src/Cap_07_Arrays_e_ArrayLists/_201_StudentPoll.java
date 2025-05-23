package Cap_07_Arrays_e_ArrayLists;

public class _201_StudentPoll {
    public static void main(String[] args) {

        // array das respostas dos alunos (mais tipicamente, inserido em tempo de execução)
        int[] responses = {1, 2, 5, 4, 3, 5, 2, 1, 3, 3, 1, 4, 3, 3, 3, 2, 3, 3, 2, 14};

        int[] frequencia = new int[6];// array contador de frequencia

        // para cada resposta, seleciona elemento de respostas e utiliza esse valor
        // como índice de frequência para determinar elemento a incrementar

        for (int answer = 0; answer < responses.length; answer++) {
            try {
                ++frequencia[responses[answer]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf("responses[%d] = %d%n%n", answer, responses[answer]);
            }
        }

        System.out.printf("%s%10s%n", "Rating", "Frequency");

        for (int rating = 1; rating < frequencia.length; rating++)
            System.out.printf("%6d%10d%n", rating, frequencia[rating]);
    }

}

