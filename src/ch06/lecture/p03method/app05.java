package ch06.lecture.p03method;

public class app05 {
    public static void main(String[] args) {


        myclass05 a = new myclass05();
        a.method();
        a.method(1);

    }
}

class myclass05 {
    void action(int a) {
    }

    void action(int a, int b) {
    }

    void action(int a, int b, int c) {
    }

    void method(int... a) {
        System.out.println();
    }


}
