package extends1.ex3;

// Car 클래스 상속받기(부모인 Car 클래스 내부 메서드 전부 사용 가능
// 부모 클래스는 자식 클래스에 접근할 수 없다
// 하나의 자식이 2개 이상의 부모 클래스를 가질 수 없다
public class ElectricCar extends Car {

    public void charge() {
        System.out.println("충전합니다.");
    }
}
