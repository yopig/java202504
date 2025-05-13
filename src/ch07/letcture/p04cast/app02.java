package ch07.letcture.p04cast;

public class app02 {
    public static void main(String[] args) {
        guidegod02 a = new guidegod02();
        a.bark();
        a.guide();

        dog02 b = a;
        b.bark();
    }
}

class dog02 {
    public void bark() {
        System.out.println("멍멍");
    }
}

class guidegod02 extends dog02 {
    @Override
    public void bark() {
        System.out.println("몽몽");
    }

    public void guide() {
        System.out.println("안내멍");
    }
}

class chiwawa extends dog02 {
    @Override
    public void bark() {
        System.out.println("왈왈");
    }
}