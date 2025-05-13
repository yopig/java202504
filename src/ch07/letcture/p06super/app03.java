package ch07.letcture.p06super;

import ch07.sec07.exam03.Child;
import ch07.sec07.exam03.Parent;

public class app03 {
    public static void main(String[] args) {
        child031 a = new child031();

    }
}

class Parent03 {
    public Parent03(int a) {
        System.out.println("부모필드 초기화");
    }
}

class child031 extends Parent03 {
    public child031() {
//        super();
        super(3);
        System.out.println("자식 필드 초기화");
    }
}
