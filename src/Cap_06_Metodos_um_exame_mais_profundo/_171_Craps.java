package Cap_06_Metodos_um_exame_mais_profundo;

import java.security.SecureRandom;

public class _171_Craps {

    private static final SecureRandom randomNumber = new SecureRandom();

    private enum Status{CONTINUE, WON, LOST};

    //constantes que representam lançamentos comuns
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CAR = 12;


    public static void main(String[] args) {

        int pontos = 0;
        Status gameStatus;
        int sumOfDie = rollDice();

        switch (sumOfDie){
            case SEVEN:
            case YO_LEVEN:
                gameStatus =  Status.WON;
                break;
            case SNAKE_EYES:
            case TREY:
            case BOX_CAR:
                gameStatus = Status.LOST;
                break;
            default:
                gameStatus = Status.CONTINUE;
                pontos = sumOfDie;
                System.out.printf("Point is %d%n", pontos);
                break;
        }

        while (gameStatus == Status.CONTINUE){
            sumOfDie = rollDice();

            if ((sumOfDie == pontos))
                gameStatus = Status.WON;
            else
                if(sumOfDie == SEVEN){
                    gameStatus = Status.LOST;
                }
        }
        if(gameStatus == Status.WON)
            System.out.println("Win");
        else
            System.out.println("Lose");

        }
        public static int rollDice(){
            int die1 = 1 + randomNumber.nextInt(6);
            int die2 = 1 + randomNumber.nextInt(6);
            int sum  = die1 + die2;

            System.out.printf("Player rollad %d + %d = %d%n", die1, die2, sum);

            return sum;
    }
}
