package poly.ex3;

public abstract class AbstractAnimal {
    // 추상 메서드가 하나라도 있는 클래스는 추상 클래스로 선언해야 한다.
    // 추상 메서드는 자식 클래스가 반드시 오버라이딩 해야 하기 때문에
    // 메서드 바디 부분이 없다.(만들면 컴파일 오류)
    public abstract void sound();

    public void move() {
        System.out.println("동물이 움직입니다.");
    }
}
