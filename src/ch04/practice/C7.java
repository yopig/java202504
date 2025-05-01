package ch04.practice;

import java.util.Scanner;

public class C7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean on = true;
        int money = 0;

        while (on) {
            System.out.println("----------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("----------------------------------");
            System.out.print("선택>");
            String strNum = scanner.nextLine();

            if (strNum.equals("1")) {
                int tmoney;
                System.out.print("예금액>");
                tmoney = Integer.parseInt(scanner.nextLine());
                money += tmoney;
            } else if (strNum.equals("2")) {
                int rmoney;
                System.out.print("출금액>");
                rmoney = Integer.parseInt(scanner.nextLine());
                money -= rmoney;
            } else if (strNum.equals("3")) {
                System.out.print("잔고>" + money + "\n");
            } else if (strNum.equals("4")) {
                on = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}

