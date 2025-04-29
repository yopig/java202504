package ch03.lecture;

public class C10Compare {
    public static void main(String[] args) {
        // 같은 타입끼리 비교해야 한다.
        int a = 30;
        String b = "30";
//        System.out.println(a == b);
        int c = 50;
        long d = 50;
        System.out.println(c == d);

        // 참조타입 비교는
        String e = "자바";
        String f = "자바";
        System.out.println(e == f);

        String g = "자";
        String h = "바";
        String i = g + h;
        System.out.println(e == i);

    }
}
