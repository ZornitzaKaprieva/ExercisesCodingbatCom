package warmup2;

/*Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".
doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true*/

public class DoubleX {
    public static void main(String[] args) {

        System.out.println(doubleX("waxttxx"));
    }

    public static boolean doubleX(String str) {
        str = str.toLowerCase();
        int firstX = str.indexOf('x');

        if(firstX + 1 < str.length() && str.charAt(firstX + 1) == 'x'){
            return true;
        } else {
            return false;
        }
    }
}

