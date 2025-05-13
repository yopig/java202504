package ch05.lecture;

public class C06Length {
    public static void main(String[] args) {
        int[] a = {99, 11, 88, 22, 33};
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        //length 속성 : 배열의 길이
        System.out.println(a[a.length]);

        System.out.println(a[a.length - 1]);
    }
}
