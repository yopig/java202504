package ch04.sec04;

public class MultiplicationTableExample {
    public static void main(String[] args) {
        for (int i = 2; i <= 19; i++) {
            System.out.println("*** " + i + "단 ***");
            for (int j = 1; j <= 19; j++) {
                System.out.println(i + " X " + j + " = " + (i * j));

            }

        }
    }
}
