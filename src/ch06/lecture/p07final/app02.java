package ch06.lecture.p07final;

public class app02 {
    public static void main(String[] args) {
        //static final field
        // integer 최대값, 최소값
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.MIN_VALUE);
    }
}

class myclass02 {
    final static int height = 9;
    final int age;
    final static String COMPANY_NAME = "apple";

    public myclass02(int age) {
        this.age = age;
    }

}

