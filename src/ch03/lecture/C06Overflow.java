package ch03.lecture;

public class C06Overflow {
    public static void main(String[] args) {
        int a = 2147483645;
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);
        a++;
        System.out.println(a);

        int i = -2147483647;
        System.out.println(i);
        i--;
        System.out.println(i);
        i--;
        System.out.println(i);
    }
}
