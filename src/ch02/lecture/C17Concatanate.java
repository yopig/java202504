package ch02.lecture;

public class C17Concatanate {
    public static void main(String[] args) {
        String a = "java";
        String b = "hello!";

        String c = a + b;
        System.out.println(c);
        System.out.println(a + b);
        String d = "react";
        System.out.println();
        String h = "java";
        int i = 300;
        String j = h + i;
        System.out.println(j);

        String k = "500";
        int l = 400;
        String m = k + l;
        System.out.println(m);

        int n = 200;
        int o = 300;
        String p = "400";
        String q = n + o + p;
        System.out.println(q);

        String r = (n + o) + p;
        System.out.println(r);

        String s = n + (o + p);
        System.out.println(s);


    }
}
