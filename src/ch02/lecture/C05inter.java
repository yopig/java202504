package ch02.lecture;

public class C05inter {
    public static void main(String[] args) {
        // 정수형

        // byte(1 byte)
        byte a;

        a = 127;
        System.out.println("a=" + a);
        a = -128;
        System.out.println("a=" + a);
        // short(2 byte)

        short b;
        b = 32767;
        System.out.println("b=" + b);
        b = -32768;
        System.out.println("b=" + b);
        // int(4 byte)
        int c;
        c = 2147483647;
        System.out.println("c=" + c);
        c = -2147483648;
        System.out.println("c=" + c);
        // long(8 byte)
        long d;
        d = 9223372036854775807L;
        System.out.println("d=" + d);
        d = -9223372036854775808L;
        System.out.println("d=" + d);
        // java 코드에서 정수는 int로 해석
    }
}
