package string2;

/*Given two strings, word and a separator sep, return a big string made of count occurrences of the word,
separated by the separator string.
repeatSeparator("Word", "X", 3) → "WordXWordXWord"
repeatSeparator("This", "And", 2) → "ThisAndThis"
repeatSeparator("This", "And", 1) → "This"*/

public class RepeatSeparator {
    public static void main(String[] args) {

        System.out.println(repeatSeparator("Word", "X", 3));
    }

    public static String repeatSeparator(String word, String sep, int count) {
        String output = "";
        for (int i = 1; i <= count; i++) {
            if (i != count){
                output += word + sep;
            } else {
                output += word;
            }
        }
        return output;
    }
}
