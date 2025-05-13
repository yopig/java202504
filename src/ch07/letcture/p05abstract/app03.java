package ch07.letcture.p05abstract;

public class app03 {

}

abstract class canids03 {
    public abstract void bark();
}

class chiwawa03 extends canids03 {
    public void bark() {
        System.out.println("왕왕");
    }
}

abstract class wolf extends canids03 {

}
