public class UnaryOperatorExample {
    public static void main(String[] args) {

        int number = 5;

        System.out.println(number);   // 출력 : 5
        System.out.println(number++); // 출력 : 5  후에 6으로 증가
        System.out.println(++number); // 7로 증가 후 출력 : 7
        System.out.println(number);   // 최종 7
    }
}
