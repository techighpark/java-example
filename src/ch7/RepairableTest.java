package ch7;

public class RepairableTest {
    public static void main(String[] args) {
        Tank tank = new Tank();
        DropShip dropShip = new DropShip();
        Marine marine = new Marine();
        SCV scv = new SCV();

        scv.repair(tank);
        scv.repair(dropShip);
//        scv.repair(marine);

    }
}

interface Repairable {
}

class Tank extends GroundUnit implements Repairable {
    Tank() {
        super(150);
        hitPoint = MAX_HP;
    }

    public String toString() {
        return "Tank";
    }
}

class DropShip extends AirUnit implements Repairable {
    DropShip() {
        super(125);
        hitPoint = 0;
    }

    public String toString() {
        return "DropShip";
    }
}

class Marine extends GroundUnit {
    Marine() {
        super(50);
        hitPoint = 20;
    }

    public String toString() {
        return "Marine";
    }
}

class GroundUnit extends Unit1 {
    GroundUnit(int hp) {
        super(hp);
    }
}

class SCV extends GroundUnit implements Repairable {
    SCV() {
        super(60);
        hitPoint = 5;
    }

    void repair(Repairable r) {
        if (r instanceof Unit1) {
            System.out.println("before casting Repairable r : " + r);
            Unit1 u = (Unit1) r;
            System.out.println("after casting Repairable to Unit1 u : " + u);
            while (u.hitPoint != u.MAX_HP) {
                u.hitPoint++;
            }
            System.out.println("repair done" + u + r);
        }
    }
}

class AirUnit extends Unit1 {
    AirUnit(int hp) {
        super(hp);
    }
}

class Unit1 {
    int hitPoint;
    final int MAX_HP;

    Unit1(int hp) {
        this.MAX_HP = hp;
    }

}
