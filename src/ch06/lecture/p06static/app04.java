package ch06.lecture.p06static;

public class app04 {
    public static void main(String[] args) {
        // 애플리케이션 시작
        System.out.println("코드 실행");
        System.out.println(args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]);

        }
        if (args.length > 0) {
            String mode = args[0];
            switch (mode) {
                case "dev" -> System.out.println("개발용 코드 실행");
                case "prod" -> System.out.println("개발용 코드 실행");
                case "test" -> System.out.println("개발용 코드 실행");
            }
        }
    }
}

class myclass04 {

}