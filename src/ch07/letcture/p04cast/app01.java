package ch07.letcture.p04cast;

public class app01 {
    public static void main(String[] args) {
        subclass011 a = new subclass011();
        a.action();
        a.work();
        superclass01 b = a;
        b.action();
    }
}

class superclass01 {
    void action() {
        System.out.println("superclass01.action");
    }
}

class subclass011 extends superclass01 {
    public void work() {
        System.out.println("subclass011.work");
    }
}
