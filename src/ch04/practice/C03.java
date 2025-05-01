package ch04.practice;

public class C03 {
    public static void main(String[] args) {
        /*
         *
         **
         ***
         ****
         *****
         */
        for (int a = 1; a <= 5; a++) {
            for (int i = 1; i <= a; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------");
        /*
         *****
         ****
         ***
         **
         *
         */
        for (int b = 5; b >= 1; b--) {
            for (int j = 1; j <= b; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("--------------");
        /*
        *****
        ****#
        ***##
        **###
        *####
        #####
         */
        for (int c = 5; c >= 0; c--) {
            System.out.println();
            for (int j = 1; j <= c; j++) {
                System.out.print("*");
            }
            for (int e = 4; e >= c; e--) {
                System.out.print("#");
            }
        }
        System.out.println("\n--------------");

        // @formatter:off
        /*
                *
              **
              ***
             ****
             *****
         */
        for (int c = 5; c >= 0; c--) {
            System.out.println();
            for (int j = 1; j <= c; j++) {
                System.out.print(" ");
            }
            for (int e = 4; e >= c; e--) {
                System.out.print("*");
            }
        }

        /*
          *****
         ****
         ***
         **
         *
         */
        System.out.println("\n--------------");
        for (int c = 5; c >= 0; c--) {
            System.out.println();
            for (int e = 4; e >= c; e--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= c; j++) {
                System.out.print("*");
            }

        }
        /*
        0
        01
        012
        0123
        01234
         */
        System.out.println("\n--------------");
        for (int a = 1; a <= 5; a++) {
            for (int i = 0; i < a; i++) {
                System.out.print(i);
            }
            System.out.println();
        }


        /*
        1
        12
        123
        1234
        12345
         */
        System.out.println("--------------");
        for (int a = 1; a <= 5; a++) {
            for (int i = 1; i <= a; i++) {
                System.out.print(i);
            }
            System.out.println();
        }

        /*
        0
        12
        345
        6789
        01234
         */
        System.out.println("--------------");
        int k = 0;
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < (i + 1); j++, k++) {
                System.out.print(k % 10);
            }
            System.out.println();

}
        /*
        1
        23
        456
        7890
        12345
         */
        // @formatter:on
    }

}
