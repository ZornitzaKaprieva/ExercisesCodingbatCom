package warmup;

/*Given a non-empty string and an int n, return a new string where the char at index n has been removed.
The value of n will be a valid index of a char in the original string
(i.e. n will be in the range 0..str.length()-1 inclusive).
missingChar("kitten", 1) → "ktten"
missingChar("kitten", 0) → "itten"
missingChar("kitten", 4) → "kittn"*/
public class MissingChar {

    public static void main(String[] args) {

        System.out.println(missingChar("zornitza", 5));
    }

    public static String missingChar(String str, int n) {
        String strLeft = str.substring(0,n);
        String cut = str.substring(n+1, str.length());
        String output = strLeft + cut;

        return output;
       // return strLeft;
       // return cut;


    }
}
