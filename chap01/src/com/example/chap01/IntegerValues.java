package com.example.chap01;

public class IntegerValues {
    public static void main(String[] args) {
        byte a = 100;
        short b = 101;
        int c = 102;
        long d = 103;

        byte A = Byte.MAX_VALUE; // Byte가 제공하는 최대값
        short B = Short.MAX_VALUE; // Short가 제공하는 최대값
        int C = Integer.MAX_VALUE; // Integer가 제공하는 최대값
        long D = Long.MAX_VALUE; // Long가 제공하는 최대값

        System.out.println("byte a의 값은 " + a);
        System.out.println("short b의 값은 " + b);
        System.out.println("int c의 값은 " + c);
        System.out.println("long d의 값은 " + d);

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);

    }
}
