package ch07.letcture.p03polymorphism;

public class app03 {
    public static void main(String[] args) {


        dog01 a = new dog01();
        bullgod01 b = new bullgod01();
        chiwawa01 c = new chiwawa01();
        a.bark();
        b.bark();
        c.bark();
        dog01 d = b;
        d.bark();
        dog01 e = c;
        e.bark();
    }
}

class dog01 {
    public void bark() {
        System.out.println("멍멍");
    }
}

class bullgod01 extends dog01 {
    public void bark() {
        System.out.println("뭉뭉");
    }
}

class chiwawa01 extends dog01 {
    public void bark() {
        System.out.println("힝힝");
    }
}