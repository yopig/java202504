package ch08.sec10.exam02;

public class app03 {

    public static void main(String[] args) {
        myinterface03 a = new myclass031();
        if (a instanceof myclass031) {
            System.out.println("app03.main");
            myclass031 b = (myclass031) a;
        }
        if (a instanceof myclass032) {
            System.out.println("app03.main");
            myclass032 b = (myclass032) a;


        }
    }
}

interface myinterface03 {
}

class myclass031 implements myinterface03 {
}

class myclass032 implements myinterface03 {
}
