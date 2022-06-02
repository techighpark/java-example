package ch9;


class Card2 {
    String kind;
    int number;

    Card2() {
        this("SPADE", 1);
    }

    Card2(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public String toString() {
        return "kind : " + kind + ", number : " + number;
    }
}

public class CardToString2 {
    public static void main(String[] args) {
        Card2 c1 = new Card2();
        Card2 c2 = new Card2("HEART", 5);

        System.out.println(c1);
        System.out.println(c2.toString());
        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
    }
}

