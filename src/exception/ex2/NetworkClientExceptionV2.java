package exception.ex2;

public class NetworkClientExceptionV2 extends Exception {

    // 예외 에러 코드 저장용 변수
    private String errorCode;

    public NetworkClientExceptionV2(String errorCode, String message) {
        super(message); // 부모(Exception)에 에러 메시지 저장
        this.errorCode = errorCode;
    }

    // 에러 코드 조회(반환)
    public String getErrorCode() {
        return errorCode;
    }
}
