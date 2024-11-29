package com.chap06.sub02;

class Person {
    String name; // 사람이름

    // 생성자
    Person(String name){
        this.name = name;
    }

    // 메서드 : 자신이 누구인지 출력
    void introduce() {
        System.out.println("나는 " + name + "입니다.");
    }
}