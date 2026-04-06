package final1;

public class FieldInit {

    // static final이 붙으면(= 상수) 변수는 대문자로
    static final int CONST_VALUE = 10;
    final int value = 10;

    public FieldInit() {
        // 이미 값이 할당된 경우 생성자에서도 값을 변경할 수 없음
        // this.value = value;
    }
}
