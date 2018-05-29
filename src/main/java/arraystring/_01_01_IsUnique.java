package arraystring;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 */

class _01_01_IsUnique {

    boolean isUnique(String str) {
        boolean [] letters = new boolean[256];
        for (int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
            if(letters[c-'a']){
              return false;
            } else{
              letters[c-'a'] = true;
            }
        }
        return true;
    }

}
