package array;

/*Given an array of ints length 3, figure out which is larger,
the first or last element in the array,
and set all the other elements to be that value. Return the changed array.
maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]*/

public class MaxEnd3 {

    public static void main(String[] args) {

        int[] input = {1, 2, 3};

        for (int i = 0; i < input.length; i++) {
            System.out.print(maxEnd3(input)[i]);
        }


    }

    public static int[] maxEnd3(int[] nums) {
        int[] newInt = new int[3];
        if (nums[0] >= nums[2]){
            newInt[0] = nums[0];
            newInt[1] = nums[0];
            newInt[2] = nums[0];
        } else if (nums[0] < nums[2]){
            newInt[0] = nums[2];
            newInt[1] = nums[2];
            newInt[2] = nums[2];
        }

        return newInt;
    }

}
