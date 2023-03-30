package string;

/*Given 2 strings, a and b, return a string of the form short+long+short,
with the shorter string on the outside and the longer string on the inside.
The strings will not be the same length, but they may be empty (length 0).
comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"*/
public class ComboString {

    public static void main(String[] args) {

        System.out.println(comboString("Hello", "hi"));
    }

    public static String comboString(String a, String b) {

        String comboString = "";

        if (a.length() == 0){
            comboString =  b;
        } else if (b.length() == 0) {
            comboString = a;
        }

        if (a.length() > b.length()){
            comboString =  b + a + b;
        } else if (a.length() < b.length()) {
            comboString = a + b + a;
        }

        return comboString;
    }
}
