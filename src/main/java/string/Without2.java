package string;

/*Given a string, if a length 2 substring appears at both its beginning and end,
return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") → ""*/

public class Without2 {
    public static void main(String[] args) {

        System.out.println(without2("H"));
    }

    public static String without2(String str) {

        if (str.length() < 2){
            return str;
        }

        String first2 = str.substring(0,2);
        String last2 = str.substring(str.length()-2);
        String withoutFirst2 = str.substring(2, str.length());

        if (str.length() >= 2 && first2.equals(last2)){
            return withoutFirst2;
        }

        return str;
    }
}
