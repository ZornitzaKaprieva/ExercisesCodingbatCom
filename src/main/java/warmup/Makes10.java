package warmup;

/* Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
makes10(9, 10) → true
makes10(9, 9) → false
makes10(1, 9) → true*/

public class Makes10 {

    public static void main(String[] args) {


        System.out.println(makes10(10, 8));
    }

    public static boolean makes10(int a, int b) {
        int sum = a + b;

        //Solution 1:
        return a == 10 || b == 10 || sum == 10;

        //Solution 2:
//        if (a == 10 || b == 10 || sum == 10){
//            return true;
//        } else {
//            return false;
//        }
    }

}
