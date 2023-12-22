package warmup2;

/*Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"*/

public class StringBits {
    public static void main(String[] args) {

        System.out.println(stringBits("Heeololeo"));
    }

    public static String stringBits(String str) {
        String output = "";

        for (int i = 0; i < str.length(); i += 2) {
            output += str.charAt(i);
        }

        return output;
    }
}
