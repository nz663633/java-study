package enumeration.ref3;

public class DiscountService {

    public int discount(Grade grade, int price) {
        return grade.discount(price); // Grade에서 할인율 계산 결과를 넘겨줌
    }
}
