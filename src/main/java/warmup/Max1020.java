package warmup;

/*Given 2 positive int values, return the larger value that is in the range 10..20 inclusive,
or return 0 if neither is in that range.
Max1020(11, 19) → 19
Max1020(19, 11) → 19
Max1020(11, 9) → 11*/
public class Max1020 {

    public static void main(String[] args) {

        System.out.println(max1020(11,19));
    }

    public static int max1020(int a, int b) {
        boolean aIsInRange = (a>=10 && a <=20);
        boolean bIsInRange = (b >=10 && b <=20);

        if (aIsInRange && bIsInRange){
            return Math.max(a, b);
        } else if (aIsInRange && !bIsInRange) {
            return a;
        } else if (!aIsInRange && bIsInRange) {
            return b;
        } else{
            return 0;
        }
    }
}
