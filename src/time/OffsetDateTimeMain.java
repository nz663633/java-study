package time;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class OffsetDateTimeMain {

    public static void main(String[] args) {
        OffsetDateTime nowOdt = OffsetDateTime.now();
        System.out.println("nowOdt = " + nowOdt);

        LocalDateTime ldf = LocalDateTime.of(2030, 1, 1, 13, 30, 50);
        System.out.println("ldf = " + ldf);

        // ZoneOffset은 UTC와의 시간 차이인 오프셋 정보만 보관
        OffsetDateTime odt = OffsetDateTime.of(ldf, ZoneOffset.of("+01:00"));
        System.out.println("odt = " + odt);
    }
}
