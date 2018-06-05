package recursivedp;

import java.util.HashSet;
import java.util.Set;

/**
 * Implement an algorithm to print all valid (e.g., properly opened and closed) combinations of n pairs of parentheses.
 * EXAMPLE
 * Input: 3
 * Output: ((())), (()()), (())(), ()(()), ()()()
 */
public class _08_09_Parens {
    Set<String> allPairs;

    Set<String> combine(int pairs) {

        allPairs = new HashSet<>();
        if(pairs == 0) return allPairs;
        helper(pairs,pairs,"");
            return allPairs;
    }

    private void helper(int left, int right, String p) {
        if(left == 0 && right == 0) allPairs.add(p);
        if(left < right) helper(left,right-1, p + ")");
        if(left > 0) helper(left-1,right, p + "(");
    }

}
