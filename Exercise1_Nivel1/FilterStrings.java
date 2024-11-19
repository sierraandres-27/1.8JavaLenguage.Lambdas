package Exercise1_Nivel1;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class FilterStrings {


    public static List<String> getwords (List<String>words){

        return words.stream()
                .filter(word->word.contains("o"))
                .collect(Collectors.toList());


    }


}