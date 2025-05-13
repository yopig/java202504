package ch06.sec08.exam02;

public class computerexample {
    public static void main(String[] args) {
        computer mycom = new computer();

        int result1 = mycom.sum(1, 2, 3);
        System.out.println("result1:" + result1);

        int result2 = mycom.sum(1, 2, 3, 4, 5);
        System.out.println("result2:" + result2);

        int[] values = {1, 2, 3, 4, 5};
        int result3 = mycom.sum(values);
        System.out.println("result3:" + result3);

        int result4 = mycom.sum(new int[]{1, 2, 3, 4, 5});
        System.out.println("result4:" + result4);


    }
}
