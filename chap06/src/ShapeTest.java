class Circle {
    double r;

    Circle(double r) {           // 생성자: 원의 반지름 초기화
        this.r = r;
    }

    double getRadius(){          // 메서드: 원의 반지름 반환
        return r;
    }

    double area(){               // 메서드: 원의 면적 계산
        return Math.PI * r * r;
    }
}

class Sphere extends Circle {
    Sphere(double r) {           // 생성자: 구의 반지름을 초기화
        super(r);
    }

    double vol() {               // 메서드: 구의 부피를 계산
        return (4.0/3.0) * Math.PI * Math.pow(r, 3);
    }

    double surface() {           // 메서드: 구의 표면적을 계산
        return 4 * super.area();
    }

    void info() {                // 메서드: 구의 정보를 출력
        System.out.println("반지름 " + getRadius() + "인 구 부피: " + vol() + " 입니다.");
        System.out.println("반지름 " + getRadius() + "인 구 표면적: " + surface() + " 입니다.");
    }
}

// 실행 클래스
public class ShapeTest {
    public static void main(String[] args) {
        // 반지름이 10인 구 객체를 생성하고 정보 출력
        Sphere b = new Sphere(10.0);
        b.info();
    }
}
