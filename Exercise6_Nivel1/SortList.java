package Exercise6_Nivel1;

import java.util.ArrayList;
import java.util.List;

public class SortList {

    public static void start (){

        List<String> numbersAndWords=new ArrayList<>();

        numbersAndWords.add("Mango");
        numbersAndWords.add("39584");
        numbersAndWords.add("85767");
        numbersAndWords.add("Platano");
        numbersAndWords.add("Naranja");
        numbersAndWords.add("90857");

        numbersAndWords.sort((n1,n2)->Integer.compare(n1.length(),n2.length()));

        for(String words : numbersAndWords){

            System.out.println(words);
        }
    }

}
