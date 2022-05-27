class VariableRest {
    int x; // don't need to be initialized
//    int y = x;

    void method() {
        int i;
        i = 10; // should be initialized
        int j = i;
        System.out.println(j);
//        System.out.println(y);
    }

}

class Test {
    public static void main(String[] args) {
        VariableRest vr = new VariableRest();
        vr.method();
    }
}
