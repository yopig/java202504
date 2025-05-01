package ch04.lecture;

public class C08Switch {
    public static void main(String[] args) {
        int a = 2;

        switch (a) {
            case 1 -> {
                System.out.println("코드1");
                System.out.println("코드2");
            }
            case 2 -> {
                System.out.println("코드1");
                System.out.println("코드2");
            }
            case 3 -> {
                System.out.println("코드1");
                System.out.println("코드2");
            }
        }
        switch (a) {
            case 1, 2 -> System.out.println("a");
            case 3, 4 -> System.out.println("abc");
        }
    }
}
