package enumeration.ref3;

public class EnumRefMain3_2 {

    public static void main(String[] args) {
        int price = 10000;

        // DiscountService 필요없음(Grade에서 계산을 해주기 때문)
        System.out.println("BASIC 등급의 할인 금액: " + Grade.BASIC.discount(price));
        System.out.println("GOLD 등급의 할인 금액: " + Grade.GOLD.discount(price));
        System.out.println("DIAMOND 등급의 할인 금액: " + Grade.DIAMOND.discount(price));
    }
}
