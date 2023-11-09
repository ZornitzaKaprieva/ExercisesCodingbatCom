package array;

import java.util.Arrays;

/*Given an array of ints, swap the first and last elements in the array.
Return the modified array. The array length will be at least 1.
swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]*/

public class SwapEnds {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 6};

        System.out.println(Arrays.toString(swapEnds(arr)));
    }

    public static int[] swapEnds(int[] nums) {

        int[] swapInt = nums;

        int intNums0 = nums[0];
        swapInt[0] = nums[nums.length - 1];
        swapInt[swapInt.length - 1] = intNums0;

        return swapInt;
    }
}
