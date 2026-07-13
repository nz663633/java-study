package time;

import java.time.ZoneId;
import java.util.Set;

public class ZoneIdMain {

    public static void main(String[] args) {
        Set availableZoneIds = ZoneId.getAvailableZoneIds();

        // 배열을 반환한다고 생각하면 된다.
        for (String availableZoneId : ZoneId.getAvailableZoneIds()) {
            System.out.println("availableZoneId = " + availableZoneId);
            ZoneId zoneId = ZoneId.of(availableZoneId);
            System.out.println(zoneId + " | " + zoneId.getRules());
        }

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("ZoneId.systemDefault = " + zoneId);

        ZoneId seoulZoneId = ZoneId.of("Asia/Seoul");
        System.out.println("seoulZoneID = " + seoulZoneId);
    }
}
