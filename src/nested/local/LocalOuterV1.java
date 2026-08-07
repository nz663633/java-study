package nested.local;

public class LocalOuterV1 {

    private int outInstanceVar = 3; // 외부 클래스의 인스턴스 변수

    public void process(int paramVar) {
        int localVar = 1; // 지역 변수

        // 지역 클래스(메서드 내부에서 선언)
        class LocalPrinter {
            int value = 0; // 지역 클래스의 인스턴스 변수

            public void printData() {
                System.out.println("value = " + value);

                // 지역 클래스는 자신이 선언된 메서드의 지역 변수에 접근 가능
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);

                // 지역 클래스는 자신을 감싸고 있는 외부 클래스의 멤버에 접근 가능
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }
}
