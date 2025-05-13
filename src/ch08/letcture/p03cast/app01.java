package ch08.letcture.p03cast;

public class app01 {
    public static void main(String[] args) {
        myinterface a = new myclass01();
        a.action();

        myclass01 b = (myclass01) a;
    }
}

interface myinterface {
    void action();
}

class myclass01 implements myinterface {
    public void action() {
        System.out.println("myclass01.action");
    }
}