package warmup;

/*
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false*/

public class MonkeyTrouble {

    public static void main(String[] args) {


        System.out.println(monkeyTrouble(true, true));//true
        System.out.println(monkeyTrouble(false, false));//true
        System.out.println(monkeyTrouble(true, false));//false
        System.out.println(monkeyTrouble(false, true));//false

    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {

        //Solution 1:
        return (aSmile && bSmile) || (!aSmile && !bSmile);

        //Solution 2:
//        if ((aSmile && bSmile) || (!aSmile && !bSmile)){
//            return true;
//        } else {
//            return false;
//        }
    }
}

