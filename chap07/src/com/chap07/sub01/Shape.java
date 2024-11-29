package com.chap07.sub01;

// 추상 클래스를 정의하는 예제
abstract class Shape {
    int x, y;

    // 이 메서드는 추상 메서드로 하위 클래스에서 반드시 구현해야 함
    abstract void draw();
}