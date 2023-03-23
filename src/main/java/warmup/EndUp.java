package warmup;

/*Given a string, return a new string where the last 3 chars are now in upper case.
If the string has less than 3 chars, uppercase whatever is there.
Note that str.toUpperCase() returns the uppercase version of a string.
endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"*/
public class EndUp {

    public static void main(String[] args) {

        System.out.println(endUp("hello"));
    }
    public static String endUp(String str) {
        if (str.length() < 3){
            return str.toUpperCase();
        }

        int cutEnd3 = str.length() - 3;
        String front = str.substring(0, cutEnd3);
        String end = str.substring(cutEnd3);

        return  front + end.toUpperCase();
    }
}
