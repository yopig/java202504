package ch06.exercise.p19;

public class app {
    public static void main(String[] args) {
        Account account = new Account();

        account.setBalance(10000);
        System.out.println("현재 잔고 : " + account.getBalance());

        account.setBalance(-100);
        System.out.println("현재 잔고 : " + account.getBalance());

        account.setBalance(2000000);
        System.out.println("현재 잔고 : " + account.getBalance());

        account.setBalance(30000);
        System.out.println("현재 ek잔고 : " + account.getBalance());

    }
}
