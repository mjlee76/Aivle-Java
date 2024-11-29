package com.chap06.sub02;

public class TypeCheckMain {
    public static void main(String[] args) {

        Person person = new Person("김철수");
        Student student = new Student("이영희", 12345);

        // Person의 인스턴스인지 확인
        if(person instanceof Person) {
            System.out.println("person은 Person 클래스의 인스턴스입니다.");
        }

        // Student의 인스턴스인지 확인
        if(student instanceof Person) {
            System.out.println("student는 Person 클래스의 인스턴스입니다.(상속관계) == 학생! 너 사람이구나..");
        }

        // Student로 변환할 수 있는지 확인
        if(person instanceof Student) {
            Student castedStudent = (Student) person;
            castedStudent.introduce();
        } else {
            System.out.println("person은 Student로 변환 불가 == 사람은 학생이 되지 못했다..");
        }

        // Student 객체로부터 Person 타입으로 업캐스팅
        Person p = student;
        p.introduce();                    // 출력: "나는 이영희입니다."
        // p.showStudentID();              //불가능

        // 다운캐스팅 가능 여부 확인 및 변환
        if(p instanceof Student) {
            Student s = (Student) p;
            s.introduce();                // 출력: "나는 이영희입니다."
            s.showStudentID();            // 출력: "학번: 12345"
        }

    }
}
