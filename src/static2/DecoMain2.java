package static2;

public class DecoMain2 {

    public static void main(String[] args) {
        String s = "hello Java";
        // 정적 메서드(클래스 메서드): static을 사용하면 바로 클래스 호출해서 사용 가능
        // 인스턴스 객체 생성할 필요 X
        // 인스턴스 메서드: static이 붙지 않은 메서드는 인스턴스를 생성해야 호출 가능
        String deco = DecoUtil2.deco(s);

        System.out.println("before: " + s);
        System.out.println("after: " + deco);
    }
}
