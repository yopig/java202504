package ch03.lecture;

public class C08DivideByZero {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        // 정수 타입은 0으로 나눌 수 없음
//        int c = a / b;
//        System.out.println(c);
        // 실수 타입은
        double c = 5.0;
        double d = 0.0;
        double e = c / d;
        System.out.println(e);
        // 실수 타입을 0으로 나눈 나머지는 존재하지 않음

        double f = c % d;
        System.out.println(f);

        //값이 인피니티인지 확인하는 메소드
        //double.isNaN()
        System.out.println("Double.isInfinite(e)");
    }
}
