package immutable.change;

public class MutableMain {

    public static void main(String[] args) {
        MutableObj obj = new MutableObj(10);
        obj.add(20);

        // 계산 이후의 기존 값은 사라짐(value 10의 값은 30으로 대체됨)
        System.out.println("obj = " + obj.getValue());
    }
}
