package paper.study;

import java.time.LocalDate;
import java.time.ZoneId;

public class sLocalDate {

    public static void content(){
        LocalDate ldNow = LocalDate.now();
        LocalDate ldAustralia = LocalDate.now(ZoneId.of("Australia/Canberra"));
        System.out.println("Den u tebe: " + ldNow.getDayOfWeek());
        System.out.println("Den v Austrálii: " + ldAustralia.getDayOfWeek());
        System.out.println("Jsi pozadu? --> " + ldNow.isBefore(ldAustralia));

        LocalDate ldCustom = LocalDate.of(1234, 7,18);
        System.out.println("Den v týdnu: " + ldCustom.getDayOfWeek());
        System.out.println("Den v roce: " + ldCustom.getDayOfYear());
        System.out.println("Měsíc v roce: " + ldCustom.getMonth());
        System.out.println("Délka měsíce: " + ldCustom.lengthOfMonth());
        System.out.println("Éra: " + ldCustom.getEra());
    }

}
