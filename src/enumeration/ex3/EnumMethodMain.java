package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {

        // 모든 ENUM을 반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        for (Grade value : values) {
            // ordinal(): ENUM 상수의 선언 순서(0부터 시작)를 반환 -> 가급적 사용 X
            System.out.println("name = " + value.name() + ", ordinal = " + value.ordinal());
        }

        // String -> ENUM 변환, 잘못된 문자면 IllegalArgumentException 발생
        String input = "GOLD";
        Grade gold = Grade.valueOf(input); // 주어진 이름과 일치하는 ENUM 상수 반환
        System.out.println("gold = " + gold); // toString() 오버라이딩 가능

        // 열거형은 이미 java.land.Enum을 상속 받았기 때문에 추가로 다른 클래스를 상속 받을 수 없다.
        // 열거형은 인터페이스를 구현할 수 있다.
        // 열거형에 추상 메서드를 선언하고, 구현할 수 있다.(이 때 익명 클래스 사용)
    }
}
