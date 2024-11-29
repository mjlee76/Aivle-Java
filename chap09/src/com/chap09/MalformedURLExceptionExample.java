package com.chap09;

import java.net.URL;
import java.net.MalformedURLException;

public class MalformedURLExceptionExample {
    public static void main(String[] args) {
        try{
            URL url = new URL("htp://www.example.com");
            System.out.println("프로토콜: " + url.getProtocol());
        } catch(MalformedURLException e){
            System.out.println("잘못된 URL 형식입니다: " + e.getMessage());
        }
    }
}
