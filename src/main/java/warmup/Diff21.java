package warmup;

/*
Given an int n, return the absolute difference between n and 21,
except return double the absolute difference if n is over 21.
diff21(19) → 2*/

public class Diff21 {

    public static void main(String[] args) {

        int n = 23;
        System.out.println(diff21(n));

    }

    public static int diff21(int n) {
        if (n > 21){
            return Math.abs((n - 21) * 2);
        } else {
            return Math.abs(n - 21);
        }

    }
}
