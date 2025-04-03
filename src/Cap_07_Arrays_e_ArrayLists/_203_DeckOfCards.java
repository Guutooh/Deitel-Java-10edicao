package Cap_07_Arrays_e_ArrayLists;

import java.security.SecureRandom;

public class _203_DeckOfCards {

    private _203_Card[] deck;
    private int currentCard;
    private static final int NUMBER_OF_CARDS = 52;

    private static final SecureRandom randomNumbers = new SecureRandom();

    public _203_DeckOfCards() {

        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Jack", "Queen", "King"};

        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

        deck = new _203_Card[NUMBER_OF_CARDS];
        currentCard = 0;

        for (int count = 0; count < NUMBER_OF_CARDS; count++) {
            deck[count] = new _203_Card(faces[count % 13], suits[count / 13]);
        }
    }

    public void shuffle() {

        currentCard = 0;

        for (int first = 0; first < deck.length; first++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            // compara Card atual com Card aleatoriamente selecionada
            _203_Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public  _203_Card dealCard() {
        if (currentCard < deck.length)
            return deck[currentCard++];
        else
            return null;
    }


}
