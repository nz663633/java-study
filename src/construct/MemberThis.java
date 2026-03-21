package construct;

public class MemberThis {
    String nameField;

    // this 생략
    // 변수를 찾을 때 가까운 지역변수(매개변수도 지역변수)를 먼저 찾고
    // 없을 경우 그 다음으로 인스턴스 변수를 찾는다
    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
}
