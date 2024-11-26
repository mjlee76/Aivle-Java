public class StringManipulationDemo {
    public static void main(String[] args) {

        // 문자열 변수 초기화
        String baseString = "Hello";
        String stringToConcat = " World";
        String searchString = "lo";

        // concat 메서드를 사용하여 문자열 연결
        String concatenatedString = baseString.concat(stringToConcat);
        System.out.println("연결된 문자열: " + concatenatedString);       // "Hello World"

        // indexOf 메서드를 사용하여 부분 문자열의 인덱스 찾기
        // 제일 처음 인덱스 반환, 못찾으면 -1
        int index = concatenatedString.indexOf(searchString);
        System.out.println("'" + searchString + "'의 인덱스: " + index); // 3

        // isEmpty 메서드를 사용하여 문자열이 비어있는지 확인
        boolean isEmpty = baseString.isEmpty();
        System.out.println("baseString이 비어 있음: " + isEmpty);        // false

        // length 메서드를 사용하여 문자열의 길이 구하기
        int length = concatenatedString.length();
        System.out.println("연결된 문자열의 길이: " + length);            // 11
    }
}
