package array;

/*Return an int array length 3
containing the first 3 digits of pi, {3, 1, 4}.*/
public class MakePi {

    public static void main(String[] args) {

        //Option 1 for print:
        for (int j = 0; j < makePi().length; j++) {
            System.out.print(makePi()[j]);
        }

        System.out.println();

        //Option 2 for print:
        for (int i : makePi()) {
            System.out.printf("%d,", i);
        }
    }

    public static int[] makePi() {
        int[] intPI = {3, 1, 4};
        return intPI;
    }
}

