package ch02.sec04;

public class FloatDoubleExample {
    public static void main(String[] args) {
        float var1 = 0.1234567890123456789F;
        double var2 = 0.7777777777777774;
        System.out.println("var1:" + var1);
        System.out.println("var1:" + var2);


        double var3 = 3e6;
        float var4 = 3e6F;
        double var5 = 2e-3;
        System.out.println("var3:" + var3);
        System.out.println("var4:" + var4);
        System.out.println("var5:" + var5);
    }
}
