package ch06.lecture.p06static;

public class app03 {
    public static void main(String[] args) {

    }
}

class myclass03 {
    static String address;
    static int height;

    int age;
    String name;

    static void work() {
        System.out.println(address);
    }

    void instancemethod() {
        //인스턴스메소드(멤버)에서 클래스맴버 접근 가능
        System.out.println(name);

    }

    void action() {
        System.out.println(this.name + "은" + this.age + "세다");
    }

    void go() {

    }
}
