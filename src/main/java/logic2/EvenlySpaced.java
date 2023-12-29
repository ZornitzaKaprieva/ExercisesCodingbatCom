package logic2;

/*Given three ints, a b c, one of them is small, one is medium and one is large.
Return true if the three values are evenly spaced, so the difference between small and medium is the same as the difference between medium and large.
evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false*/

public class EvenlySpaced {
    public static void main(String[] args) {

        System.out.println(evenlySpaced(4, 6, 3));
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int intSmall = 0;
        if (a < b && a < c) {
            intSmall = a;
        } else if (b < a && b < c) {
            intSmall = b;
        } else if (c < a && c < b) {
            intSmall = c;
        }

        int intMedium = 0;
        if ((a < b && a > c) || (a > b && a < c)) {
            intMedium = a;
        } else if ((b < a && b > c) || (b > a && b < c)) {
            intMedium = b;
        } else if ((c < a && c > b) || (c > a && c < b)) {
            intMedium = c;
        }

        int intLarge = 0;
        if (a > b && a > c) {
            intLarge = a;
        } else if (b > a && b > c) {
            intLarge = b;
        } else if (c > a && c > b) {
            intLarge = c;
        }

        if (intMedium - intSmall == intLarge - intMedium){
            return true;
        }
        return false;
    }
}
