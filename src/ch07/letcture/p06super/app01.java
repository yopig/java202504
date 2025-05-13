package ch07.letcture.p06super;

public class app01 {
}

class parent01 {
    public void action() {

    }

    public void action2() {

    }
}

class child01 extends parent01 {
    @Override
    public void action2() {
        System.out.println("child01.action2");
    }

    public void method1() {
        this.method2();
        action();
        method2();
        this.action();

        //재정의한 메소드
        action2();
        this.action2();
        //부모의 메소드
        super.action2();
    }

    public void method2() {

    }
}