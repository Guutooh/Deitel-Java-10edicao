package Cap_07_Arrays_e_ArrayLists;

public class _203_Card {

  private final String face;
  private final String suit;

    public _203_Card(String face, String suit) {
        this.face = face;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return face + " Of " + suit;
    }
}
