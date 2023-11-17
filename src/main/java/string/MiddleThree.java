package string;

/*Given a string of odd length, return the string length 3 from its middle,
so "Candy" yields "and". The string length will be at least 3.
middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"*/

public class MiddleThree {
    public static void main(String[] args) {

        System.out.println(middleThree("Candy"));
    }

    public static String middleThree(String str) {

        if (str.length() <= 3){
            return str;
        }

        String firstHalf = str.substring(0, str.length()/2);
        String secondHalf = str.substring(str.length()/2);

        String lastFromFirstHalf = firstHalf.substring(firstHalf.length()-1);
        String firstFromSecondHalf = secondHalf.substring(0, 2);

        return lastFromFirstHalf + firstFromSecondHalf;
    }
}
