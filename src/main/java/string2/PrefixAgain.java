package string2;

/*Given a string, consider the prefix string made of the first N chars of the string.
Does that prefix string appear somewhere else in the string? Assume that the string is not empty and that N is in the range 1..str.length().
prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false*/

public class PrefixAgain {
    public static void main(String[] args) {

        System.out.println(prefixAgain("aa", 1));
    }

    public static boolean prefixAgain(String str, int n) {
        if(str.length() == 2){
            if(str.charAt(0) == str.charAt(1)){
                return true;
            }
        }

        for (int i = n; i < str.length() - n; i++) {
            String pref = str.substring(0, n);
            String newPref = str.substring(i, i+n);

            int countPref = 0;
            if (pref.equals(newPref)){
                countPref++;
            }

            if (countPref > 0){
                return true;
            }
        }

        return false;
    }
}
