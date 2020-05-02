package paper.study;

import java.time.LocalDate;
import java.time.Period;

public class sPeriod {

    public static void content(){
        LocalDate ld1 = LocalDate.now();
        LocalDate ld2 = LocalDate.now().plusYears(3).plusDays(40);
        Period p = Period.between(ld1, ld2);
        System.out.println("Rozdíl ve dnech: " + p.getDays());
        System.out.println("Rozdíl ve měsícich: " + p.getMonths());
        System.out.println("Rozdíl ve letech: " + p.getYears());
    }

}
