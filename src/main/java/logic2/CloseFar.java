package logic2;

/*Given three ints, a b c, return true if one of b or c is "close"
(differing from a by at most 1), while the other is "far",
differing from both other values by 2 or more.
Note: Math.abs(num) computes the absolute value of a number.
closeFar(1, 2, 10) → true
closeFar(1, 2, 3) → false
closeFar(4, 1, 3) → true*/

public class CloseFar {
    public static void main(String[] args) {

        System.out.println(closeFar(10, 8, 9));
    }

    public static boolean closeFar(int a, int b, int c) {

        int aMinusB = a - b;
        int aMinusC = a - c;
        int bMinusC = b - c;

        if (((Math.abs(aMinusB) == 1) || (Math.abs(aMinusB) == 0)) && ((Math.abs(aMinusC) >= 2 && Math.abs(bMinusC) >= 2))){
            return true;
        } else if (((Math.abs(aMinusC) == 1) || (Math.abs(aMinusB) == 0)) && ((Math.abs(aMinusB) >= 2 && Math.abs(bMinusC) >= 2))) {
            return true;
        }

        return false;
    }
}
