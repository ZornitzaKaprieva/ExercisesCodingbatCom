package array;

/*Start with 2 int arrays, a and b, of any length.
Return how many of the arrays have 1 as their first element.
start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1*/

public class Start1 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {15, 1, 9};

        System.out.println(start1(arr1, arr2));
    }

    public static int start1(int[] a, int[] b) {
        int output = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 1) {
                output++;
            }
        }
        for (int j = 0; j < b.length; j++) {
             if (b[j] == 1) {
                 output++;
             }
        }
        return output;
    }
}
