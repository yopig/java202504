package ch04.lecture;

public class C25CodeBlock {
    public static void main(String[] args) {
        //코드블럭은 오른쪽 띄어쓰기

        if (true) {

        } else if (true)
            //코드 한줄이면 중괄호 생략가능
            System.out.println("아 예스");
        else
            System.out.println();
        for (int i = 0; i < 3; i++) {

        }
        while (true) {
            break;
        }
    }
}
