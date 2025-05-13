package ch06.lecture.p09acces;

public class app02 {
    myclass02 a = new myclass02();
//    a.age = 33;

}

class myclass02 {
    int age;
    private String name;

    void action() {
        System.out.println(name);
    }
}
