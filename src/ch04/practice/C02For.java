package ch04.practice;

public class C02For {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print(i);
        }
        System.out.println("\n------------\n");
        for (int i = 1; i < 6; i++) {
            System.out.print(i);
        }
        System.out.println("\n------------\n");
        // 0 2 4 6 8
        for (int i = 0; i < 5; i++) {
            System.out.print(i * 2);
        }
        System.out.println("\n------------\n");
        // 2 4 6 8 10
        for (int i = 1; i < 6; i++) {
            System.out.print(i * 2);
        }
        System.out.println("\n------------\n");
        // 4 3 2 1 0
        for (int i = 4; i > -1; i--) {
            System.out.print(i);
        }
        // 5 4 3 2 1
        System.out.println("\n------------\n");
        for (int i = 5; i > 0; i--) {
            System.out.print(i);
        }
        // *****
        System.out.println("\n------------\n");
        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }
        System.out.println("\n------------\n");
        /*  *****
         *****
         *****
         *****
         *****
         */
        for (int i = 0; i < 5; i++) {
            System.out.print("*****");
            System.out.println();
        }

    }
}
