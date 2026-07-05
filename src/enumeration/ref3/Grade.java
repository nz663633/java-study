package enumeration.ref3;

public enum Grade {
    // enum은 선언한 상수 외에 새로운 인스턴스를 생성할 수 없다.
    // 상수 선언과 동시에 생성자를 통해 필드에 값을 저장
    BASIC(10), GOLD(20), DIAMOND(30);

    private final int discountPercent;

    Grade(int discountPercent) { // private
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    // 추가
    public int discount(int price) {
        return price * getDiscountPercent() / 100;
    }
}
