package ch04.lecture;

public class C24Continue {
    public static void main(String[] args) {
        //continue;
        //다음 코드들을 싱핼하지 않고 반복문을 계속 진행
        while (true) {
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            if (true) {
                break; // 반복문 종료
            }
            System.out.println(4);
        }

        System.out.println(5);


        while (true) {
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            if (true) {
                continue;
            }
            System.out.println(4);
        }

    }
}
