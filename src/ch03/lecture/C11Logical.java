package ch03.lecture;

public class C11Logical {
    public static void main(String[] args) {
        // 논리 연산자
        // and &, && or || |

        // 피연산자는 boolean

        // and &&
        System.out.println("true && true : " + (true && true));
        System.out.println("true && true : " + (true && false));
        System.out.println("true && true : " + (false && true));
        System.out.println("true && true : " + (false && false));

        // or ||
        System.out.println("true || true : " + (true || true));
        System.out.println("true || true : " + (true || false));
        System.out.println("true || true : " + (false || true));
        System.out.println("true || true : " + (false || false));

        // 연습
        int x = 5;
        int y = 8;
        boolean r1 = (x >= 5) && (y <= 5);
        System.out.println(r1);
        boolean r2 = (x >= 5) || (y <= 5);
        System.out.println(r2);
    }
}
