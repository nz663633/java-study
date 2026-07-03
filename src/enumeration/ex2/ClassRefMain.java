package enumeration.ex2;

public class ClassRefMain {

    public static void main(String[] args) {
        // 상수의 클래스 정보 가져오기
        System.out.println("class BASIC = " + ClassGrade.BASIC.getClass());
        System.out.println("class GOLD = " + ClassGrade.GOLD.getClass());
        System.out.println("class DIAMOND = " + ClassGrade.DIAMOND.getClass());

        // 각각의 상수는 같은 ClassGrade 타입의 서로 다른 인스턴스의 참조값을 가진다
        System.out.println("ref BASIC = " + ClassGrade.BASIC);
        System.out.println("ref GOLD = " + ClassGrade.GOLD);
        System.out.println("ref DIAMOND = " + ClassGrade.DIAMOND);
    }
}
