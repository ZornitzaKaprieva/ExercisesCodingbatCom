package array;

/*Given 2 int arrays, each length 2, return a new array length 4
containing all their elements.
plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]*/
public class PlusTwo {

    public static void main(String[] args) {

       int[] a = {7, 2};
       int[] b = {3, 5};

        for (int i = 0; i < plusTwo(a,b).length; i++) {
            System.out.println(plusTwo(a, b)[i]);
        }
    }

    public static int[] plusTwo(int[] a, int[] b) {

         int[] addInt = new int[4];

         addInt[0] = a[0];
         addInt[1] = a[1];
         addInt[2] = b[0];
         addInt[3] = b[1];

        return addInt;
    }
}
