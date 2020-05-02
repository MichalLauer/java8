package paper.practice;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class pLocalDateTime {

    public static void solution(){
        LocalDateTime dnes = LocalDateTime.now();
        for(int i = 1; i <= dnes.getMonth().maxLength(); i++){
            if(dnes.getDayOfMonth() == i){
                System.out.println(">> " + dnes.format(DateTimeFormatter.ofPattern("dd-MM-YYYY")));
            } else {
                System.out.println(dnes.withDayOfMonth(i).getDayOfMonth());
            }
        }
        for(int i = 0; i < 24;i++){
            if(dnes.getHour() == i){
                System.out.println(">> " + dnes.format(DateTimeFormatter.ofPattern("hh:mm")));
            } else {
                System.out.println(dnes.withHour(i).getHour());
            }
        }
    }
}
