package lang.string.test;

public class TestString1 {

    public static void main(String[] args) {
        String url = "https://www.example.com";

        // boolean yOrn = true;
        // if (url.startsWith("https://")) {
        //     System.out.println(yOrn);
        // } else {
        //     yOrn = false;
        //     System.out.println(yOrn);
        // }

        boolean result = url.startsWith("https://");
        System.out.println("result = " + result);
    }
}
