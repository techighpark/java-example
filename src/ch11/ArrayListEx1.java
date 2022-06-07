package ch11;

import java.util.ArrayList;
import java.util.Collections;


public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>(10);
        list1.add(5);
        list1.add(4);
        list1.add(2);
        list1.add(0);
        list1.add(1);
        list1.add(3);

        ArrayList list2 = new ArrayList(list1.subList(1, 4));

//        print(list1, list2);

        Collections.sort(list1);
        Collections.sort(list2);
//        print(list1, list2);

        System.out.println(list1.containsAll(list2));

        list2.add("B");
        System.out.println(list2);
        list2.add("C");
        System.out.println(list2);
        list2.add(3, "A");
        System.out.println(list2);

        list2.set(3, "AA");
        System.out.println(list2);
        System.out.println(list1);

        System.out.println((list1.retainAll(list2)));
        System.out.println(list1);
    }
}
