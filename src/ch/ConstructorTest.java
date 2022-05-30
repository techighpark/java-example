package ch;

class Data1 {
    int value;
}

class Data2 {
    int value;

    Data2(int x) {
        value = x;
    }

    Data2() {
    }


}

public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        // ch.Data2 d2 = new ch.Data2(); >> Error -> 기본 생성자 없음 -> constructor 만들어줘야함
        Data2 d21 = new Data2(1);
        Data2 d22 = new Data2(); // Error 없음
    }
}
