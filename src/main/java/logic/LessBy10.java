package logic;

/*Given three ints, a b c, return true if one of them is 10 or more less than one of the others.
lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true*/
public class LessBy10 {

    public static void main(String[] args) {

        System.out.println(lessBy10(1, 7, 11));
    }

    public static boolean lessBy10(int a, int b, int c) {

        boolean isLessBy10 =  (a >= 10 + b) || (a >= 10 + c) ||
                                (b >= 10 + a) || (b >= 10 + c) ||
                                (c >= 10 + a) || (c >= 10 + b);

        return isLessBy10;
    }
}
