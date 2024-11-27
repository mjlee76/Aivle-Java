// Ball 클래스 정의
class Ball {
    // Ball 클래스는 여기에 더 많은 속성이나 메서드를 가질 수 있음
}
public class BallArrayDemo {

    public static void main(String[] args) {

        // Ball 객체 5개를 저장할 수 있는 배열 생성
        // 이 시점에서 배열은 Ball 객체를 참조하지만, 모두 null 로 초기화됨
        Ball[] balls = new Ball[5];

        // 배열의 처음 두 원소에 대해서만 새 Ball 객체를 할당
        for (int i = 0; i < 2; i++){
            balls[i] = new Ball(); // i번째 Ball 객체를 생성하여 배열에 할당
        }

        // 배열의 모든 원소 출력
        // 객체가 생성되지 않는 배열의 원소는 null을 출력함
        System.out.println("배열의 원소들:");
        for (Ball ball : balls){
            if (ball != null) {
                System.out.println(ball);   // 객체의 참조 값(주소) 출력
            } else {
                System.out.println("null"); // 객체가 없는 경우 null 출력
            }
        }
    }
}
