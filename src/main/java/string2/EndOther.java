package string2;

/*Given two strings, return true if either of the strings appears at the very end of the other string,
ignoring upper/lower case differences (in other words, the computation should not be "case sensitive").
Note: str.toLowerCase() returns the lowercase version of a string.
endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true*/

public class EndOther {
    public static void main(String[] args) {

        System.out.println(endOther("Hiabc", "abc"));
    }

    public static boolean endOther(String a, String b) {
        String str1 = a.toLowerCase();
        String str2 = b.toLowerCase();

        int newStrLength = 0;
        if(a.length() >= b.length()){
            newStrLength = b.length();
        } else {
            newStrLength = a.length();
        }

        String last1 = str1.substring(str1.length() - newStrLength, str1.length());
        String last2 = str2.substring(str2.length() - newStrLength, str2.length());

        if(last1.equals(last2)){
            return true;
        }

        return false;
    }
}