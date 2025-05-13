package ch06.lecture.p03method;

public class app03 {
    public static void main(String[] args) {
        myclass03 a = new myclass03();
        a.action2();

    }
}

class myclass03 {
    void action() {
        //return
        //1. 메소드 종료
        // 2. 오른쪽 값 호출한 곳으로 반환
    }

    void action2() {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        if (true) {
            return;
        }
        System.out.println(4);
    }

    int action3() {
        System.out.println(99);
        System.out.println(88);
        return 345;
    }

    String action4() {
        return "hello";
    }

}
