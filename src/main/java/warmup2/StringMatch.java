package warmup2;

/*Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0*/

public class StringMatch {
    public static void main(String[] args) {

        System.out.println(stringMatch("xxcaazz", "xxbaaz"));
    }

    public static int stringMatch(String a, String b) {
        int lengthSubstring = 0;
        if(a.length() >= b.length()){
            lengthSubstring = b.length();
        } else {
            lengthSubstring = a.length();
        }

        int output = 0;
        for (int i = 0; i < lengthSubstring - 1; i++) {
            String aSubstring = a.substring(i, i+2);
            String bSubstring = b.substring(i, i+2);
            if(aSubstring.equals(bSubstring)){
                output++;
            }
        }
        return output;
    }
}
