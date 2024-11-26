public class StringCompareExample {
    public static void main(String[] args) {

        // 두 문자열 변수 초기화
        String first = "Hello World";
        String second = "Hello World";
        String third = "hello world";

        // compareTo 메서드 사용
        // compareTo는 같으면 0, 다르면 0아닌 값 반환
        int comparisonResult = first.compareTo(second);
        System.out.println("first와 second 비교: " + comparisonResult);

        // equals 메서드 사용
        // 같으면 true, 다르면 false
        boolean equalsResult = first.equals(second);
        System.out.println("first와 second가 같음: " + equalsResult);

        // compareTo와 equals를 다른문자열로 비교
        comparisonResult = first.compareTo(third);
        equalsResult = first.equals(third);
        System.out.println("first와 third 비교: " + comparisonResult);
        System.out.println("first와 third가 같음: " + equalsResult);
    }
}
