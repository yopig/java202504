package ch06.lecture.p05constructor;

public class app04 {
    public static void main(String[] args) {
// class myclass42작성
        // 5개의 필드만들고
        // 필드 초기화하는 생성자 만들기
    }
}

class myclass04 {
    String name;
    String adress;
    int age;
    boolean married;

    public myclass04(String name, String adress, int age, boolean married) {
        this.name = name;
        this.adress = adress;
        this.age = age;
        this.married = married;
    }
}

class myclass42 {
    String a;
    String b;
    String c;
    String d;
    String e;

    public myclass42(String a, String b, String c, String d, String e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
}
