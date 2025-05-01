package ch04.lecture;

public class C06Switch {
    public static void main(String[] args) {
        int v = 30;
        switch (v) {
            case 10:
                System.out.println("코드1");
                break;
            case 20:
                System.out.println("코드2");
                break;
            case 30:
                System.out.println("코드3");
                break;
            default:
                System.out.println("코드4");
                break;
        }
    }
}
