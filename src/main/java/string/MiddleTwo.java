package string;

/*Given a string of even length, return a string made of the middle two chars,
so the string "string" yields "ri". The string length will be at least 2.
middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"*/

public class MiddleTwo {
    public static void main(String[] args) {

        System.out.println(middleTwo("string"));
    }

    public static String middleTwo(String str) {

        if (str.length() <= 2){
            return str;
        }

        String firstHalf = str.substring(0, str.length()/2);
        String secondHalf = str.substring(str.length()/2, str.length());

        String firstChar = firstHalf.substring(firstHalf.length() -1);
        String secondChar = secondHalf.substring(0, 1);

        return firstChar + secondChar;
    }
}
