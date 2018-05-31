package arraystring;

/**
 * Write a method to replace all spaces in a string with '%20'
 * You may assume that the string has sufficient space at the end to hold the additional characters,
 * and that you are given the "true" length of the string.
 * (Note: If implementing in Java,please use a character array so that you can perform this operation in place.)
 * <p>
 * EXAMPLE
 * Input:  "Mr John Smith    ", 13
 * Output: "Mr%20John%20Smith"
 */
class _01_03_URLify {
    char[] urlify(char[] chars, int trueLength) {
        int spaces = 0;
        for (int i = 0; i < trueLength; i++) {
          if (chars[i] == ' '){
             spaces++;
          }
        }

        if(trueLength + spaces*2 > chars.length) {
            throw new IllegalArgumentException("char array does not have enough space");
        }
        for (int j = chars.length - 1; j >= 0; j-- ) {
          if (chars[trueLength-1] == ' '){
            chars[j--] = '0';
            chars[j--] = '2';
            chars[j] = '%';
          } else {
            chars[j] = chars[trueLength-1];
          }
          trueLength--;
        }
        return chars;
    }
}
