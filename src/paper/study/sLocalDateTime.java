package paper.study;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class sLocalDateTime {

    public static void content(){
        LocalTime lt = LocalTime.now();
        LocalDate ld = LocalDate.now();
        LocalDateTime ltdOfInstances = LocalDateTime.of(ld, lt);
        LocalDateTime ltdSingapore = LocalDateTime.now(ZoneId.of("Asia/Singapore"));
        System.out.println("Čas a datum u tebe: " + ltdOfInstances);
        System.out.println("Čas a datum v Singaporu: " + ltdSingapore);

        ltdOfInstances = ltdOfInstances.plusDays(6);
        System.out.println(ltdOfInstances.isBefore(ltdSingapore));
    }

}
