package warmup;

/*Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event of a tie.
Note that Math.abs(n) returns the absolute value of a number.
close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0*/
public class Close10 {

    public static void main(String[] args) {

        System.out.println(close10(8, 13));

    }

    public static int close10(int a, int b) {
        boolean aIsNearestTo10 = Math.abs(10 - a) < Math.abs(10-b);
        boolean bIsNearestTo10 = Math.abs(10 - a) > Math.abs(10-b);
        if (aIsNearestTo10){
            return a;
        } else if (bIsNearestTo10) {
            return b;
        } else {
            return 0;
        }
    }
}

