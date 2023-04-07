package array;

/*Given an int array length 2, return true if it contains a 2 or a 3.
* Has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false*/
public class Has23 {

    public static void main(String[] args) {

        int[] output = {7,8};
        System.out.println(has23(output));
    }

    public static boolean has23(int[] nums) {

        return (nums[0] == 2 || nums[0] == 3) || (nums[1] == 2 || nums[1] == 3);
    }
}
