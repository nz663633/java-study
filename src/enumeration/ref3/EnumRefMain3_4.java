package enumeration.ref3;

public class EnumRefMain3_4 {

    public static void main(String[] args) {
        int price = 10000;
        Grade[] grades = Grade.values();

        // Grade 열거형의 모든 상수를 배열로 구할 수 있다.
        // Grade에 등급이 추가되어도 출력하는데에 문제 X
        for(Grade grade: grades) {
            printDiscount(grade, price);
        }
    }

    private static void printDiscount(Grade grade, int price) {
        System.out.println(grade.name() + " 등급의 할인 금액: " +
                grade.discount(price));
    }
}
