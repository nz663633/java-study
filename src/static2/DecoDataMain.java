package static2;

// 클래스 메서드를 사용하지 않아도 메서드 호출 가능
//import static static2.DecoData.staticCall;

public class DecoDataMain {

    // 정적 메서드는 정적 메서드는 호출 가능
    // -> 정적 메서드인 main()이 호출하는 메서드에는 정적 메서드를 사용
    // -> 정적 메서드인 main()메서드가 같은 클래스에서 호출하는 메서드도 정적 메서드로 선언해서 사용
    public static void main(String[] args) {
        System.out.println("1. 정적 호출");
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();
        DecoData.staticCall();

        System.out.println("2. 인스턴스 호출1");
        DecoData data1 = new DecoData();
        data1.instanceCall();

        System.out.println("3. 인스턴스 호출2");
        DecoData data2 = new DecoData();
        data1.instanceCall();

        // 추가
        // 인스턴스를 통한 접근 (추천 X)
        DecoData data3 = new DecoData();
        data3.staticCall();

        // 클래스를 통한 접근 (추천 O)
        DecoData.staticCall();

        // -> 두 가지 경우의 결과값은 같다
    }
}
