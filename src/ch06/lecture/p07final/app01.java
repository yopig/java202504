package ch06.lecture.p07final;

public class app01 {

}

class myclass01 {

    final int age;

    myclass01() {
        age = 3;
    }

    void method() {
        int a;
        a = 3;
        int b = 3;
        a = 7;

        final int c;
        //final은 변수 값 딱 한번
        c = 4;

    }
}
