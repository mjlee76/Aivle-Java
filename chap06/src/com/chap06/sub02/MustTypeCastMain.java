package com.chap06.sub02;

public class MustTypeCastMain {
    public static void main(String[] args) {
        Person person = new Person("사람");
        Student student = new Student("학생", 101);

        person.introduce();      // "나는 사람입니다." 출력
        student.introduce();     // "나는 학생입니다." 출력
        student.showStudentID(); // "학번: 101" 출력

        // 객체의 다운캐스팅
        // person 객체를 Student타입으로 다운캐스팅해야 학번을 출력 가능
        // Student castedStudent = (Student) person;
        // castedStudent.showStudentID(); // 불가능

        // 객체의 업캐스팅
        // 모든 Student 객체는 Person 타입으로 자동 변환될 수 있음
        Person p = student;
        p.introduce(); // "나는 학생입니다." 출력
        ((Student)p).showStudentID(); // "학번: 101" 출력 // 가능하지만 강제 형변환이라 불안함
        // p.showStudentID(); // 컴파일 오류, Person 타입에는 showStudentID() 메서드가 없음

    }
}
