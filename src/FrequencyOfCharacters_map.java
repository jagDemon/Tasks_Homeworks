import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacters_map {

    public static String frequency(String input){

        if(input == null ){
            return null;
        }
        if (input == "" || input.isEmpty()){
            return "empty map";
        }

        Map<String, Integer> map = new LinkedHashMap<>();

        for (String each : input.split("")){
            int frequency = Collections.frequency(Arrays.asList(input.split("")),each);
            map.put(each,frequency);
        }

        return map.toString();
    }


    public static void main(String[] args) {
        String str = "responsible";
        System.out.println(frequency(str));
    }
}
/*

Question-1 Frequency of Characters

-Write a method that returns the frequency of each character of a given String parameter.
-If the given String is null, then return null
-If the given String is empty return an empty map

Example-1
input: “”
output: empty map
explanation: input is empty
Example-2
input: null
output: null
explanation: input is null.
Example-3
input: responsible
output: {r=1, e=2, s=2, p=1, o=1, n=1, i=1, b=1, l=1}
explanation: characters are keys and occurrences are values

*/