package ch04.lecture;

public class C04Nest {
    public static void main(String[] args) {
        if (true) {
            if (true) {
                System.out.println("코드1");
            } else {
                System.out.println("코드2");
            }
        } else {
            if (true) {
                System.out.println("코드3");
            } else {
                System.out.println("코드4");
            }
        }
    }
}
