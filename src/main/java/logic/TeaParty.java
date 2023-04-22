package logic;

/*We are having a party with amounts of tea and candy.
Return the int outcome of the party encoded as 0=bad, 1=good, or 2=great.
A party is good (1) if both tea and candy are at least 5.
However, if either tea or candy is at least double the amount of the other one, the party is great (2).
However, in all cases, if either tea or candy is less than 5, the party is always bad (0).
teaParty(6, 8) → 1
teaParty(3, 8) → 0
teaParty(20, 6) → 2*/
public class TeaParty {

    public static void main(String[] args) {

        System.out.println(teaParty(20, 6));
    }
    public static int teaParty(int tea, int candy) {

        boolean good1 = tea >= 5 && candy >= 5;
        boolean bad0 = tea < 5 || candy < 5;

        boolean moreTea = tea >= candy*2;
        boolean moreCandy = candy >= tea*2;
        boolean great2 = (tea >= 5 && candy >= 5) && (moreTea || moreCandy);

        int outcome = 0;

        if (great2){
            outcome = 2;
        } else if (good1) {
            outcome = 1;
        } else if (bad0) {
            outcome = 0;
        }

        return outcome;
    }
}
