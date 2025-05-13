package ch06.lecture.p11etc;

public class C02Singleton {
    public static void main(String[] args) {
        // singleton : 프로그램을 작성하는 패턴중 하나
        // 특정 타입의 객체가 프로그램을 사용
        // 하나가 되도록 보장하는 코드 패턴
        myclass01 a = new myclass01();
        myclass01 b = new myclass01();
//        myclass02 c = new myclass02();
//        myclass02 d = new myclass02();
        myclass02 e = myclass02.getInstance();
        myclass02 f = myclass02.getInstance();

        System.out.println(e == f);
    }
}

class myclass01 {

}

class myclass02 {

    private static myclass02 object;

    private myclass02() {

    }

    public static myclass02 getInstance() {
        if (object == null) {
            myclass02 a = new myclass02();
            object = a;
        }
        return object;
    }
}
