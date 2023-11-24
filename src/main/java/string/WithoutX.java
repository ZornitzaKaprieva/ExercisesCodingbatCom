package string;

/*Given a string, if the first or last chars are 'x',
return the string without those 'x' chars, and otherwise return the string unchanged.
withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"*/

public class WithoutX {
    public static void main(String[] args) {

        System.out.println(withoutX("x"));
    }
    public static String withoutX(String str) {

        if (str.length() <= 1 && str.substring(0).equals("x")){
            return "";
        } else if (str.length() <= 1 && !str.substring(0).equals("x")) {
            return str;
        }

        String firstChar = str.substring(0,1);
        String lastChar = str.substring(str.length()-1);
        String withoutFirstLastChar = str.substring(1, str.length()-1);

        if (firstChar.equals("x") && lastChar.equals("x")){
            return withoutFirstLastChar;
        } else if (firstChar.equals("x") && !lastChar.equals("x")) {
            return str.substring(1, str.length());
        } else if (!firstChar.equals("x") && lastChar.equals("x")) {
            return str.substring(0, str.length()-1);
        }

        return str;
    }
}
