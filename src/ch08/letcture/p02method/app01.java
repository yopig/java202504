package ch08.letcture.p02method;

public class app01 {
    public static void main(String[] args) {
        tiger1 t = new tiger1();
        wolf w = new wolf();

        beast1 b = t;
        beast1 c = w;
        b.hunt();
        c.hunt();
    }
}

interface beast1 {
    //interface의 메소드는 모두 public abstract
    public abstract void hunt();

}

class tiger1 implements beast1 {
    @Override
    public void hunt() {
        System.out.println("사냥");
    }
}

class wolf implements beast1 {
    @Override
    public void hunt() {
        System.out.println("나는 아기강아지");
    }
}
