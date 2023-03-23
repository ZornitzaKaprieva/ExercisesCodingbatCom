package warmup;

/*Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
Otherwise, return the string unchanged.
delDel("adelbc") → "abc"
delDel("adelHello") → "aHello"
delDel("adedbc") → "adedbc"*/
public class DelDel {

    public static void main(String[] args) {

        System.out.println(delDel("adele"));
    }

    public static String delDel(String str) {
        String output = "";
        boolean validString = str.length() >=4;

        if (validString && str.substring(1, 4).equals("del")) {
            output = str.substring(0, 1) + str.substring(4);
            return output;
        } else {
            return str;
        }


    }
}

