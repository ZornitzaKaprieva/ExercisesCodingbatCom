package warmup2;

/*Given an array of ints, return true if it contains a 2, 7, 1 pattern:
a value, followed by the value plus 5, followed by the value minus 1.
Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.
has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true*/

public class Has271 {
    public static void main(String[] args) {

        int [] arr = {1, 1, 4, 9, 4, 9, 2};
        System.out.println(has271(arr));
    }

    public static boolean has271(int[] nums) {

        for (int i = 0; i < nums.length - 2 ; i++) {
            int firstValue = nums[i];
            int secondValue = nums[i+1];
            int thirdValue = nums[i+2];

            if(firstValue + 5 == secondValue){
                if(firstValue - 1 == thirdValue || firstValue - 2 == thirdValue ||
                   firstValue - 3 == thirdValue || firstValue + 1 == thirdValue){
                    return true;
                    }
                }
        }
        return false;
    }
}
