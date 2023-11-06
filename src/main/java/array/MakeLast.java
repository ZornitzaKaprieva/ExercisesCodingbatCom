package array;
import java.util.Arrays;

/*Given an int array, return a new array with double the length where its last element is the same as the original array,
and all the other elements are 0. The original array will be length 1 or more.
Note: by default, a new int array contains all 0's.
makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]*/

public class MakeLast {
    public static void main(String[] args) {

        int[] arr = new int[] {1, 2, 3, 9};

        System.out.println(Arrays.toString(makeLast(arr)));
    }

    public static int[] makeLast(int[] nums) {

        int lastInt = nums[nums.length-1];
        int intLength =nums.length * 2;

        int[] output = new int[intLength];
        output[intLength-1] = lastInt;
        return output;
    }
}
