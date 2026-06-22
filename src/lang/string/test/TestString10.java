package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        // 분리하기
        String[] parts = fruits.split(",");
        for (String fruit : parts) {
            System.out.println(fruit);
        }

        // 합치기
        String joined = String.join("->", parts);
        System.out.println("joined = " + joined);
    }
}
