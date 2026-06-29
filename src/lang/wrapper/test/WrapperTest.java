package lang.wrapper.test;

public class WrapperTest {

    public static void main(String[] args) {
        String str1 = "10";
        String str2 = "20";

        int numStr1 = Integer.parseInt(str1);
        int numStr2 = Integer.parseInt(str2);
        int result = numStr1 + numStr2;

        System.out.println("result = " + result);
    }
}
