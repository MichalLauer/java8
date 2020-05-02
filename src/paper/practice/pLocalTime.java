package paper.practice;

import java.time.LocalTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class pLocalTime {

    public static void solution(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Zadejte čas ve formátu HH:MM >> ");
        String t1 = scan.nextLine();
        LocalTime lt = null;
        try{
            lt = LocalTime.parse(t1);
        } catch(DateTimeParseException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Zadaný čas je: " + lt);
        while(!lt.equals(LocalTime.NOON)){
            System.out.println("Zadejte čas tak, aby bylo poledne >> ");
            String novyT = scan.nextLine();
            try{
                LocalTime temp = LocalTime.parse(novyT);
                lt = lt.plusHours(temp.getHour()).plusMinutes(lt.getMinute());
            } catch (DateTimeParseException e){
                System.out.println(e.getMessage());
            }
            if (lt.equals(LocalTime.NOON)){
                System.out.println("Super, splněno!");
            } else{
                System.out.println("Výsledný čas: " + lt + "\nZkus to ještě jednou:)");
            }
        }
    }
}
