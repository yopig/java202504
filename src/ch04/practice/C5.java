package ch04.practice;

public class C5 {
    public static void main(String[] args) {
        boolean gg = false;
        System.out.println("4x + 5y = 60");
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                if ((i * 4) + (j * 5) == 60) {
                    System.out.println(i + "," + j);
                    gg = true;
                }
                if (gg) {
                    break;
                }

            }
        }
    }

}



