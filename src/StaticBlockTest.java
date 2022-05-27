public class StaticBlockTest {

    static int[] arr = new int[10];
    // explicit initialization

    static {
        System.out.println("static { }");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10) + 1;
        }
    }
    // static initialization
    

    public static void main(String[] args) {
        System.out.println("main");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] : " + arr[i]);
        }
    }
}
