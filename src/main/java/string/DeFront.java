package string;

/*Given a string, return a version without the first 2 chars.
Except keep the first char if it is 'a' and keep the second char if it is 'b'.
The string may be any length. Harder than it looks.
deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"*/
public class DeFront {

    public static void main(String[] args) {

        System.out.println(deFront("away"));
    }

    public static String deFront(String str) {

        if (str.length() < 2){
            return str;
        }

        String withoutFirst2 = str.substring(2, str.length());
        String firstChar = str.substring(0,1);
        String secondChar = str.substring(1,2);

        if (firstChar.equals("a") && !secondChar.equals("b")){
            return firstChar.concat(withoutFirst2);
        } else if (!firstChar.equals("a") && secondChar.equals("b")) {
            return secondChar.concat(withoutFirst2);
        } else if (firstChar.equals("a") && secondChar.equals("b")) {
            return str;
        }

        return withoutFirst2;
    }


}
