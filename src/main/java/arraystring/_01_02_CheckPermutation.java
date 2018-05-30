package arraystring;

import java.util.Arrays;

/**
 * Given two strings,write a method to decide if one is a permutation of the other.
 */
class _01_02_CheckPermutation {
    boolean check(String a, String b) {
        char[] tempa = a.toCharArray();
        char[] tempb = b.toCharArray();

        Arrays.sort(tempa);
        Arrays.sort(tempb);
        String sorteda = new String(tempa);
        String sortedb = new String(tempb);
        return sorteda.equals(sortedb);

    }
}
