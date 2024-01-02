package string2;

/*Return true if the string "cat" and "dog" appear the same number of times in the given string.
catDog("catdog") → true
catDog("catcat") → false
catDog("1cat1cadodog") → true*/

public class CatDog {
    public static void main(String[] args) {

        System.out.println(catDog("1cat1cadodog"));
    }

    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;
        for (int i = 0; i < str.length() - 2; i++) {
            if(str.charAt(i) == 'c' && str.charAt(i+1) == 'a' && str.charAt(i+2) == 't'){
                catCount++;
            }
            if(str.charAt(i) == 'd' && str.charAt(i+1) == 'o' && str.charAt(i+2) == 'g'){
                dogCount++;
            }
        }

        if(catCount == dogCount){
            return true;
        }
        return false;
    }
}
