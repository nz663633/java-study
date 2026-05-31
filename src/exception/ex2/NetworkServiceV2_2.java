package exception.ex2;

public class NetworkServiceV2_2 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV2 client = new NetworkClientV2(address);
        client.initError(data); // 추가

        try {
            client.connect();
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() +
                    ", 메시지" + e.getMessage());
            return; // connect()에서 오류가 나면 send()로 넘어가지 않고 반환
        }

        try {
            client.send(data);
        } catch (NetworkClientExceptionV2 e) {
            System.out.println("[오류] 코드: " + e.getErrorCode() +
                    ", 메시지" + e.getMessage());
            return;
        }

        client.disconnect();
    }
}
