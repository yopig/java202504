package ch07.letcture.p02override;

public class app01 {
    public static void main(String[] args) {
        subclass01 a = new subclass01();
        a.action();
        a.hello();
        subclass02 b = new subclass02();
        b.action();

    }
}

class superclass01 {
    public void action() {
        System.out.println("superclass01.action");
    }
}

class subclass01 extends superclass01 {
    // 상속받은 메소드를 다시 정의하는것 오버라이드
    // @overridew 오버라이드 메소르르 잘 작성했는지 검증
    @Override
    public void action() {
        System.out.println("subclass01.action");
    }

    public void hello() {
        System.out.println("subclass01.hello");
    }
}

class subclass02 extends subclass01 {

}