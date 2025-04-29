package ch02.lecture;

public class C16String {
    public static void main(String[] args) {
        //기본타입 -> String
        //String -> 기본타입
        int a = 300;
//        String b = a;
        String c = "300";
//        int b = c;

        int e = 700;
        String f = String.valueOf(e);
        System.out.println(e);
        System.out.println(f);

        double g = 3.14;
        String h = String.valueOf(g);
        System.out.println(g);
        System.out.println(h);

        int i = 900;
        String j = i + "";
        System.out.println(i);
        System.out.println(j);

        String k = "333";
        String l = "123.456";
        String m = "true";

        int n = Integer.parseInt(k);
        double o = Double.parseDouble(l);
        boolean p = Boolean.parseBoolean(m);

        // String -> 기본타입
        String q = "123.456";
        double r = Double.parseDouble(q);
        System.out.println(r);
    }
}
