package ch06.sec14;

import ch06.sec13.exam01.package2.C;

public class CarExample {
    public static void main(String[] args) {
        Car myCar = new Car();

        myCar.setSpeed(-50);
        System.out.println("현재 속도 : " + myCar.getSpeed());

        myCar.setSpeed(60);
        System.out.println("현재 속도 : " + myCar.getSpeed());

        if (!myCar.isStop()) {
            myCar.setStop(true);
        }

        System.out.println("현재 속도 : " + myCar.getSpeed());
    }
}
