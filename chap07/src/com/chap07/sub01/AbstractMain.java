package com.chap07.sub01;

// 추상 클래스 사용을 위한 실행 클래스
public class AbstractMain {
    public static void main(String[] args) {
        Shape circle = new Circle(10);
        circle.draw();  // 구체적인 도형 객체를 사용하여 draw 메서드 호출
    }
}