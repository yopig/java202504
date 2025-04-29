package ch03.lecture;

public class C02Increment {
    public static void main(String[] args) {
        // ++ 증가 연산자
        // 변수의 값에 1더한 후, 변수에 다시 대입
        int a = 10;
        System.out.println(a);
        a++;
        System.out.println(a);

        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);

        a++;
        System.out.println(++a);
    }
}
