package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    // 추가
    // 인스턴스 변수와 메서드의 매개변수가 동일할 때 구분하는 방법 -> this 사용
    // 인스턴스 변수에 접근하려면 앞에 this. 을 붙여준다
    // 이 때 this는 인스턴스 자신의 참조값을 가리킨다(인스턴스 변수에 접근)
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

