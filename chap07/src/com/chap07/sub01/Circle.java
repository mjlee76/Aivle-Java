package com.chap07.sub01;

class Circle extends Shape {
    private double radius;

    Circle(double r) {
        this.radius = r;
    }

    // draw 메서드를 구현함으로써 Circle 클래스는 더 이상 추상 클래스가 아님
    @Override
    void draw() {
        System.out.println("원을 그림. 반지름: " + radius);
    }
}