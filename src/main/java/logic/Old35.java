package logic;

/*Return true if the given non-negative number is a multiple of 3 or 5, but not both.
Use the % "mod" operator.
old35(3) → true
old35(10) → true
old35(15) → false*/
public class Old35 {

    public static void main(String[] args) {

        System.out.println(old35(3));
    }

    public static boolean old35(int n) {

        boolean multiple3 = n % 3 == 0;
        boolean multiple5 = n % 5 == 0;

        return (multiple3 && !multiple5) || (!multiple3 && multiple5);
    }
}
