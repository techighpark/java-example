package ch;

public class CallStackTest2 {
    public static void main(String[] args) {
        System.out.println("main(String[] args) started.");
        firstMethod();
        System.out.println("main(String[] args) done.");
    }

    static void firstMethod() {
        System.out.println("firstMethod() started.");
        secondMethod();
        System.out.println("firstMethod() done.");
    }

    static void secondMethod() {
        System.out.println("secondMethod() started.");
        System.out.println("secondMethod() done.");

    }
}
