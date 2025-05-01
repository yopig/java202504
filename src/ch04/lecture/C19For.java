package ch04.lecture;

public class C19For {
    public static void main(String[] args) {
        // 2 x 1
        // 2 x 2
        // 2 x 3..
        for (int i = 2; i < 9; i++) {
            System.out.println(i + "단");
            for (int a = 1; a < 9; a++) {
                System.out.print(i + " X " + a + "\n");
            }
        }
    }
}
