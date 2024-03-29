package string;

/*Given 2 strings, a and b,
return a new string made of the first char of a and the last char of b, so "yo" and "java" yields "ya".
If either string is length 0, use '@' for its missing char.
lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"*/

public class LastChars {
    public static void main(String[] args) {

        System.out.println(lastChars("", ""));
    }

    public static String lastChars(String a, String b) {

        String firstA = "";
        String lastB = "";

        if (a.length() >= 1) {
            firstA = a.substring(0, 1);
        }else {
            firstA = "@";
        }

        if (b.length() >= 1){
            lastB = b.substring(b.length()-1);
        } else {
            lastB = "@";
        }

        return firstA + lastB;
    }
}
