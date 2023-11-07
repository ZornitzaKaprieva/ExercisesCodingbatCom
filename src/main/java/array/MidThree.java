package array;

/*Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array.
The array length will be at least 3.
midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]*/

public class MidThree {
    public static void main(String[] args) {

        int[] arr = {8, 6, 7, 5, 9};
        for (int i = 0; i < midThree(arr).length; i++) {
            System.out.print(midThree(arr)[i]);
        }
    }

    public static int[] midThree(int[] nums) {
        int[] output = new int[3];
        int half = nums.length / 2;
        int firstHalfDigit = nums[half - 1];
        int middleDigit = nums[(nums.length - half) - 1];
        int secondHalfDigit = nums[half + 1];

        output[0] = firstHalfDigit;
        output[1] = middleDigit;
        output[2] = secondHalfDigit;

        return output;
    }
}
