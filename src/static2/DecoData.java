package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    // static은 static만 접근 가능
    public static void staticCall() {
        // instanceValue++; -> 인스턴스 변수 접근, compile error
        // instanceMethod(); -> 인스턴스 메서드 접근, compile error

        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    // 외부에서 참조값을 넘겨오면 사용 가능
    public static void staticCall(DecoData data) {
        data.instanceValue++;
        data.instanceMethod();
    }
    
    public void instanceCall() {
        instanceValue++; // 인스턴스 변수 접근
        instanceMethod(); // 인스턴스 메서드 접근
        
        staticValue++; // 정적 변수 접근
        staticMethod(); // 정적 메서드 접근
    }

    private void instanceMethod() {
        System.out.println("instanceValue = " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue = " + staticValue);
    }
}
