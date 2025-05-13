package ch06.lecture.p05constructor;

public class app02 {
    public static void main(String[] args) {
        myclass02 a = new myclass02();
        System.out.println("a.name = " + a.name);
        myclass02 b = new myclass02();
        System.out.println("b.name = " + b.name);
    }
}

class myclass02 {
    String name;

    myclass02() {
        //객체 생성시 해야하는 일들
        //주로 필드 값을 초기화하는 일을 함
        name = "토람프";
    }
}
