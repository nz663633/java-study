package exception.basic.checked;

/**
 * Exception을 상속받은 예외는 체크 예외가 된다.
 */

public class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message); // 부모에 오류 메시지 보관
    }
}
