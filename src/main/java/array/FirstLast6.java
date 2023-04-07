package array;

/*Given an array of ints, return true if 6 appears as either the first or last element in the array.
The array will be length 1 or more.
firstLast6([1, 2, 6]) → true
firstLast6([6, 1, 2, 3]) → true
firstLast6([13, 6, 1, 2, 3]) → false*/

public class FirstLast6 {

    public static void main(String[] args) {

        int[] input = {1, 1, 6};

        System.out.println(firstLast6(input));
    }

    public static boolean firstLast6(int[] nums) {

        //Solution 1:
        return nums[0] == 6 ||  nums [nums.length-1] == 6;

        //Solution2:
//        if (nums[0] == 6 ){
//            return true;
//        } else if (nums [nums.length-1] == 6) {
//            return true;
//        }
//
//        return false;

    }
}
