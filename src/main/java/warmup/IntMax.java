package warmup;

/*Given three int values, a b c, return the largest.
intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3*/

public class IntMax {

    public static void main(String[] args) {

        System.out.println(intMax(9, 3, 3) );

    }

    public static int intMax(int a, int b, int c) {
        int maxValue = Math.max(a,Math.max (b,c));
        return maxValue;

    }
}
