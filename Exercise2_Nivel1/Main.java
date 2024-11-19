package Exercise2_Nivel1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> countries2=List.of("Albania","Chipre","Colombia","Mexico", "Paraguay","Ecuador","inglaterra","Peru");

        List<String>countiesWith=FilterStrings2.getwords2(countries2);

        System.out.println("Countries with o and five letters: "+countiesWith);
        

    }





}
