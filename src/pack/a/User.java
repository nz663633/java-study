package pack.a;

public class User {

    public User() { // 'public'이 있어야 다른 패키지에서 불러올 수 있다
        System.out.println("패키지 pack.a 회원 생성1");
    }
}
