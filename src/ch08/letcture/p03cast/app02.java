package ch08.letcture.p03cast;

public class app02 {
    public static void main(String[] args) {
        myclass021 a = new myclass021();
        myinterface02 b = a;
        myclass021 c = (myclass021) b;
//        myclass022 d = myclass022 b;
        System.out.println("프로그램 종료");
    }
}

interface myinterface02 {
}

class myclass021 implements myinterface02 {
}

class myclass022 implements myinterface02 {
}
