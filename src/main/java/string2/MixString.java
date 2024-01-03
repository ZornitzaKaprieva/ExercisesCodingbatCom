package string2;

/*Given two strings, a and b, create a bigger string made of the first char of a, the first char of b,
the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"*/

public class MixString {
    public static void main(String[] args) {

        System.out.println(mixString("Hi", "There"));
    }

    public static String mixString(String a, String b) {
        String output = "";
        int newStringLength = 0;
        if(a.length() >= b.length()){
            newStringLength = a.length();
        } else{
            newStringLength = b.length();
        }

        for (int i = 0; i < newStringLength; i++) {

            if (a.length() > i && b.length() > i){
                output += a.charAt(i);
                output+= b.charAt(i);
            }

            if (a.length() > i && b.length() <= i){
                output += a.charAt(i);
            }

            if (a.length() <= i && b.length() > i){
                output+= b.charAt(i);
            }
        }

        return output;
    }
}
