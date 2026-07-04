package enumeration.ref1;

public class ClassGrade {

    public static final ClassGrade BASIC = new ClassGrade(10); // x001
    public static final ClassGrade GOLD = new ClassGrade(20); // x002
    public static final ClassGrade DIAMOND = new ClassGrade(30); // x003

    private final int discountPercent;

    // 생성자
    // 생성자를 통해서만 discountPercent를 설정하도록 함
    // 중간에 이 값이 변하지 않도록 불변으로 설계
    public ClassGrade(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    // 조회 메서드
    public int getDiscountPercent() {
        return discountPercent;
    }
}
