package ch05.lecture;

public class C04Array {
    public static void main(String[] args) {
        // 초기값 안넣으면 0, false, null
        int[] a = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("a[" + i + "] = " + a[i]);

        }

        int[] b;
        b = new int[]{99, 55, 22};
        for (int i = 0; i < 3; i++) {

            System.out.println("b[" + i + "] = " + b[i]);
        }

        double[] c = new double[]{3.14, 9.12, 7.1234, 6.4321};

        for (int i = 0; i < 4; i++) {
            System.out.println("c[" + i + "] = " + c[i]);
        }

        //연습
        // "hi" "hello" "안녕" "곤니치와" "올라"
        String[] d = new String[]{"hi", "hello", "안녕", "곤니치와", "올라"};

        for (int i = 0; i < 5; i++) {

            System.out.println("d[" + i + "] = " + d[i]);
        }
    }
}