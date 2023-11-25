package string;

/*Given a string, if one or both of the first 2 chars is 'x',
return the string without those 'x' chars, and otherwise return the string unchanged.
This is a little harder than it looks.
withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"*/

public class WithoutX2 {
    public static void main(String[] args) {

        System.out.println(withoutX2("Hxi"));
    }

    public static String withoutX2(String str) {

        if (str.length() < 2 && str.contains("x")){
            return "";
        } else if (str.length() < 2) {
            return str;
        }

        String firstChar = str.substring(0,1);
        String secondChar = str.substring(1,2);

        if (firstChar.equals("x") && secondChar.equals("x")){
            return str.substring(2, str.length());
        } else if (firstChar.equals("x") && !secondChar.equals("x")) {
            return str.substring(1, str.length());
        } else if (!firstChar.equals("x") && secondChar.equals("x")) {
            return str.substring(0,1).concat(str.substring(2, str.length()));
        }

        return str;
    }
}
