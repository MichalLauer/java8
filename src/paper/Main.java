package paper;

import paper.study.*;
import paper.practice.*;

public class Main {

    public static void main(String[] args) {
        //Ukázkové příklady
        sLocalDate.content();
        sLocalTime.content();
        sLocalDateTime.content();
        sZonedDateTime.content();
        sDuration.content();
        sPeriod.content();
        sChronoUnit.content();
        sDateTimeFormatter.content();

        //Příklady na procvičení
        pLocalDate.solution();
        pLocalTime.solution();
        pLocalDateTime.solution();
    }
}
