package ch04.sec02;

import java.util.Scanner;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수");
        String line = scanner.nextLine();
        int score = Integer.parseInt(line);

        if (score <= 100 && score >= 90) {
            System.out.println("점수가 100-90입니다");
            System.out.println("등급은 A입니다");
        } else if (score < 90 && score >= 80) {
            System.out.println("점수가 80-89입니다");
            System.out.println("등급은 B입니다");
        } else if (score < 80 && score >= 70) {
            System.out.println("점수가 70-79입니다");
            System.out.println("등급은 C입니다");
        } else if (score > 100 || score < 0) {
            System.out.println("점수를 잘못입력 하셨습니다");
        } else {
            System.out.println("점수가 70 미만입니다");
            System.out.println("등급은 D입니다");
        }

    }
}
