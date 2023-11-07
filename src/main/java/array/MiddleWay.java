package array;

/*Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]*/

public class MiddleWay {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 7, 6};

        for (int i = 0; i < middleWay(arr1, arr2).length; i++) {
            System.out.print(middleWay(arr1, arr2)[i]);
        }
    }

    public static int[] middleWay(int[] a, int[] b) {
        int[] output = new int[2];
        output[0] = a[1];
        output[1] = b[1];

        return output;
    }
}
