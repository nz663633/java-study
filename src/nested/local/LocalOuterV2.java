package nested.local;

public class LocalOuterV2 {

    private int outInstanceVar = 3; // 외부 클래스의 인스턴스 변수

    public void process(int paramVar) {
        int localVar = 1; // 지역 변수

        // 지역 클래스(메서드 내부에서 선언)
        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() { // 지역 클래스도 인터페이스 구현가능
                System.out.println("value = " + value);
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.print();
    }

    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        localOuter.process(2);
    }
}
