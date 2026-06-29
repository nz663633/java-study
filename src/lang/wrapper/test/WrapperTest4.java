package lang.wrapper.test;

public class WrapperTest4 {

    public static void main(String[] args) {
        // 오토 언박싱, 오토 박싱 사용 O

        String str = "100";

        // String --> Integer
        // 아예 다른 타입으로는 오토 박싱, 언박싱이 되지 않음
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        // Integer --> int
        int intValue = integer1;
        System.out.println("intValue = " + intValue);

        // int --> Integer
        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);
    }
}
