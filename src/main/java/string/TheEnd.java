package string;

/*Given a string, return a string length 1 from its front,
unless front is false, in which case return a string length 1 from its back.
The string will be non-empty.
theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"*/
public class TheEnd {

    public static void main(String[] args) {

        System.out.println(theEnd("Hello", true));
    }

    public static String theEnd(String str, boolean front) {

        String firstLetter = str.substring(0, 1);
        String lastLetter = str.substring(str.length()-1);

        if (front){
            return firstLetter;
        }

        return lastLetter;
    }
}
