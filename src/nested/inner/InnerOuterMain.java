package nested.inner;

public class InnerOuterMain {

    public static void main(String[] args) {
        // 내부 클래스는 바깥 클래스의 인스턴스에 소속됨
        // 따라서 바깥 클래스의 인스턴스를 먼저 생성해야 내부 클래스의 인스턴스를 생성할 수 있다.
        InnerOuter outer = new InnerOuter();

        // 내부 클래스를 생성할 때, 바깥 클래스의 인스턴스 참조가 필요
        InnerOuter.Inner inner = outer.new Inner();
        inner.print();

        System.out.println("innerClass = " + inner.getClass());
    }
}
