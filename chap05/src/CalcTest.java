class Calc {
    private double res;  // 인스턴스 변수 -> 마지막에 계산했던 결과를 저장하고 있겠다!
    static final double PI = 3.14159;  // 정적 상수

    // 인스턴스 메서드: 원의 넓이 계산
    public double area(double rad) {
        res = PI * rad * rad;  // 인스턴스 변수에 결과 저장
        return res;
    }

    // 정적 메서드: 원의 둘레 계산 -> Calc 클래스가 바로 제공하는 메서드
    public static double circ(double rad) {
        return 2 * PI * rad;  // 직접 정적 변수 사용
    }
}

public class CalcTest {
    public static void main(String[] args) {
        Calc calc = new Calc();
        double a = calc.area(10);  // 인스턴스 메서드 호출
        double c = Calc.circ(10);  // 정적 메서드 호출

        System.out.println("넓이: " + a);
        System.out.println("둘레: " + c);
    }
}
