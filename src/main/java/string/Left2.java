package string;

/*Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
The string length will be at least 2.
left2("Hello") → "lloHe"
left2("java") → "vaja"
left2("Hi") → "Hi"*/

public class Left2 {
    public static void main(String[] args) {

        System.out.println(left2("java"));
    }

    public static String left2(String str) {

        String firs2Chars = str.substring(0, 2);
        String lastChars  = str.substring(2, str.length());

        return lastChars + firs2Chars;
    }
}
