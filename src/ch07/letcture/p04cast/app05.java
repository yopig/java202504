package ch07.letcture.p04cast;

import ch07.sec07.exam03.Parent;

public class app05 {
    public static void main(String[] args) {
        //왼쪽항 참조변수 오른쪽항 타입
        Parent05 a = new child051();
        System.out.println((a instanceof child051));
        System.out.println((a instanceof child052));
        System.out.println((a instanceof Parent05));


        System.out.println("ㅎ");

        if (a instanceof child052) {
            System.out.println("확인하고");
        }
        child051 b = (child051) a;
        System.out.println("프로그램 종료");
    }
}

class Parent05 {

}

class child051 extends Parent05 {
}

class child052 extends Parent05 {
}