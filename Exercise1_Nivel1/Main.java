package Exercise1_Nivel1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String>countries=List.of("Albania","Chipre","Colombia","Mexico", "Paraguay","Ecuador","inglaterra","Peru");


        List<String>countrieswith_o=FilterStrings.getwords(countries);

        System.out.println("Countries that have the word o: "+countrieswith_o);

    }

}
