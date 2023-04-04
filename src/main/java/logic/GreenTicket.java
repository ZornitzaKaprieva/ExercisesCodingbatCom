package logic;

/*You have a green lottery ticket, with ints a, b, and c on it.
If the numbers are all different from each other, the result is 0.
If all the numbers are the same, the result is 20.
If two of the numbers are the same, the result is 10.
greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10*/
public class GreenTicket {

    public static void main(String[] args) {

        System.out.println(greenTicket(1, 2, 3));
    }

    public static int greenTicket(int a, int b, int c) {
         int output = 0;
         
         if (a != b && b != c && c != a){
             output = 0;
         } else if (a == b && b == c) {
             output = 20;
         } else if ((a == b && a != c) || (b == c && b != a) || (c == a && c != b)) {
             output = 10;
         }

        return output;
    }
}
