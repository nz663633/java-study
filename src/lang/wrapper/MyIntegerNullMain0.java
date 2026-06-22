package lang.wrapper;

public class MyIntegerNullMain0 {

    public static void main(String[] args) {
        int[] intArr = {-1, 0, 1, 2, 3};
        System.out.println(findValue(intArr, -1)); // -1
        System.out.println(findValue(intArr, 0)); // 0
        System.out.println(findValue(intArr, 1)); // 1
        System.out.println(findValue(intArr, 100)); // -1
    }

    // findValue()는 결과로 -1를 반환
    // int와 같은 기본형은 항상 값이 있어야 한다.
    // 즉, 여기서도 값을 반환할 때 값을 찾지 못하면 숫자 중 하나를 반환해야함(보통 -1, 0을 사용)
    private static int findValue(int[] intArr, int target) {
        for (int value : intArr) {
            if (value == target) {
                return value;
            }
        }
        return -1;
    }
}
