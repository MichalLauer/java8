package paper.study;

import java.time.Duration;
import java.time.LocalTime;

public class sDuration {

    public static void content(){
        LocalTime lt1 = LocalTime.now();
        LocalTime lt2 = LocalTime.now().plusHours(4);
        Duration d = Duration.between(lt1, lt2);
        System.out.println("Rozdíl v sekundách: " + d.getSeconds());
        System.out.println("Rozdíl v minutách: " + d.getSeconds()/60);
        System.out.println("Rozdíl v hodinách: " + d.getSeconds()/3600);
    }

}
