package ch06.lecture.p04member;

public class app03 {
    public static void main(String[] args) {
        myclass03 a = new myclass03();
        a.address = "서울";
        a.print();
    }
}

class myclass03 {
    String address;

    void print() {
        System.out.println("address = " + address);
    }
}
