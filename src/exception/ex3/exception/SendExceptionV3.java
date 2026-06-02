package exception.ex3.exception;

// SendExceptionV3: 전송 실패시 발생하는 예외, 내부에 연결을 시도한 address를 보관
public class SendExceptionV3 extends NetworkClientExceptionV3 {

    private final String sendData;

    public SendExceptionV3(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}
