package ch7;


public class BindingTest2 {
    public static void main(String[] args) {
        Parent4 p = new Child4();
        Child4 c = new Child4();
        System.out.println(p.x);
        p.method();
        System.out.println(c.x);
        c.method();
    }
}

class Parent4 {
    int x = 100;

    void method() {
        System.out.println("parent method");
    }
}

class Child4 extends Parent4 {

}