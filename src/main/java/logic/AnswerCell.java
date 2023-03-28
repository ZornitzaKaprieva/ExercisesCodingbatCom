package logic;

/*
Your cell phone rings. Return true if you should answer it.
Normally you answer, except in the morning you only answer if it is your mom calling.
In all cases, if you are asleep, you do not answer.
answerCell(false, false, false) → true
answerCell(false, false, true) → false
answerCell(true, false, false) → false*/
public class AnswerCell {

    public static void main(String[] args) {

        System.out.println(answerCell(false, false, false));
    }

    public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

        //solution 1:
        return !isAsleep && ((isMorning && isMom) || !isMorning);

        //solution 2:
//        boolean isAnswer = true;
//        if (isAsleep){
//            isAnswer = false;
//        } else {
//            if (!isAsleep && ((isMorning && isMom) || !isMorning)){
//                isAnswer = true;
//            } else {
//                isAnswer = false;
//            }
//        }
//        return isAnswer;
    }



}
