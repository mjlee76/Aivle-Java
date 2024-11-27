// 열거 타입 CardType 정의
enum CardType {
    DEBIT, CREDIT, PREPAID
}

public class EnumExample {
    public static void main(String[] args) {

        // CardType 열거 타입 변수 선언 및 초기화
        CardType myCardType = CardType.DEBIT;

        // 열거 타입 값에 따라 다른 행동을 하는 switch 문
        switch (myCardType) {
            case DEBIT:
                System.out.println("직불 카드를 선택했습니다.");
                break;
            case CREDIT:
                System.out.println("신용 카드를 선택했습니다.");
                break;
            case PREPAID:
                System.out.println("선불 카드를 선택했습니다.");
                break;
            default:   // 위의 case가 아닐때
                System.out.println("알수 없는 카드 타입 입니다.");
                break;

        }
    }
}
