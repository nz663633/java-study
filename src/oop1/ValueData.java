package oop1;

public class ValueData {
    int value;

    void add() {
        value++; // 위에 있는 자기 자신의 인스턴스 변수 value를 가리킴
        System.out.println("숫자 증가 value = " + value);
    }
}
