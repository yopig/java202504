package ch06.lecture.p02field;

public class app01 {
    public static void main(String[] args) {
        myclass01 a = new myclass01();
        a.age = 2;
        a.name = "donald";

        System.out.println(a.age);
        System.out.println(a.name);

        myclass01 b = new myclass01();
        b.age = 5;
        b.name = "trump";

        System.out.println(b.age);
        System.out.println(b.name);


    }
}
