package paper.study;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class sZonedDateTime {

    public static void content(){
        ZonedDateTime ldtNow = ZonedDateTime.now();
        ZonedDateTime ldtNowNY = ZonedDateTime.now(ZoneId.of("America/New_York"));
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        ZoneId zId = ZoneId.of("America/New_York");
        ZonedDateTime ldtOfZoneID = ZonedDateTime.of(ld, lt, zId);
    }
}
