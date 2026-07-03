package enumeration.ex3;

public class DiscountService {

    public int discount(Grade classGrade, int price) {
        int discountPercent = 0;

        if(classGrade == Grade.BASIC) { // x001
            discountPercent = 10;
        } else if(classGrade == Grade.GOLD) { // x002
            discountPercent = 20;
        } else if (classGrade == Grade.DIAMOND) { // x003
            discountPercent = 30;
        } else {
            System.out.println("할인 X");
        }

        // 10000원 * (20 / 100) -> 2000원
        return price * discountPercent / 100;
    }
}
