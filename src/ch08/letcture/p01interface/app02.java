package ch08.letcture.p01interface;

import ch07.sec07.exam03.Parent;

public class app02 {
    public static void main(String[] args) {
        child021 a = new child021();
        Parent02 b = a;

        myclass02 c = new myclass02();
        myinterface02 d = c;
        myinterface02 e = c;
        child022 f = new child022();
    }
}


interface myinterface02 {
}

class Parent02 {
}

class child021 extends Parent02 {
}

// 클래스 상속은 하나지만 인터페이스 상속은 여러개 가능
class myclass02 implements myinterface02, myinterface01 {
}

class child022 extends Parent02 implements myinterface01, myinterface02 {

}