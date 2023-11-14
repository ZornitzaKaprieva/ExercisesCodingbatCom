package string;

/*Given a string of any length, return a new string where the last 2 chars,
if present, are swapped, so "coding" yields "codign".
lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"*/

public class LastTwo {
    public static void main(String[] args) {

        System.out.println(lastTwo("coding") );
    }

    public static String lastTwo(String str) {

        if (str.length() <= 1){
            return str;
        }

        String without2 = str.substring(0, str.length()-2);

        String last1 = str.substring(str.length()-1);
        String last2 = str.substring(str.length()-2, str.length()-1);


        return without2 + last1 + last2;
    }
}
