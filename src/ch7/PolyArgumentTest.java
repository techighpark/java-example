package ch7;

class Product {
    int price;
    int bonusPoint;

    Product(int price) {
        this.price = price;
        this.bonusPoint = (int) (price / 10.0);
    }
}

class Tv3 extends Product {
    Tv3() {
        super(100);
    }

    public String toString() {
        return "TV";
    }
}

class Computer3 extends Product {
    Computer3() {
        super(200);
    }

    public String toString() {
        return "Computer";
    }
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if (money < p.price) {
            System.out.println("Not enough money to buy");
        }
        money -= p.price;
        bonusPoint += p.bonusPoint;
        System.out.println("Purchased " + p);
    }

}

public class PolyArgumentTest {
    public static void main(String[] args) {
        Buyer b = new Buyer();
        Tv3 tv3 = new Tv3();
        Computer3 c3 = new Computer3();

        b.buy(tv3);
        b.buy(c3);

        System.out.println("rest money : " + b.money);
        System.out.println("bonus point : " + b.bonusPoint);
    }
}
