package warmup2;

/*Given a string and a non-negative int n, we'll say that the front of the string is the first 3 chars,
or whatever is there if the string is less than length 3. Return n copies of the front;
frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc"*/

public class FrontTimes {
    public static void main(String[] args) {

        System.out.println(frontTimes("a", 2));
    }

    public static String frontTimes(String str, int n) {

        int frontLength = 3;
        if (frontLength > str.length()){
            frontLength = str.length();
        }

        String frondLetters = str.substring(0, frontLength);
        String output = "";
        for (int i = 0; i < n; i++) {
            output += frondLetters;
        }
        return output;
    }
}
