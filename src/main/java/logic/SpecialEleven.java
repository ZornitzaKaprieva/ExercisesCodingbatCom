package logic;

/*We'll say a number is special if it is a multiple of 11 or
if it is one more than a multiple of 11.
Return true if the given non-negative number is special.
Use the % "mod" operator.
specialEleven(22) → true
specialEleven(23) → true
specialEleven(24) → false*/
public class SpecialEleven {

    public static void main(String[] args) {

        System.out.println(specialEleven(22));
    }

    public static boolean specialEleven(int n) {

        //solution 1:
         return (n % 11 == 0) || ((n - 1) % 11 == 0);

        //solution 2:
//        boolean special11 = n % 11 == 0;
//        boolean special11Plus1 = ((n - 1) % 11 == 0);
//
//        return special11 || special11Plus1;

    }
}
