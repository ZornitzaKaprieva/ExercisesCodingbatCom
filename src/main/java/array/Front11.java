package array;

/*Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
If either array is length 0, ignore that array.
front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]*/

public class Front11 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5};

        for (int i = 0; i < front11(arr1, arr2).length; i++) {
            System.out.print(front11(arr1, arr2)[i]);
        }
    }

    public static int[] front11(int[] a, int[] b) {

        if (a.length > 0 && b.length > 0) {
            int[] output = new int[2];
            output[0] = a[0];
            output[1] = b[0];
            return output;
        }

        if (a.length > 0 && b.length == 0){
            int[] output = new int[1];
            output[0] = a[0];
            return output;
        }

        if (a.length == 0 && b.length > 0){
            int[] output = new int[1];
            output[0] = b[0];
            return output;
        }

        int[] output = new int[0];
        return output;
    }
}
