package ch01.leture;

public class c02print {
    public static void main(String[] args){
        System.out.println("출력 메세지");
        System.out.println("또 다른 출력");
        System.out.println("또 또 출력");
        System.out.println("또 또 또 출력");
        System.out.printf("또 또 출력");
        System.out.printf("또 또 출력");
        System.out.printf("값%s 값%s\n","a","b");
        System.out.printf("12345678901234567890\n");
        System.out.printf("%5s%3s\n","12","34");
        System.out.printf("%-5s%-3s\n","12","34");
        // \n 엔터
        // %d 정수형 출력
        System.out.printf("%s%d\n","hi","34");
        // %f 실수형 출력
        System.out.printf("%s%d%f\n","hi","34","3.1234" );
        // #10.3 총 10자리 소숫점부분 3자리
        System.out.printf("%10.3\n","3.14" );

        System.out.print("\n또 또 출력");
        System.out.println("\n또 출력");
    }
}
