public class CalculationDemo {
    public static void main(String[] args) {
        int i1, i2;
        long l1, l2;
        double d1, d2, d3, d4;

        i1 = 5/2;
        System.out.println("5/2 : " + i1);

        d1 = 5/2;
        System.out.println("5/2 : " + d1);

        d2 = (float)5/(float)2;
        System.out.println("5/2 : " + d2);

        d3 = 5/(float)2;
        System.out.println("5/2 : " + d3);

        d4 = 5/2.0;
        System.out.println("5/2 : " + d4);

        i2 = 10000000 * 10000000;   // 오버플로우 발생
        System.out.println(i2);

        l1 = 10000000 * (long)10000000; // long에 넣고 값을 (long)으로 형변환
        System.out.println(l1);

        l2 = 10000000 * 10000000L;
        System.out.println(l2);
    }
}
