package ch04.sec03;

public class SwitchValueExample {
    public static void main(String[] args) {
        String grade = "B";

        int score1 = 0;
        if (grade.equals("A")) {
            score1 = 100;
        } else if (grade.equals("B")) {
            int result = 100 - 20;
            score1 = result;
        } else {
            score1 = 60;
        }
    }
}
