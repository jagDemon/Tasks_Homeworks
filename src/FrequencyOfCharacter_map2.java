import java.util.HashMap;
import java.util.Map;

public class FrequencyOfCharacter_map2 {

        public static Map<Character, Integer> frequency(String input){

            if(input == null ){
                return null;
            }
            if (input.isEmpty()){
                return new HashMap<>(); // Return an empty map
            }

            Map<Character, Integer> map = new HashMap<>();

            char[] characters = input.toCharArray();

            for (char ch : characters){
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            return map;
        }

   /*     public static void main(String[] args) {
            String str = "ahmet tarik";
            Map<Character, Integer> charFrequencyMap = frequency(str);
            System.out.println(charFrequencyMap);
        }

*/
}
