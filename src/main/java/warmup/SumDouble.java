package warmup;

/*Given two int values, return their sum.
Unless the two values are the same, then return double their sum.
sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8*/

public class SumDouble {

    public static void main(String[] args) {

        int a = 5;
        int b = 7;

        System.out.println(sumDouble(a, b));
        System.out.println(sumDouble(5, 5));

    }

    public static int sumDouble(int a, int b) {
        if (a==b){
            return (a+b)*2;
        } else {
            return a + b;
        }
    }
}
