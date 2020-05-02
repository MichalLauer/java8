package paper.study;

import java.time.LocalTime;
import java.time.ZoneId;

public class sLocalTime {

    public static void content(){
        LocalTime ltNow = LocalTime.now();
        System.out.println("ltNow = " + ltNow);
        ltNow.minusHours(9);
        ltNow.plusMinutes(53);
        System.out.println("Čas u tebe: " + ltNow);

        LocalTime ltLondon = LocalTime.now(ZoneId.of("Europe/London"));
        System.out.println("Čas v Londýně: " + ltLondon);
        ltLondon = ltLondon.withHour(LocalTime.now().getHour());
        System.out.println("Čas v Londýně ale jakoby v Praze: " + ltLondon);

        if (LocalTime.now().compareTo(LocalTime.NOON) == -1){
            System.out.println("Měl by jsi jít ještě spát, je před polednem!");
        }
        else if (LocalTime.now().compareTo(LocalTime.NOON) == 1){
            System.out.println("Už jdi spát, je dávno po poledni!");
        }
        else{
            System.out.println("Dej si šlofíka, je pravé poledne!");
        }
    }

}
