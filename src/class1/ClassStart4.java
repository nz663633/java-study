package class1;

public class ClassStart4 {

    public static void main(String[] args) {
        // 자바에서 대입은 항상 변수에 들어 있는 값을 복사해서 전달한다
        // 변수에는 인스턴스 자체가 들어있는 것이 아니라
        // 인스턴스의 위치를 가리키는 참조값이 들어있을 뿐
        // 따라서 대입 시(=)에 인스턴스가 복사되는 것이 아니라 참조값(인스턴스 위치)만 복사됨

        Student student1 = new Student(); // 변수 student1에는 참조값만 저장
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student[] students = new Student[2]; // 2칸짜리 배열 생성
        students[0] = student1;
        students[1] = student2;

        System.out.println("이름:" + students[0].name + " 나이:" + students[0].age + " 성적:" + students[0].grade);
        System.out.println("이름:" + students[1].name + " 나이:" + students[1].age + " 성적:" + students[1].grade);
    }
}
