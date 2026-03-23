package pack;

// 같은 이름의 클래스가 있다면 import는 둘 중 하나만 가능
// 보통 자주 사용하는 클래스를 import
import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User user = new User();
        pack.b.User user3 = new pack.b.User();
    }
}
