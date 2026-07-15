package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {

    public static void main(String[] args) {
        // 생성
        Instant now = Instant.now(); // UTC 기준
        System.out.println("now = " + now);

        ZonedDateTime zdt = ZonedDateTime.now();
        Instant from = Instant.from(zdt);
        System.out.println("from = " + from);

        // 1970-01-01 00:00:00(에포크 시간)에서 100초를 더함
        Instant epochStart = Instant.ofEpochSecond(100);
        System.out.println("epochStart = " + epochStart);

        // 계산
        Instant later = epochStart.plusSeconds(3600);
        System.out.println("later = " + later);

        // 조회
        long laterEpochSecond = later.getEpochSecond();
        System.out.println("laterEpochSecond = " + laterEpochSecond);
    }
}
