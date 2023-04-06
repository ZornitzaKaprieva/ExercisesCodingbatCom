package logic;

/*Given a non-negative number "num",
return true if num is within 2 of a multiple of 10.
Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2.
nearTen(12) → true
nearTen(17) → false
nearTen(19) → true*/
public class NearTen {

    public static void main(String[] args) {

        System.out.println(nearTen(12));
    }
    public static boolean nearTen(int num) {

        boolean num1 = (num  % 10 == 0);
        boolean num2 = ((num + 1) % 10 == 0);
        boolean num3 = ((num + 2) % 10 == 0);
        boolean num4 = ((num - 1) % 10 == 0);
        boolean num5 = ((num - 2) % 10 == 0);

        boolean validNum = num1 || num2 || num3 || num4 || num5;

        return  validNum;
    }
}
