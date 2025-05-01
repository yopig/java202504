package ch05.lecture;

public class C01array {
    public static void main(String[] args) {
        //배열(array) 여러 값을 담을 수 있는 자료형

        // 배열
        int[] b;
        b = new int[5]; // 값을 여러개 담을 수 있음

        // b는 5개의 int 값을 담을 수 있음
        b[0] = 9; // b의 0번 index에 9라는 값 대입
        b[1] = 8;
        b[2] = 7;
        b[3] = 77;
        b[4] = 1234;
//        b[5] = 12314; // 존재하지 않는 index
        System.out.println(b[0]);
        System.out.println(b[1]);
        System.out.println(b[2]);
        System.out.println(b[3]);
        System.out.println(b[4]);

        // 3개의 int 값을 담을 수 있는 배열 a를 만들어 보세요
        int[] a;
        a = new int[3];

        a[0] = 1;
        a[1] = 22;
        a[2] = 333;
        // c의 각 index의 값을 출력 해보세요
        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);

        double[] d;
        d = new double[3];

        d[0] = 99.548758984013852038;
        d[1] = 98.3;
        d[2] = 97.5;
        System.out.println(d[0]);
        System.out.println(d[1]);
        System.out.println(d[2]);
        System.out.println(d);

        String[] t;
        t = new String[2];

        t[0] = "바보";
        t[1] = "멍청이";

        System.out.println(t[0]);
        System.out.println(t[1]);
    }
}
