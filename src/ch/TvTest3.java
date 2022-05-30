package ch;

public class TvTest3 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println(t1.channel);
        System.out.println(t2.channel);

        t2 = t1;
        t1.channel = 10;
        System.out.println("T1's channel has been changed to " + t1.channel);

        System.out.println("T1 channel " + t1.channel);
        System.out.println("T2 channel " + t2.channel);
        System.out.println("T2 channel " + t2.channel);
        System.out.println("T2 channel " + t2.channel);
    }
}
