package ch06.lecture.p04member;

public class app04 {
    public static void main(String[] args) {
        myclass04 a = new myclass04();
        myclass04 b = new myclass04();
        a.name = "으";
        b.name = "악";
        a.action("으아아악");
        b.action("크아아아악");
    }
}

class myclass04 {
    String name;

    void action(String name) {
        System.out.println("name = " + this.name);
        System.out.println("name = " + name);
    }
}
