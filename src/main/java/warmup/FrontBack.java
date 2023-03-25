package warmup;

/*Given a string, return a new string where the first and last chars have been exchanged.
frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"*/
public class FrontBack {

    public static void main(String[] args) {

        System.out.println(frontBack("boris"));
    }

    public static String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        }

        String withoutFirstLetter = str.substring(1);
        String onlyFirstLetter = str.substring(0,1);
        String onlyLastLetter = str.substring(str.length()-1);
        String withoutFirstAndLastLetter = str.substring(1, str.length()-1);
        String output = onlyLastLetter + withoutFirstAndLastLetter + onlyFirstLetter;


        //return withoutFirstLetter;
        //return onlyFirstLetter;
        //return onlyLastLetter;
        //return withoutFirstAndLastLetter;
        return output;
    }
}
