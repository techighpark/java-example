package ch7;


import java.util.Vector;

class Tv7 extends Product6 {
    Tv7() {
        super(100);
    }

    public String toString() {
        return "TV";
    }
}

class Computer7 extends Product6 {
    Computer7() {
        super(200);
    }

    public String toString() {
        return "Computer7";
    }
}

class Audio7 extends Product6 {
    Audio7() {
        super(50);
    }

    public String toString() {
        return "Audio7";
    }
}

class Buyer7 {
    int money;
    int bonusPoint;
    Vector item = new Vector();

    Buyer7(int m, int b) {
        this.money = m;
        this.bonusPoint = b;
    }

    void buy(Product6 p) {
        if (money < p.price) {
            System.out.println("not enough money");
            return;
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item.add(p);
        System.out.println(p + " done");
    }

    void refund(Product6 p) {
        if (item.remove(p)) {
            money += p.price;
            bonusPoint -= p.bonusPoint;
            System.out.println(p + " refund");
        } else {
            System.out.println("don't have");
        }
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        if (item.isEmpty()) {
            System.out.println("empty");
        }
        for (int i = 0; i < item.size(); i++) {
            Product6 p = (Product6) item.get(i);
            sum += p.price;
            itemList += (i == 0) ? "" + p : ", " + p;
        }
        System.out.println(sum);
        System.out.println(itemList);
    }
}


public class PolyArgumentTest3 {
    public static void main(String[] args) {
        Buyer7 b = new Buyer7(1000, 0);
        Tv7 tv = new Tv7();
        Computer7 com = new Computer7();
        Audio7 audio = new Audio7();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
        System.out.println();
        b.refund(com);
        b.summary();
    }
}
