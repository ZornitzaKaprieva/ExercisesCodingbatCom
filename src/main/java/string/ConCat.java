package string;

/*Given two strings, append them together (known as "concatenation") and return the result.
However, if the concatenation creates a double-char,
then omit one of the chars, so "abc" and "cat" yields "abcat".
conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"*/
public class ConCat {

    public static void main(String[] args) {

        System.out.println(conCat("abc", "cat"));
    }

    public static String conCat(String a, String b) {

        if (a.length() < 1){
            return b;
        } else if (b.length() < 1) {
            return a;
        }

        String withoutLastCharA = a.substring(0, a.length()-1);

        String lastCharA = a.substring(a.length()-1);
        String firstCharB = b.substring(0, 1);

        if (lastCharA.equals(firstCharB)){
            return withoutLastCharA.concat(b);
        }

        return a.concat(b);
    }
}
