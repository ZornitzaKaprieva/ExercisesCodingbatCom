package array;

import java.util.Arrays;

/*Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array.
Return the array which has the largest sum. In event of a tie, return a.
biggerTwo([1, 2], [3, 4]) → [3, 4]
biggerTwo([3, 4], [1, 2]) → [3, 4]
biggerTwo([1, 1], [1, 2]) → [1, 2] */

public class BiggerTwo {
    public static void main(String[] args) {

        int[] arr = {1,2};
        int[] arr2 = {3,4};

        System.out.println(Arrays.toString(biggerTwo(arr,arr2)));
    }

    public static int[] biggerTwo(int[] a, int[] b) {
        int[] output = new int[2];
        int arr = a[0] + a[1];
        int arr2 = b[0] + b[1];

        if (arr >= arr2){
            output = a;
        } else{
            output = b;
        }

        return output;
    }
}
