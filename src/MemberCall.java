public class MemberCall {
    int instanceVariable = 10;
    static int classVariable = 20;

    int instanceVariable2 = classVariable;
    //    static int classVariable2 = instanceVariable; >> 클래스 변수는 인스턴스 변수 사용 불가능
    static int classVariable2 = new MemberCall().instanceVariable; // >> 객체를 생성해야 사용 가능

    static void staticMethod1() {
        System.out.println(classVariable);
        //    System.out.println(instanceVariable); >> 클래스 메서드에서 인스턴스 변수 사용 불가능
        MemberCall c = new MemberCall();
        System.out.println(c.instanceVariable); // >> 객체를 생성한 후에 사용 가능
    }

    void instanceMethod1() {
        System.out.println(classVariable);
        System.out.println(classVariable2);
        System.out.println(instanceVariable);
    }

    static void staticMethod2() {
        staticMethod1();
        //      instanceMethod1(); >> 클래스메서드에서 인스턴스메서드 호출 불가능
        MemberCall c = new MemberCall();
        c.instanceMethod1();
    }

    void instanceVariable2() {
        staticMethod1();
        instanceMethod1();
    }
}
