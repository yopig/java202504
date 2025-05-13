package ch06.lecture.p10capsule;

public class app01 {
    public static void main(String[] args) {
        car1 a = new car1();
        a.speed = 100;
        a.speed = 0;
        a.speed = -300;
        car2 b = new car2();
        b.setspeed(100);
        int s = b.getspeed();
//        car2.speed = 300;
    }
}

class car1 {
    int speed;
}

class car2 {
    private int speed;

    public void setspeed(int speed) {
        if (speed >= 0 && speed <= 300) {
            this.speed = speed;
        }

    }

    public int getspeed() {
        return this.speed;
    }

    // 필드 값을 변경하는 메소드를 퍼블릭으로
}

class car3 {
    private int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
