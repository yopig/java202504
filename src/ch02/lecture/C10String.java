package ch02.lecture;

public class C10String {
    public static void main(String[] args) {
        // \n새로운줄
        // \t 띄어쓰기
        // \" 큰따움표
        // \\ 역슬래시

        String a = "abc\nabc";
        System.out.println(a);
        a = "abc\tabc";
        System.out.println(a);
        a = "abc\"abc";
        System.out.println(a);
        a = "abc\\abc";
        System.out.println(a);
    }
}
