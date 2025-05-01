package ch04.lecture;

import java.util.Scanner;

public class C09Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("점수:");
        int score = Integer.parseInt(scanner.nextLine());
        String message = switch (score) {
            case 100 -> message = "참 잘했어요";
            case 90 -> message = "잘했어요";
            case 80 -> message = "좋아요";
            default -> message = "가능성이 있어요";
        };
        System.out.println(message);
    }
}
