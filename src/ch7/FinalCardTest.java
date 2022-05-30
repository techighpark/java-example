package ch7;

class Card2 {
    final int NUMBER;
    final String KIND;
    static int width = 100;
    static int height = 250;

    Card2(String kind, int num) {
        KIND = kind;
        NUMBER = num;
    }

    Card2() {
        this("Heart", 1);
    }

    public String toString() {
        return KIND + " " + NUMBER;
    }
}

public class FinalCardTest {
    public static void main(String[] args) {
        Card2 c = new Card2("HEART", 10);
        // c.NUMBER = 5; -> error
        System.out.println(c.KIND);
        System.out.println(c.NUMBER);
    }
}
