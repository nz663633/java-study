package construct;

public class MemberConstruct {
    String name;
    int age;
    int grade;

    // 1번
    MemberConstruct(String name, int age) {
        // this() 생성자 코드는 항상 첫줄에 작성해야함
        this(name, age, 50); // 변경, 2번 생성자로 넘겨줘서 호출(중복 제거 가능)
        System.out.println("생성자 호출 name = " + name + " ,age = " + age + " ,grade = " + 50);
//        this.name = name;
//        this.age = age;
//        this.grade = 50;
    }

    // 2번
    // 생성자(메서드와 비슷)
    // 생성자의 이름은 클래스 이름과 같아야 함
    // 생성자는 반환 타입 X
    // 그 외 나머지는 메서드와 동일
    MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name = " + name + " ,age = " + age + " ,grade = " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
