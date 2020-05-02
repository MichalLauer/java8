package paper.practice;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class pLocalDate {

    public static void solution(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Zadejte první datum ve formátu YYYY-MM-DD");
        String d1 = scan.nextLine();
        System.out.println("Zadejte druhé datum ve formátu YYYY-MM-DD");
        String d2 = scan.nextLine();
        try{
            LocalDate ld2 = LocalDate.parse(d2);
            LocalDate ld1 = LocalDate.parse(d1);
            System.out.println("Rozdíl ve dnech je: " + Period.between(ld1, ld2).getDays());
        } catch(DateTimeParseException e){
            System.out.println(e.getLocalizedMessage());
        }
    }
}
