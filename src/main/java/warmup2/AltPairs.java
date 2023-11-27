package warmup2;

/*Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"*/

public class AltPairs {
    public static void main(String[] args) {

        System.out.println(altPairs("ThisThatTheOther"));
    }

    public static String altPairs(String str) {
        String output = "";

        for (int i = 0; i < str.length(); i+=4) { //0,1, 4,5, 8,9
            output += str.charAt(i);
            if(i+1 < str.length()){
                output += str.charAt(i+1);
            }
        }
        return output;
    }
}
