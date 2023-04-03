package string;

/*Given two strings, append them together (known as "concatenation") and return the result.
However, if the strings are different lengths,
omit chars from the longer string so it is the same length as the shorter string.
So "Hello" and "Hi" yield "loHi". The strings may be any length.
minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"*/

public class MinCat {

    public static void main(String[] args) {

        System.out.println(minCat("Hello", "Hi"));
    }

    public static String minCat(String a, String b) {

        int del = 0;

        if (a.length() > b.length()) {
            del = a.length()- b.length();
            a = a.substring(del, a.length());
        } else if (a.length() < b.length()) {
            del = b.length()- a.length();
            b = b.substring(del, b.length());
        }

        return a.concat(b);
    }
}
