package ch02.lecture;

import javax.xml.parsers.SAXParser;
import java.util.Scanner;

public class C21Scanner {
    public static void main(String[] args) {
        System.out.println("값 더하는 프로그램 시작");
        // 커서를 이동하면서 입력된 값을 일어남
        Scanner scanner = new Scanner(System.in);

        //엔터를 만날
        // 때까지 읽은 내용 리턴함
        System.out.println("첫번째 값:");
        String a = scanner.nextLine();
        System.out.println("두번째 값:");
        String b = scanner.nextLine();

        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int result = num1 + num2;

        System.out.println(result);
        
        System.out.println("프로그램종료");
    }
}
