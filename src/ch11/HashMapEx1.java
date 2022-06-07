package ch11;

import java.util.HashMap;
import java.util.Scanner;


public class HashMapEx1 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("castello", "1234");
        map.put("asdf", "1111");
        map.put("asdf", "1234");

        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("id & password ?");
            System.out.println("id : ?");
            String id = s.nextLine().trim();

            System.out.println("password : ?");
            String password = s.nextLine().trim();
            System.out.println();

            if (!map.containsKey(id)) {
                System.out.println("There is no id.");
                continue;
            } else {
                if (!(map.get(id)).equals(password)) {
                    System.out.println("Wrong pw");
                    break;
                }
                System.out.println("Logged in");
            }
        }
    }
}
