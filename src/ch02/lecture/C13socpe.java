package ch02.lecture;

public class C13socpe {
    public static void main(String[] args) {
        // 선언된 코드블럭 안에서만 사용 가능
        int a = 3;
        System.out.println(a);
        if (true) {
            int b = 5;
            System.out.println(a);
            System.out.println(b);
        }
//        System.out.println(a);
//        System.out.println(b);
        if (true) {
            int b = 7;
//            int a = 9;
//            System.out.println(a);
            System.out.println(b);
        }
        for (
                int i = 0;
                i < 3;
                i++
        ) {
            System.out.println(i);
        }

        int i = 0;

    }
}
