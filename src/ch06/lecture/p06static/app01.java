package ch06.lecture.p06static;

public class app01 {
    public static void main(String[] args) {
        myclass01 a = new myclass01();
        myclass01 b = new myclass01();
        a.name = "문재인";
        a.age = 72;
        b.name = "트럼프";
        b.age = 78;
        a.work();
        b.work();

        //
    }
}

class myclass01 {
    String name;
    int age;

    static String address;


    void work() {
        System.out.println(this.age + "세의 " + this.name + "가 일한다.");
    }

    //클래스 메소드
    static void print() {
        System.out.println(address + "에 거주");
    }
}
