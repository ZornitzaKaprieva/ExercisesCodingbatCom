package warmup2;

/*Given a string and a non-negative int n, return a larger string that is n copies of the original string.
stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"*/

public class StringTimes {
    public static void main(String[] args) {

        System.out.println(stringTimes("Oh! Boy!", 2));
    }

public static String stringTimes(String str, int n) {
    String output = "";
    for (int i = 0; i < n; i++) {
        output += str;
    }
    return output;
    }
}
