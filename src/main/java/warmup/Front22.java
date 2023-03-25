package warmup;

/*
Given a string, take the first 2 chars and return the string with the 2 chars added at both the front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use whatever chars are there.


front22("kitten") → "kikittenki"
front22("Ha") → "HaHaHa"
front22("abc") → "ababcab"*/
public class Front22 {

    public static void main(String[] args) {

        System.out.println(front22("a"));
    }

    public static String front22(String str) {
        String output = "";
        String absString = "";

        if (str.length() == 0){
            return str;
        } else if (str.length() < 2) {
            absString = str.substring(0,1);
            return absString + str + absString;
        }

        if (str.length() >= 2) {
            absString = str.substring(0,2);
            output = absString + str + absString;
            return output;
        }

        return output;


    }

}
