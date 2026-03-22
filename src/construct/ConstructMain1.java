package construct;

public class ConstructMain1 {

    public static void main(String[] args) {
        // 객체 생성과 동시에 생성자 호출
        // 직접 정의한 생성자를 반드시 호출 해야함 -> 필수값 입력을 보장
        MemberConstruct member1 = new MemberConstruct("user1", 15, 90);
        MemberConstruct member2 = new MemberConstruct("user2", 16, 80);

        MemberConstruct[] members = {member1, member2};

        for (MemberConstruct m : members) {
            System.out.println("이름: " + m.name + " 나이: " + m.age + " 성적: " + m.grade);
        }
    }
}
