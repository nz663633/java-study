package extends1.ex2;

// Car 클래스 상속받기(부모인 Car 클래스 내부 메서드 전부 사용 가능
// 부모 클래스는 자식 클래스에 접근할 수 없다
// 하나의 자식이 2개 이상의 부모 클래스를 가질 수 없다
public class GasCar extends Car {

    public void fillUp() {
        System.out.println("기름을 주유합니다.");
    }
}
