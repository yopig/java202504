package ch07.letcture.p05abstract;

public class app02 {
    public static void main(String[] args) {

    }
}

abstract class Candis02 {
    public abstract void bark();
}

class chiwawa02 extends Candis02 {
    public void bark() {
        System.out.println("왕왕");
    }
}

class Wolf02 extends Candis02 {
    public void bark() {
        System.out.println("워우");
    }
}