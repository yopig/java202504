package ch08.exercise.p5;

public class TV implements remocon {
    public void poweron() {
        System.out.println("TV를 켰습니다");
    }

    public static void main(String[] args) {
        remocon r = new TV();
        r.poweron();
    }
}
