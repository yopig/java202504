package ch07.letcture.p05abstract;

import ch06.sec13.exam03.package2.C;

public class app01 {
    public static void main(String[] args) {
        chiwawa01 a = new chiwawa01();
        wolf01 b = new wolf01();
        // 추상클래스로 인스턴트 만들 수 없음
        Canids c = new chiwawa01();
        Canids d = a;
        Canids e = b;
        Canids f = new chiwawa01();
        Canids g = new wolf01();
    }
}

class Canids {
}

class chiwawa01 extends Canids {
}

class wolf01 extends Canids {

}
