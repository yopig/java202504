package ch04.practice;

public class C01Random {
    public static void main(String[] args) {
        //두개의 주사위를 굴려서 같은 값이 나오면 당첨
        // 그렇지 아니면 다시 돌려보세요
        int a = ((int) (Math.random() * 6)) + 1;
        System.out.println(a);
        int b = ((int) (Math.random() * 6)) + 1;
        System.out.println(b);
        if (a == b) {
            System.out.println("당첨");
        } else {
            System.out.println("다시 돌려보세요");
        }
    }
}
