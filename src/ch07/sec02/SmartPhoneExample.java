package ch07.sec02;

public class SmartPhoneExample {
    public static void main(String[] args) {
        SmartPhone myphnoe = new SmartPhone("갤럭시", "은색");

        System.out.println("모델" + myphnoe.model);
        System.out.println("색상" + myphnoe.color);
        System.out.println("와이파이 상태" + myphnoe.wifi);

        myphnoe.bell();
        myphnoe.sendVoice("여보세요");
        myphnoe.receiveVoice("안녕하세요! 저는 홍길동인데요");
        myphnoe.sendVoice("아~네 반갑습니다.");
        myphnoe.hangup();

        myphnoe.setWifi(true);
        myphnoe.internet();
    }
}
