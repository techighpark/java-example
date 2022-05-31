package ch7;


public class InterfaceTest3 {
}

class A2 {
    void methodA() {
        I2 i = InstanceManager.getInstance();
        i.methodB();
    }
}

interface I2 {
    public abstract void methodB();
}

class B2 implements I2 {
    public void methodB() {
        System.out.println("B");
    }
}

class InstanceManager {
    public static I2 getInstance() {
        return new B2();
    }
}