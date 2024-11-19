package Exercise2_Nivel1;

import java.util.List;
import java.util.stream.Collectors;

public class FilterStrings2 {

    public static List<String> getwords2(List<String> words){

        return words.stream()
                .filter(word->word.contains("o")&& word.length() == 5)
                .collect(Collectors.toList());


    }


}
