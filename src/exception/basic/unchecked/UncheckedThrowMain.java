package exception.basic.unchecked;

public class UncheckedThrowMain {

    public static void main(String[] args) {
        Service service = new Service();
        service.callThrow(); // 런타임 예외(에러) 발생
        System.out.println("정상 종료");
    }
}
