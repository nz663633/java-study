package extends1.overriding;

// Car 클래스 상속받기(부모인 Car 클래스 내부 메서드 전부 사용 가능
// 부모 클래스는 자식 클래스에 접근할 수 없다
// 하나의 자식이 2개 이상의 부모 클래스를 가질 수 없다
public class ElectricCar extends Car {

    @Override // 애노테이션: 기능을 새롭게 재정의
    public void move() {
        System.out.println("전기차를 빠르게 이동합니다.");
    }

    public void charge() {
        System.out.println("충전합니다.");
    }
}
