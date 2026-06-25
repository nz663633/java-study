package lang.clazz;

public class ClassCreateMain {

    // 리플렉션을 이용해서 객체를 직접 생성
    public static void main(String[] args) throws Exception {
        // Class helloClass = Hello.class;
        Class helloClass = Class.forName("lang.clazz.Hello"); // Hello 클래스의 Class 객체 가져오기

        // helloClass의 생성자를 얻어서 인스턴스 생성
        // newInstance()의 반환형은 Object이기 때문에 Hello로 형변환
        Hello hello = (Hello) helloClass.getDeclaredConstructor().newInstance();
        String result = hello.hello();
        System.out.println("result = " + result);
    }
}
