package ch;

public class CardTest {
    public static void main(String[] args) {
        System.out.println(Card.width);
        System.out.println(Card.height);

        Card c1 = new Card();
        c1.kind = "Space";
        c1.number = 7;
        System.out.println(c1.kind + ", " + c1.number);


        Card c2 = new Card();
        c2.kind = "Heart";
        c2.number = 10;
        System.out.println(c2.kind + ", " + c2.number);

        System.out.println(Card.width);
        Card.width = 50;
        System.out.println(Card.width);
        Card.width = 30;
        System.out.println("C1 width changed to 50.");
        System.out.println(Card.width);

    }
}


class Card {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}
