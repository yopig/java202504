package ch06.lecture.p02field;

public class app02 {
    public static void main(String[] args) {
        myclass02 a = new myclass02();
        a.address = "seoul";
        System.out.println("a.address = " + a.address);
        System.out.println("a.name = " + a.name);
        System.out.println("a.age = " + a.age);

    }
}

class myclass02 {
    String address;
    String name = "홍길동";
    String email = "없음";
    int age = 1;

}
