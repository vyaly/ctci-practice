package arraystring;

/**
 * There are three types of edits that can be performed on strings:
 * insert a character, remove a character, or replace a character.
 * Given two strings, write a function to check if they are one edit (or zero edits) away.
 * <p>
 * EXAMPLE
 * pale, ple -> true
 * pales, pale -> true
 * pale, bale -> true
 * pale, bake -> false
 */
class _01_05_OneAway {
    boolean isOneAway(String a, String b) {
        if (a.equals(b)) return true;
        if (Math.abs(a.length() - b.length())> 1) return false;
        int diff = 0;
        int i = 0;
        int j = 0;
        while(i < a.length() && j < b.length()) {
            if (a.charAt(i) != b.charAt(j)){
                diff++;
                if(a.length() > b.length()) {
                    i++;
                } else if(a.length() < b.length() ) {
                    j++;
                } else  {
                    i++;
                    j++;
                }
            } else {
                i++;
                j++;
            }
            if(diff > 1) return false;
        }

        if(diff > 1 || (i != a.length() && j == b.length())) return false;
        return true;
//        if ()
//        return false;
//        for ( int i = 0; i < a.length(); i ++) {
//
//        }
//return false;
    }

}
