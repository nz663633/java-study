package lang.string.method;

public class StringChangeMain2 {

    public static void main(String[] args) {
        String strWtihSpace = "         Java Programming  ";

        System.out.println("소문자로 변환: " + strWtihSpace.toLowerCase());
        System.out.println("대문자로 변환: " + strWtihSpace.toUpperCase());

        System.out.println("공백 제거(trim): '" + strWtihSpace.trim() + "'");
        System.out.println("공백 제거(strip): '" + strWtihSpace.strip() + "'");
        System.out.println("앞 공백 제거(strip): '" + strWtihSpace.stripLeading() + "'");
        System.out.println("뒤 공백 제거(strip): '" + strWtihSpace.stripTrailing() + "'");
    }
}
