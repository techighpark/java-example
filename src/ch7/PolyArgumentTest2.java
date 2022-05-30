package ch7;

class Product6 {
    int price;
    int bonusPoint;

    Product6(int price) {
        this.price = price;
        this.bonusPoint = (int) (price / 10.0);
    }

    Product6() {
        price = 0;
        bonusPoint = 0;
    }
}

class Tv6 extends Product6 {
    Tv6() {
        super(100);
    }

    public String toString() {
        return "Tv";
    }
}

class Computer6 extends Product6 {
    Computer6() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Audio6 extends Product6 {
    Audio6() {
        super(50);
    }

    public String toString() {
        return "Audio";
    }
}

class Buyer6 {
    int money = 1000;
    int bonusPoint = 0;
    Product6[] item = new Product6[10];
    int i = 0;

    void buy(Product6 p) {
        if (money < p.price) {
            System.out.println("no money");
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        item[++i] = p;
        System.out.println(p);
        System.out.println(item[i]);
    }

    void summary() {
        int sum = 0;
        StringBuilder itemList = new StringBuilder();
        for (Product6 product6 : item) {
            if (product6 == null) break;
            sum += product6.price;
            itemList.append(product6).append(", ");
        }

        System.out.println(sum);
        System.out.println(itemList);
        System.out.println("123");
    }
}


public class PolyArgumentTest2 {
    public static void main(String[] args) {
        Buyer6 b = new Buyer6();
        Tv6 tv = new Tv6();
        Computer6 com = new Computer6();
        Audio6 audio = new Audio6();

        b.buy(tv);
        b.buy(com);
        b.buy(audio);
        b.summary();
    }
}
