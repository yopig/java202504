package ch06.lecture.p04member;

public class app01 {
    public static void main(String[] args) {
        myclass01 a = new myclass01();
        myclass01 b = new myclass01();
        a.age = 30;
        b.age = 50;
        System.out.println("a = " + a.age);
        System.out.println("b = " + b.age);

        a.action();
        b.action();

        a.print();
        b.print();

    }
}

class myclass01 {
    // 멤버끼리 서로 사용할 수 있다.
    int age;

    void print() {
        System.out.println("나이 : " + age);
        action();
    }

    void action() {
        System.out.println("action!!");

    }
}