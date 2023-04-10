package array;

/*Given an int array length 3,
if there is a 2 in the array immediately followed by a 3,
set the 3 element to 0. Return the changed array.
fix23([1, 2, 3]) → [1, 2, 0]
fix23([2, 3, 5]) → [2, 0, 5]
fix23([1, 2, 1]) → [1, 2, 1]*/
public class Fix23 {

    public static void main(String[] args) {

        int[] output = {2,3,5};
        for (int i = 0; i < output.length; i++) {
            System.out.println(fix23(output)[i]);
        }
    }

    public static int[] fix23(int[] nums) {

        int[] nullVs3 = new int[3];
        if (nums[0] == 2 && nums[1] == 3){
            nullVs3[0] = nums[0];
            nullVs3[1] = 0;
            nullVs3[2] = nums[2];
        } else if (nums[1] == 2 && nums[2] == 3) {
            nullVs3[0] = nums[0];
            nullVs3[1] = nums[1];
            nullVs3[2] = 0;
        } else {
            nullVs3 = nums;
        }

        return nullVs3;
    }
}
