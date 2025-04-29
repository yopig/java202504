package ch02.lecture;

public class C18 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        int c = a + b;
        System.out.println(c);
        int d = 18;
        long e = 20;

        long g = d + e;

        int h = 3;
        double i = 3.14;
        double l = i + h;
        System.out.println(l);

        //byte, short, int
        byte k = 5;
        int t = 7;
        int m = k + t;

        byte n = 7;
        byte o = 9;
        int q = n + o;

        int r = 5;
        int s = 3;
        int z = r / s;
        System.out.println(z);

        double y = r / s;
        System.out.println(y);

        double v = r / (double) s;
        System.out.println(v);
    }
}
