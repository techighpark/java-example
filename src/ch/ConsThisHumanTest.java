package ch;

class Human {
    String color;
    int height;
    int age;

    Human() {
        this("white", 180, 30);
    }

    Human(Human h) {
        color = h.color;
        height = h.height;
        age = h.age;
    }

    Human(String color, int height, int age) {
        this.color = color;
        this.height = height;
        this.age = age;
    }
}

public class ConsThisHumanTest {
    public static void main(String[] args) {

        Human h1 = new Human();
        System.out.println(h1.color);
        System.out.println(h1.height);
        System.out.println(h1.age);

        Human h2 = new Human(h1);
        System.out.println(h2.color);
        System.out.println(h2.height);
        System.out.println(h2.age);

        h1.height = 170;
        System.out.println(h1.height);
        System.out.println(h2.height);

    }
}
