package ch04.lecture;

public class C15For {
    public static void main(String[] args) {
        System.out.println(1);
        int count = 0;
        while (count < 3) {
            System.out.println(2);
            System.out.println(3);
            count++;
        }
        System.out.println(4);
        System.out.println(5);

        System.out.println("------------------");

        //for
        for (int i = 0; i < 3; i++) {
            System.out.println("반복코드");

        }
    }
}

