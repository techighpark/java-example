package ch7;

public class BindingTest {
    public static void main(String[] args) {
        Parent3 p = new Child3();
        Child3 c = new Child3();
        System.out.println(p.x);
        p.method();
        System.out.println(c.x);
        c.method();
    }
}

class Parent3 {
    int x = 100;

    void method() {
        System.out.println("parent method");
    }
}

class Child3 extends Parent3 {
    int x = 200;

    void method() {
        System.out.println("child method");
    }
}