public class TvTest2 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println(t1.channel);
        System.out.println(t2.channel);

        t1.channel = 7;
        System.out.println("T1's channel has been changed" + t1.channel);

        System.out.println("t1's channel is " + t1.channel);
        System.out.println("t2's channel is " + t2.channel);
        System.out.println("t2's channel is " + t2.channel);
        System.out.println("t2's channel is " + t2.channel);
    }
}
