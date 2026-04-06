package static2.ex;

public class Car {
    // 차량의 수를 누적해서 구해야하기 때문에 static
    private static int totalCars;
    private String name;

    public Car(String name) { // 생성자 (void 사용 X, 반환 X)
        System.out.println("차량 구입, 이름: " + name);
        this.name = name;
        totalCars++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + totalCars);
    }
}
