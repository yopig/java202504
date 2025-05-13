package ch06.exercise.p15;

import ch06.exercise.p13.Member;

public class app {
    public static void main(String[] args) {
        MemberService memberService = new MemberService();
        boolean reuslt = memberService.login("hong", "12345");
        if (reuslt) {
            System.out.println("로그인 되었습니다");
            memberService.logout("hong");
        } else {
            System.out.println("id또는 password가 올바르지 않습니다");
        }
    }
}
