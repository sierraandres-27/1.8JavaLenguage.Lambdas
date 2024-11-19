package Exercise3_Nivel1;

import java.util.List;

public class YearMonth {


    public static void start() {

        List<String> months=List.of("January","February","March","April","May","June", "August", "September","October","November","December");

        months.forEach(month-> System.out.println(month));

        //months.forEach(System.out::println);




    }

}
