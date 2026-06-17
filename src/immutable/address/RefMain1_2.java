package immutable.address;

public class RefMain1_2 {

    public static void main(String[] args) {
        // a와 b는 서로 다른 Address 인스턴스 참조
        Address a = new Address("서울"); // x001
        Address b = new Address("서울"); // x002
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b.setValue("부산"); // b의 값을 부산으로 변경
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        /*
        자바의 참조형 객체는 여러 변수가 같은 객체를 가리키는 것을
        언어 차원에서 강제로 막을 수 없다
         */
    }
}
