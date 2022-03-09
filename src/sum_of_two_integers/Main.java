package sum_of_two_integers;

public class Main {

    public static void main(String[] args) {

    }

    public int getSum(int a, int b) {
        /*
        0001
        0010
        */
        Integer.toString(a, 2);
        new StringBuilder( Integer.toString(a, 2)).reverse();
        char[] firstIntArr = Integer.toString(a, 2).toCharArray();
        char[] secondIntArr = Integer.toString(b, 2).toCharArray();
        boolean carry = false;

        int idxA = firstIntArr.length - 1, idxB = secondIntArr.length - 1;

        while (idxA >= 0 || idxB >= 0) {


            idxA--;
            idxB--;
        }


        return 0;


    }
}
