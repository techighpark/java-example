package ch;

class TestOOP {
    static String staticString = "static";
    String instanceString;


    TestOOP() {
        this("instance");
        System.out.println(this.instanceString);
    }

    TestOOP(String instanceString) {
        this.instanceString = instanceString;
        System.out.println(instanceString);
        System.out.println(staticString + " can be accessed");
    }
}

public class personalTest {
    public static void main(String[] args) {
        TestOOP to = new TestOOP("instance");
        System.out.println(TestOOP.staticString);

        System.out.println("before : " + to.instanceString);
        to.instanceString = "instance modified";
        System.out.println("after : " + to.instanceString);


        TestOOP to2 = new TestOOP("abc");
        System.out.println("to2 : " + to2.instanceString);


        TestOOP to3 = new TestOOP();
        System.out.println("to3 : " + to3.instanceString);
    }

}


