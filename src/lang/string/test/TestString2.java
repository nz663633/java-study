package lang.string.test;

public class TestString2 {

    public static void main(String[] args) {
        String[] arr = {"hello", "java", "jvm", "spring", "jpa"};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            int result = arr[i].length();
            System.out.println(arr[i] + ": " + result);
            sum += result;
        }
        System.out.println("sum = " + sum);
    }
}
