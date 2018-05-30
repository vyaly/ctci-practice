package arraystring;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards.
 * A permutation is a rearrangement of letters.
 * The palindrome does not need to be limited to just dictionary words.
 * <p>
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat", "atco cta", etc.)
 */
class _01_04_PalindromePermutation {
    boolean check(String s) {
        if (s.isEmpty()) return true;
        s = s.replace(" " , "");
        int [] letterFreq = new int[256];
        HashMap<Character, Integer> letterMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char l = s.charAt(i);
            if(  l != ' '){
                letterMap.put(l, letterMap.getOrDefault(l,0) + 1);
            }
        }
        int odd = 0;
        for(Map.Entry<Character, Integer> e : letterMap.entrySet()) {
          if(s.length() %2 == 0 && e.getValue()  %2 != 0 ) return false;
          if(s.length() %2 == 1 && e.getValue()  %2 != 0 ) odd++;
        }
        if( odd > 1 &&  s.length() %2 == 1) return false;
        return true;
    }
}
