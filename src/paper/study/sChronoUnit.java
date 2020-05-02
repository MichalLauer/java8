package paper.study;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class sChronoUnit {

    public static void content(){
        LocalTime lt1 = LocalTime.now(ZoneId.of("America/New_York"));
        LocalDate ld1 = LocalDate.now(ZoneId.of("Australia/Canberra"));
        LocalDateTime ldt1 = LocalDateTime.now();
        LocalDateTime ldt2 = LocalDateTime.now().plusDays(62).plusHours(13);
        System.out.println("Rozdíl ve dnech: " + ChronoUnit.DAYS.between(ldt1, ldt2));
        System.out.println("Rozdíl v hodinách: " + ChronoUnit.HOURS.between(ldt1, ldt2));
        System.out.println("Rozdíl v sekundách: " + ChronoUnit.SECONDS.between(lt1, ldt1));
        System.out.println("Rozdíl ve dnech: " + ChronoUnit.DAYS.between(ld1, ldt2));
    }

}
