package com.chap06.sub02;

// 학생 클래스, Person을 상속받음
class Student extends Person {
    int studentID; // 학생의 학번

    // 생성자
    Student(String name, int studentID){
        super(name);  // 부모 클래스의 생성자 호출
        this.studentID = studentID;
    }

    // 메서드: 학번을 출력
    void showStudentID(){
        System.out.println("학번: " + studentID);
    }
}
