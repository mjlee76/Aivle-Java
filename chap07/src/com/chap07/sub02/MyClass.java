package com.chap07.sub02;

public class MyClass implements MyInterface {
    // 인터페이스의 추상 메소드 구현
    @Override
    public void sayHello() {
        System.out.println("안녕하세요, 최대값은: " + MAX);
    }
}
