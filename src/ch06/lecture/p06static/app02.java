package ch06.lecture.p06static;

public class app02 {

}

class myclass02 {
    static int number;

    static {
        int a = 3;
        if (true) {
            a += 10;
        }
        number = a;
    }

    int age;

    myclass02() {
        age = 10;
    }
}
