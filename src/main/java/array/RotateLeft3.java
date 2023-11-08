package array;

import java.util.Arrays;

/*Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]*/
public class RotateLeft3 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(rotateLeft3(arr)));
    }

    public static int[] rotateLeft3(int[] nums) {
        int[] output = new int[3];
        output[0] = nums[1];
        output[1] = nums[2];
        output[2] = nums[0];

        return output;
    }
}
