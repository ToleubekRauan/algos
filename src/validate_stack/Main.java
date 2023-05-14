package validate_stack;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] push = {1,2};
        int[] pop = {1, 2};
        /*
        1

        1
         */
        System.out.println(validateStackSequences(push, pop));
    }

    public static boolean validateStackSequences(int[] pushedArray, int[] poppedArray) {
        ArrayList<Integer> pushed = new ArrayList<>();
        for (int num : pushedArray) pushed.add(num);
        ArrayList<Integer> popped = new ArrayList<>();
        for (int num : poppedArray) popped.add(num);

        int pushIndex = 0;
        int popIndex = 0;

       while (pushIndex < pushed.size() && popIndex < popped.size()) {

           if (!pushed.get(pushIndex).equals(popped.get(popIndex))) {
               pushIndex++;
           }else {
               pushed.remove(pushIndex--);
               popIndex++;
               pushIndex = Math.max(0, pushIndex);
           }

       }
       return popIndex == popped.size();

    }
}
