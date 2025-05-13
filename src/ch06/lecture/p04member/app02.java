package ch06.lecture.p04member;

public class app02 {
    public static void main(String[] args) {


        myclass02 a = new myclass02();
        a.print();
    }
}

class myclass02 {
    //필드
    String name = "트럼프";
    int age = 99;

    // 메소드
    void print() {
        int age = 3;
        String address = "seoul";
        String name = "윤석열";
        //this
        System.out.println("name = " + this.name);
        System.out.println("name = " + name);
        System.out.println("name = " + age);
        
    }
}
