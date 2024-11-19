package Exercise7_Nivel1;

import java.util.ArrayList;
import java.util.List;

public class SortList2 {

    public static void start (){

        List<String> numbersAndWords2=new ArrayList<>();

        numbersAndWords2.add("Mango");
        numbersAndWords2.add("39584");
        numbersAndWords2.add("85767");
        numbersAndWords2.add("Platano");
        numbersAndWords2.add("Naranja");
        numbersAndWords2.add("90857");

        numbersAndWords2.sort((n1,n2)->Integer.compare(n2.length(),n1.length()));

        for(String words : numbersAndWords2){

            System.out.println(words);
        }
    }
}
