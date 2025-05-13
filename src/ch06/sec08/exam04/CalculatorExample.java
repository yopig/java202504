package ch06.sec08.exam04;

public class CalculatorExample {
    public static void main(String[] args) {
        ch06.sec08.exam04.Calculator myCalcu = new Calculator();

        double reuslt1 = myCalcu.areaRectangle(10);
        double reuslt2 = myCalcu.areaRectangle(10, 20);

        System.out.println(reuslt1);
        System.out.println(reuslt2);
    }
}
