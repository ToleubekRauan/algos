package validate_stack_sequences;

public class Main {


    public static void main(String[] args) {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
        validateStackSequences(pushed, popped);
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped){
        //pushed = [1,2,3,4,5], popped = [4,5,3,2,1]
        /*
        4 2
         */
        int push = 0;
        int pop = 0;

        while (push < pushed.length || pop < popped.length) {
            if (popped[pop] == pushed[push]) {
                push = push - 1 - pop;
                pop++;
            }else {
                push = push + 1 + pop;
            }
        }
        System.out.println("pop " + pop + ", push " + push);

        return false;




    }
}
