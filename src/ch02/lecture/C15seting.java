package ch02.lecture;

public class C15seting {
    public static void main(String[] args) {
        // 작은타입 -> 큰타입 o
        // 큰타입 -> 작은타입 x

        byte a;
        short b;
        b = 100;
        System.out.println(b);

        a = (byte) b;
        System.out.println(a);

        b = 128;
        a = (byte) b;
        System.out.println(b);
        System.out.println(a);

        b = 987;
        a = (byte) b;
        System.out.println(b);
        System.out.println(a);

        //소수점 이하 버릴때

        double c = 123.456;
        int d = (int) c;
        System.out.println(c);
        System.out.println(d);
    }
}
