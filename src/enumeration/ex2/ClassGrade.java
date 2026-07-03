package enumeration.ex2;

public class ClassGrade {

    /*
    타입 안전 열거형 패턴
    - 타입 안정성 향상: 정해진 객체만 사용할 수 있기 때문에, 잘못된 값을 입력하는 문제를 근본적으로 방지,
                      잘못된 값이 할당되거나 사용되는 것을 컴파일 시점에 방지할 수 있음
    - 데이터 일관성: 정해진 객체만 사용하므로 데이터의 일관성이 보장
    - 제한된 인스턴스 생성: 사전에 정의된 몇 개의 인스턴스만 생성하고 외부에서는 이 인스턴스들만 사용할 수 있도록 함
     */
    public static final ClassGrade BASIC = new ClassGrade(); // x001
    public static final ClassGrade GOLD = new ClassGrade(); // x002
    public static final ClassGrade DIAMOND = new ClassGrade(); // x003

    // private 생성자 추가
    private ClassGrade() {}
}
