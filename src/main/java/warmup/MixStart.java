package warmup;

/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.

mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false*/

public class MixStart {

    public static void main(String[] args) {

        System.out.println();

    }
    public static boolean mixStart(String str) {
        boolean isValidString = str.length() >= 3;

        return isValidString && str.substring(1,3).equals("ix");
    }

}
