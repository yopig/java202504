package ch06.lecture.p03method;

public class app04 {

}

class myclass4 {
    void action() {
        System.out.println("예문코드, ");
    }

    void sum(int a, int b) {
        System.out.println("받은 값을 가짐");
        System.out.println(a + b);
    }

    //타입 , 순서, 개수가 다른 같은 이름의 함수 선언
    void sum(int a, int b, int c) {
        System.out.println("받은 값을 가짐");
        System.out.println(a + b);
    }
}
