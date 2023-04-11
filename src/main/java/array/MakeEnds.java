package array;

/*Given an array of ints,
return a new array length 2 containing the first and last elements from the original array.
The original array will be length 1 or more.
makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]*/
public class MakeEnds {

    public static void main(String[] args) {

        int[] output = {2,3,5};
        for (int i = 0; i < output.length; i++) {
            System.out.println(makeEnds(output)[i]);
        }


    }

    public static int[] makeEnds(int[] nums) {

        int[] newArray = {nums[0], nums[nums.length-1]};

        return newArray;
    }
}
