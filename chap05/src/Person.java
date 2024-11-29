public class Person {
    // private 필드
    private String name;

    // 생성자
    public Person(String name) {
        this.name = name; // 초기 이름 설정
    }

    // 접근자 메서드 - name 필드 값 반환
    public String getName() {
        return name; // 현재 인스턴스의 name 필드 값을 반환
    }

    // 설정자 메서드 - name 필드 값 변경
    public void setName(String newName) {
        this.name = newName; // 새로운 값으로 현재 인스턴스의 name 필드 값 변경
    }

    // 메인 메서드
    public static void main(String[] args) {
        Person person = new Person("Jane Doe"); // Person 객체 생성

        // 접근자 메서드 호출하여 이름 출력
        System.out.println("이름: " + person.getName());

        // 설정자 메서드를 사용하여 이름 변경
        person.setName("John Doe");

        // 변경된 이름 출력
        System.out.println("변경된 이름: " + person.getName());
    }
}
