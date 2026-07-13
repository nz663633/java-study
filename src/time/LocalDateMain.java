package time;

import java.time.LocalDate;

public class LocalDateMain {

    public static void main(String[] args) {
        // now(): 현재 시간을 기준으로 생성
        LocalDate nowDate = LocalDate.now();
        // of(): 특정 날짜를 기준으로 생성
        LocalDate ofDate = LocalDate.of(2020, 01, 01);
        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = " + ofDate);

        // 계산(불변)
        // 모든 날짜 클래스는 불변이므로, 반환값을 꼭 받아야 한다.
        ofDate = ofDate.plusDays(10);
        System.out.println("지정 날짜 + 10d = " + ofDate);
    }
}
