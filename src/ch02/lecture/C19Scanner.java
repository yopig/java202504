package ch02.lecture;

import javax.xml.parsers.SAXParser;
import java.util.Scanner;

public class C19Scanner {
    public static void main(String[] args) {
        System.out.println("프로그램 시작");
        // 커서를 이동하면서 입력된 값을 일어남
        Scanner scanner = new Scanner(System.in);

        //엔터를 만날
        // 때까지 읽은 내용 리턴함
        String a = scanner.nextLine();
        System.out.println(a);
        String b = scanner.nextLine();
        System.out.println(b);

        System.out.println("프로그램종료");
    }
}
