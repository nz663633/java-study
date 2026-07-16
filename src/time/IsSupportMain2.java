package time;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class IsSupportMain2 {

    public static void main(String[] args) {
        // LocalDate는 연,월,일 (시간 존재 X)
        LocalDate now = LocalDate.now();

        // 해당 필드 지원여부를 반환
        boolean supported = now.isSupported(ChronoField.SECOND_OF_MINUTE);
        System.out.println("supported = " + supported);
        if (supported) {
            int minute = now.get(ChronoField.SECOND_OF_MINUTE);
            System.out.println("minute = " + minute);
        }
    }
}
