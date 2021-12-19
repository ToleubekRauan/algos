package reverse_words;

public class Main {

    public static void main(String[] args) {
        String str = "AlgoExpert is the best!";
        System.out.println(reverseWordsInString(str));
    }

    public static String reverseWordsInString(String string) {
        char[] arr = string.toCharArray();
        reverse(arr, 0, arr.length);

        int idx = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ' ') {
                if (idx != -1) {
                    reverse(arr, idx, i);
                    idx = -1;
                }
            }else {
                if (idx == -1) {
                    idx = i;
                }
            }
        }
        if (idx != -1) {
            reverse(arr, idx, arr.length);
        }



        return String.valueOf(arr);
    }


    private static void reverse(char[] arr, int start, int end) {
        for (int i = 0; i < (end - start) / 2; i++) {
            char tmp = arr[start + i];
            arr[start + i] = arr[end - i - 1];
            arr[end - i - 1] = tmp;
        }

    }
}
