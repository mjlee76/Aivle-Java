import java.util.ArrayList; // ArrayList를 사용하기 위한 import문

public class DynamicArrayDemo {

    public static void main(String[] args) {

        // String 타입의 ArrayList 생성
        ArrayList<String> stringList = new ArrayList<>();

        // ArrayList에서 요소 추가
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");

        // ArrayList에서 요소 제거
        stringList.remove("Python"); // "Python 문자열 제거"

        // ArrayList에서 특정 인덱스의 요소 가져오기
        String elementAtIndex = stringList.get(1); // 인덱스 1의 요소 가져오기(C++)

        // ArrayList의 크기(길이)가져오기
        int size = stringList.size();

        // 결과 출력
        System.out.println("인덱스 1의 요소: " + elementAtIndex);
        System.out.println("ArrayList의 크기: " + size);
        System.out.println("ArrayList의 현재 요소들:");
        for(String s : stringList) {
            System.out.println(s);
        }
    }
}
