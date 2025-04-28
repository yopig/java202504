package ch02.lecture;

public class C11String {
    public static void main(String[] args) {
        String a = "javascript는 java랑 다르다";
        System.out.println(a);

        a = "동해물과 백두산이\n마르고 닳도록\n하느님이 보우하사\n우리나라 만세";
        System.out.println(a);

        //String block 여러줄을 작성할 때 유용
        //"""..."""
        a = """
                    동해물과 백두산이
                마르고 닳도록
                    하느님이 보우하사
                    우리나라 만세""";
        System.out.println(a);

    }
}
