package ch9;

class Person {
    long id;

    public boolean equals(Object obj) {

        System.out.println(obj instanceof Person);
        System.out.println("--------------------------------------");
        if (obj instanceof Person) {
            System.out.println(obj.getClass());
            System.out.println(((Person) obj).getClass());
            System.out.println(((Person) obj).id);
            return id == ((Person) obj).id;
        } else {
            return false;
        }
    }

    Person(long id) {
        this.id = id;
    }
}


public class EqualEx2 {
    public static void main(String[] args) {
        Person p1 = new Person(890128L);
        Person p2 = new Person(890128L);

        if (p1 == p2) {
            System.out.println("== Same");
        } else {
            System.out.println("== Different");
        }
        if (p1.equals(p2)) {
            System.out.println("equals Same");
        } else {
            System.out.println("equls Different");
        }


    }
}