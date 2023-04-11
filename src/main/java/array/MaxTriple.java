package array;

/*Given an array of ints of odd length,
look at the first, last, and middle values in the array and return the largest.
The array length will be a least 1.
maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5]*/
public class MaxTriple {

    public static void main(String[] args) {

        int[] output = {1, 2, 3};

        System.out.println(maxTriple(output));

    }

    public static int maxTriple(int[] nums) {

        if (nums.length == 1){
            return nums[0];
        }

        if (nums.length == 2 && nums[0] > nums[1]) {
            return nums[0];
        } else if (nums.length == 2 && nums[0] < nums[1]) {
            return nums[1];
        }

        int biggerNum = 0;
        int firstNum = nums[0];
        int lastNum = nums[nums.length-1];
        int middleNum = nums[nums.length/2];

       if (nums.length > 2 && firstNum > middleNum && firstNum > lastNum){
           biggerNum = firstNum;
       } else if (nums.length > 2 && middleNum > firstNum && middleNum > lastNum) {
           biggerNum = middleNum;
       } else if (nums.length > 2 && lastNum > firstNum && lastNum > middleNum) {
           biggerNum = lastNum;
       }

        return biggerNum;

    }
}
