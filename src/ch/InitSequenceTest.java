package ch;

public class InitSequenceTest {
    static int count = 0;
    int serialNo;

    {
        ++count;
        serialNo = count;
    }
    // instance 생성될 때 마다 실행 --> serialNo 1씩 증가

    public InitSequenceTest() {
    }
}

class InitSequence {
    public static void main(String[] args) {
        // serialNo 0 + 1 = 1
        InitSequenceTest ist1 = new InitSequenceTest();
        // serialNo 1 + 1 = 2
        InitSequenceTest ist2 = new InitSequenceTest();
        // serialNo 2 + 1 = 3
        InitSequenceTest ist3 = new InitSequenceTest();

        System.out.println("ist1 " + ist1.serialNo);
        System.out.println("ist2 " + ist2.serialNo);
        System.out.println("ist2 " + ist3.serialNo);
        System.out.println(InitSequenceTest.count);

    }
}
