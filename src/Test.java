public class Test {
    int variable1;
    int variable2;
    static int variable3;

    Test() {
        this(100, 200, 300);
    }

    Test(int v1, int v2) {
        this(v1, v2, 200);

        /* this.variable1 = v1;
        variable2 = v2;
        variable3 = v3; */
    }

    Test(int v1, int v2, int v3) {
        this.variable1 = v1;
        variable2 = v2;
        variable3 = v3;
    }

}

class SubTest {
    public static void main(String[] args) {
        Test t = new Test(200, 300);
        System.out.println(t.variable1);
        System.out.println(t.variable2);
        System.out.println(Test.variable3);
    }
}
