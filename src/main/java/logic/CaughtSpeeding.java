package logic;

/*You are driving a little too fast, and a police officer stops you.
Write code to compute the result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket.
If speed is 60 or less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1.
If speed is 81 or more, the result is 2.
Unless it is your birthday -- on that day, your speed can be 5 higher in all cases.
caughtSpeeding(60, false) → 0
caughtSpeeding(65, false) → 1
caughtSpeeding(65, true) → 0*/
public class CaughtSpeeding {

    public static void main(String[] args) {

        System.out.println(caughtSpeeding(162, false));
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        int ticket = 0;

        if (!isBirthday){
            if (speed <= 60) {
                ticket = 0;
            } else if (speed >= 61 && speed <= 80) {
                ticket = 1;
            }else if (speed >= 81) {
                ticket = 2;
            }
        } else{
            if (speed <= 65) {
                ticket = 0;
            } else if (speed >= 66 && speed <= 85) {
                ticket = 1;
            }else if (speed >= 86) {
                ticket = 2;
            }
        }
        return ticket;
    }
}
