package ch9;

public class StringEx4 {
    public static void main(String[] args) {
        String[] words = {
                new String("aaa"), new String("bbb"), new String("ccc")
        };

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("ccc")) {
                System.out.println("words에서 equals메서드로 찾았습니다");
            }
            if (words[i] == "ccc") {
                System.out.println("words에서 == 연산자로 찾았습니다.");
            }

        }
        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].intern();

        }
        System.out.println("intern method");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("ccc")) {
                System.out.println("words에서 equals메서드로 찾았습니다");
            }
            if (words[i] == "ccc") {
                System.out.println("words에서 == 연산자로 찾았습니다.");
            }
        }
    }
}
