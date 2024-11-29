package com.chap09;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try{
            String text = null;
            int length = text.length(); // NullPointerException 발생
        } catch(NullPointerException e) {
            System.out.println("NullPointerException 발생: " + e.getMessage());
        }
    }
}
