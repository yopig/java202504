package ch06.lecture.p05constructor;

public class app03 {
    public static void main(String[] args) {
        myclass03 a = new myclass03("트럼프", 66, "dc");
        System.out.println(a.age);
        System.out.println(a.address);
        System.out.println(a.name);


        a.name = "문재인";
        a.age = 1;
        a.address = "서울";
    }

}

class myclass03 {
    String name;
    int age;
    String address;

    myclass03(String name, int age, String address) {
        this.name = "도날드";
        this.age = 44;
        this.address = "워싱턴";
    }
}