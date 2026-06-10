package string.equals;

public class StringEqualsMain1 {

    public static void main(String[] args) {
        String str1 = new String("hello"); // x001
        String str2 = new String("hello"); // x002
        // 참조값이 다르기 때문에 false
        System.out.println("new String() == 비교: " + (str1 == str2));
        // 문자열의 값이 같은지 비교를 하기 때문에 true
        System.out.println("new String() equlas 비교: " + (str1.equals(str2)));

        String str3 = "hello"; // x003
        String str4 = "hello"; // x004
        System.out.println("리터럴 == 비교: " + (str3 == str4));
        System.out.println("리터럴 equals 비교: " + (str3.equals(str4)));
    }
}
