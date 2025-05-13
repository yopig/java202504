package ch07.letcture.p04cast;

public class app03 {
    public static void main(String[] args) {


        superclass03 a = new subclass031();
        a.action();

        subclass031 b = (subclass031) a;
        b.action();
        b.hello();
    }
}

class superclass03 {
    public void action() {
        System.out.println("superclass03.action");
    }
}

class subclass031 extends superclass03 {
    @Override
    public void action() {
        System.out.println("subclass031.action");
    }

    public void hello() {
        System.out.println("subclass031.hello");
    }
}
