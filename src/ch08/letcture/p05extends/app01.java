package ch08.letcture.p05extends;

public class app01 {
    public static void main(String[] args) {
        myclass02 a = new myclass02();
        System.out.println(a instanceof myclass02);
        System.out.println(a instanceof myinterface02);
        System.out.println(a instanceof myinterface01);
        System.out.println(a instanceof myinterface03);
    }

}

interface myinterface01 {
}

interface myinterface02 {
}

class myclass01 implements myinterface01, myinterface02 {
}

interface myinterface03 extends myinterface01 {
}

interface myinterface04 extends myinterface02 {
}

class myclass02 implements myinterface04 {
}