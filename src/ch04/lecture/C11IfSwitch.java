package ch04.lecture;

import java.util.Scanner;

public class C11IfSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수");
        int score = Integer.parseInt(scanner.nextLine());

        if (score <= 100 && score >= 80) {
            System.out.println("최우수");
        } else if (score > 70) {
            System.out.println("우수");
        } else if (score > 50) {
            System.out.println("양호");
        } else {
            System.out.println("미흡");
        }
    }
}
