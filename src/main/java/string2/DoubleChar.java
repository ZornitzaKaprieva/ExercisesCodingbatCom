package string2;

/*Given a string, return a string where for every char in the original, there are two chars.
doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"*/

public class DoubleChar {
    public static void main(String[] args) {

        System.out.println(doubleChar("the"));
    }

    public static String doubleChar(String str) {
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            output += str.charAt(i);
            output += str.charAt(i);
        }
        return output;
    }
}
