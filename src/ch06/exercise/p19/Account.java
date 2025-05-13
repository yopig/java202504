package ch06.exercise.p19;

public class Account {
    public static String set1;
    public static String set2;
    public static int set3;
    long Balance;

    public void setBalance(long Balance) {
        if (Balance <= 1000000 && Balance >= 0) {
            this.Balance = Balance;
        }
    }

    public long getBalance() {
        return this.Balance;
    }
}

