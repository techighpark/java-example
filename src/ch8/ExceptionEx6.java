package ch8;

public class ExceptionEx6 {
    public static void main(String[] args) {
        try {
            throw new Exception("an error that was intentionally caused");

        } catch (Exception e) {
            System.out.println("ERROR : " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Program ended.");
    }
}
