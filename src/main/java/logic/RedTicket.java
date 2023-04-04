package logic;

/*You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2.
If they are all the value 2, the result is 10.
Otherwise, if they are all the same, the result is 5.
Otherwise, so long as both b and c are different from a, the result is 1.
Otherwise, the result is 0.
redTicket(2, 2, 2) → 10
redTicket(2, 2, 1) → 0
redTicket(0, 0, 0) → 5*/
public class RedTicket {

    public static void main(String[] args) {

        System.out.println(redTicket(2, 2, 2) );
    }

    public static int redTicket(int a, int b, int c) {

        int output = 0;

        if (a == b && b == c && c == 2){
            output = 10;
        } else if (a == b && b == c && c != 2) {
            output = 5;
        } else if (b != a && c !=a) {
            output = 1;
        } else {
            output = 0;
        }

        return output;
    }
}
