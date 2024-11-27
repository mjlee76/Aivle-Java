public class CtrlFlow {
    public static void main(String[] args) {

        int n = 1, s = 0;

        // 무한 루프에서 100까지의 숫자를 합산하고 루프 탈출
        while(true) {
            s += n;
            if(n == 100) {
                break;
            }
            n++;
        }
        System.out.println("1부터 100까지의 합: " + s);


        // 1부터 100까지의 숫자 중 5와 7의 배수를 출력
        for(int i = 1; i <= 100; i++) {
            if(!(i % 5 == 0 || i % 7 == 0)) {   // 5의 배수 또는 7의 배수가 아닌 경우 다음 반복으로 넘어감
                continue;
            }
            System.out.println(i + "는 5 또는 7의 배수입니다.");
        }
    }
}
