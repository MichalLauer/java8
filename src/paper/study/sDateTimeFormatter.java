package paper.study;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class sDateTimeFormatter {

    public static void content(){
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt.format(DateTimeFormatter.ofPattern("H:MM YYYY/MM/dd")));
    }

}
