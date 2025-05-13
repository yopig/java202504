package ch07.letcture.p01inhernitance;

public class app01 {
    public static void main(String[] args) {
        subclass01 a = new subclass01();
        a.age = 35;
        System.out.println("a.age = " + a.age);
        a.action();

        subclass02 b = new subclass02();
        b.age = 33;
        System.out.println("b.age = " + b.age);
        b.action();
        b.go();
        b.address = "seoul";

        myclass01 c = new myclass01();
        c.age = 77;
    }
}

class myclass01 {
    public int age;

    public void action() {

    }
}

class subclass01 extends myclass01 {
    //하나의 자식 클래스가 여러 부모 클래스를 둘 수 없음
    //자식 클래스
    String name;

    public void greeting() {

    }
}

class subclass02 extends myclass01 {
    String address;

    void go() {

    }
}
