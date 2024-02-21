import java.util.*;

public class IndexOfFirstNonRepeatingVowel {

    public static int findNonRepVowel(String input){

        Map<Character, Integer> map = new LinkedHashMap<>();

        char[] characters = input.toCharArray();

        for (char ch : characters){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()){
            char c = entry.getKey();
            int frequency = entry.getValue();
            if (c == 'a' || c=='e'|| c=='i'|| c=='o'|| c=='u') {
                if (frequency == 1) {
                    return input.indexOf(c);
                }
            }


        }
        //System.out.println(map);
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findNonRepVowel("google"));         // Output: 5
        System.out.println(findNonRepVowel("responsible"));   // Output: 4
        System.out.println(findNonRepVowel("mood"));          // Output: -1
    }
}

/*
Question-2 Index of First Non-repeating Vowel

-Given a string, write a method to find the index of first non-repeating vowel (a, e, i, o, u) in it and return it.
-If it doesn't exist, return -1. Assume that string is not empty, and all the characters of the String is
lowercase.
*Try to solve with Map data structure like using a Map<Character, Integer>.

Example-1:
Input: “google”
Output: 5
Explanation: only e is non-repeated vowel and it’s index is 5
Example-2:
Input: “responsible”
Output: 4
Explanation: e is repeated, o and i are not repeated, o is the first non-repeating vowel
Example-3:
Input: “mood”
Output: -1
Explanation: o is repeated, no non-repeating vowel.
*/