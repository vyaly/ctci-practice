package arraystring;

/**
 * Implement a method to perform basic string compression using the counts of repeated characters.
 * For example, the string aabcccccaaa would become a2blc5a3.
 * If the "compressed" string would not become smaller than the original string, your method should return
 * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 */
class _01_06_StringCompression {
    String compress(String s) {
        if (s.isEmpty()) {
            return s;
        }
        int count = 1;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < s.length(); i++){
            char prev = s.charAt(i-1);
            if ( prev  != s.charAt(i)) {
                sb.append(prev);
                sb.append(count);
                count = 1;
            }else {
                count++;
            }
        }

            sb.append(s.charAt(s.length()-1));
            sb.append(count);



        String result = new String(sb);
        if( result.length() < s.length()) {
            return result;
        } else {
            return s;
        }
    }
}
