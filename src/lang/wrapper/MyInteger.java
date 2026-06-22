package lang.wrapper;

public class MyInteger {

    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compareTo(int target) {
        if (value < target) {
            return -1;
        } else if (value > target) {
            return 1;
        } else {
            return 0;
        }
    }

    // 객체를 출력할 때 어떻게 표시할지 정의
    // toString()을 재정의하지 않으면 객체의 참조 정보를 출력한다.
    @Override
    public String toString() {
        return String.valueOf(value); // 숫자를 문자로 반환
    }
}
