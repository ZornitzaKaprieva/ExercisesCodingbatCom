package warmup;

/*Given a string, return true if the string starts with "hi" and false otherwise.
startHi("hi there") → true
startHi("hi") → true
startHi("hello hi") → false*/

public class StartHi {

    public static void main(String[] args) {

        System.out.println(startHi("h")); //solution 1
        System.out.println(startHi2("hi, there"));//solution 2

    }

    //solution 1:
    public static boolean startHi(String str) {
        if (str.length() < 2){
            return false;
        } else if ((str.substring(0, 2).equals("hi")) && str.length() >= 2) {
            return true;
        } else {
        return false;
    }
}


    //solution 2 (try-catch):
    public static boolean startHi2(String str) throws IndexOutOfBoundsException {
        try{

            if ((str.substring(0,2).equals("hi")) && str.length() >= 2){
                return true;
            } else {
                return false;
            }
        } catch (IndexOutOfBoundsException e){
            return false;
        }
    }
}

