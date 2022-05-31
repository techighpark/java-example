package ch7;

class FighterTest {
    public static void main(String[] args) {
        Fighter f = new Fighter();

        if (f instanceof Unit) {
            System.out.println("f is child of Unit class");
        }
        if (f instanceof Fightable) {
            System.out.println("Fightable implementation");
        }
        if (f instanceof Movable) {
            System.out.println("Movable implementation");
        }
        if (f instanceof Attackable) {
            System.out.println("Attackable implementation");
        }
        if (f instanceof Object) {
            System.out.println("Object child");
        }
    }
}

class Fighter extends Unit implements Fightable {

    public void move(int x, int y) {
        System.out.println(x + ", " + y);
    }

    public void attack(Unit u) {
        System.out.println("Attack" + u.currentHP);
    }
}

class Unit {
    int currentHP;
    int x;
    int y;
}

interface Fightable extends Movable, Attackable {
}

interface Movable {
    void move(int x, int y);
}

interface Attackable {
    void attack(Unit u);
}
