class Prod {
    int id;
    String name;

    // 생성자
    Prod(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // 정보 출력 메서드
    void info() {
        System.out.println(id + ":" + name);
    }
}

// 상속받는 확장(자식)클래스
class ExtProd extends Prod {
    int qty;  // 수량

    // 확장(자식)클래스의 생성자
    ExtProd(int id, String name, int qty) {  // 자식의 초기화 코드
        super(id, name);  // 상위 클래스 생성자 호출 -> 자식 초기화시 부모것도 초기화해줘야함
        this.qty = qty;
    }

    // 오버라이드한 정보 출력 메서드
    @Override // annotation -> 부모의 메서드를 새로 고쳐 사용하는것을 오버라이드라 함
    void info() {
        super.info();  // 상위 클래스 메서드 호출
        System.out.println("수량은 " + qty);
    }
}

public class ProdTest {
    public static void main(String[] args) {
        Prod p = new Prod(1, "Pen");
        p.info();   // "1:Pen"

        ExtProd ep = new ExtProd(2, "Notebook", 10);
        ep.info();  // "2:Notebook", "수량: 10"
    }
}
