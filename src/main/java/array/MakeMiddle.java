package array;

/*Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array.
The original array will be length 2 or more.
makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]*/

public class MakeMiddle {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4};

        for (int i = 0; i < makeMiddle(arr).length; i++) {
            System.out.print(makeMiddle(arr)[i]);
        }
    }

    public static int[] makeMiddle(int[] nums) {
        int[] output = new int[2];
        int half = nums.length / 2;
        int digitFromFirstHalf = nums[half - 1];
        int digitFromSecondHalf = nums[half];
        output[0] = digitFromFirstHalf;
        output[1] = digitFromSecondHalf;

        return output;
    }
}
