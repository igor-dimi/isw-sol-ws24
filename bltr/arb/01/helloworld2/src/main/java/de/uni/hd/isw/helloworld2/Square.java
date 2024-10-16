package de.uni.hd.isw.helloworld2;

public class Square {
    static int square(int n) {
        return n * n;
    }

    static void output(int n){
        String s;
        int i;

        for (i = 1; i <= n; i++) {
            s = "Square(" + i + ") = " + square(i);
            System.out.println(s);
        }
    }

    public static void main(String args[]) {
        output(10);
    }
}
