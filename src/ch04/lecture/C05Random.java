package ch04.lecture;

public class C05Random {
    public static void main(String[] args) {
        // 0.0 < Math.random() < 1.0

        double a = Math.random();
        // 0.0 <= a < 1.0
        //주사위 1,2,3,4,5,6중에 하나
        // a * 6
        a = a * 6;
        int b = (int) a;
        b = b + 1;
        System.out.println(b);
        int c = ((int) (Math.random() * 6)) + 1;
        System.out.println(c);
    }
}
