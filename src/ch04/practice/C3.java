package ch04.practice;

public class C3 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        while (i <= 100) {
            sum += i;
            i += 3;
        }


        System.out.println("3의 배수 총합" + sum);

    }
}

