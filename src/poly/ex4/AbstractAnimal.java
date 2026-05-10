package poly.ex4;

// 순수 추상 클래스
// 오직 다형성을 위한 부모 타입으로서 껍데기 역할만 제공
public abstract class AbstractAnimal {
    // 인스턴스 생성 X
    // 상속시, 자식은 모든 메서드를 오버라이딩 해야함
    public abstract void sound();
    public abstract void move();
}
