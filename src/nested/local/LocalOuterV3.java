package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

    private int outInstanceVar = 3; // 외부 클래스의 인스턴스 변수

    public Printer process(int paramVar) {

        int localVar = 1; // 지역 변수는 스택 프레임이 종료되는 순간 함께 제거된다
        // localVar = 2; -> 지역 변수는 사실상 final이라서 중간에 값을 변경할 수 없다

        // 지역 클래스(메서드 내부에서 선언)
        class LocalPrinter implements Printer {
            int value = 0;

            @Override
            public void print() {
                System.out.println("value = " + value);

                // 인스턴스는 지역 변수보다 더 오래 살아남는다
                System.out.println("localVar = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        // printer.print(); -> 실행하지 않고 Printer 인스턴스만 반환한다
        return printer;
    }

    public static void main(String[] args) {
        LocalOuterV3 localOuter = new LocalOuterV3();
        Printer printer = localOuter.process(2);

        // process()의 스택 프레임이 사라진 이후에 실행
        // print() 메서드를 통해 paramVar, localVar에 접근하면
        // 스택 영역에 있는 지역 변수에 접근하는 것이 아니라
        // 인스턴스에 있는 캡쳐한 변수에 접근하는 것
        printer.print();

        // 추가
        System.out.println("필드 확인");
        Field[] fields = printer.getClass().getDeclaredFields();
        for (Field field: fields) {
            System.out.println("field = " + field);
        }
    }
}
