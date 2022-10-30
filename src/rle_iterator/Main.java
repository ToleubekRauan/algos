package rle_iterator;

public class Main {


    public static void main(String[] args) {
        int[] arr = {811,903,310,730,899,684,472,100,434,611};
        RLEIterator rleIterator = new RLEIterator(arr);
        System.out.println(rleIterator.next(358));
        System.out.println(rleIterator.next(345));
        System.out.println(rleIterator.next(154));
        System.out.println(rleIterator.next(265));
        System.out.println(rleIterator.next(73));
        System.out.println(rleIterator.next(220));
        System.out.println(rleIterator.next(138));
        System.out.println(rleIterator.next(4));
        System.out.println(rleIterator.next(170));
        System.out.println(rleIterator.next(88));



    }

    static class RLEIterator {

        private final int[] encoding;
        int pos = 0;

        public RLEIterator(int[] encoding) {
            //3, 8, 0, 9, 2, 5
            //3 0 2
            this.encoding = encoding;

        }

        public int next(int n) {

            while (pos < encoding.length && encoding[pos] < n) {
                n -= encoding[pos];
                pos += 2;
            }

            if (pos >= encoding.length) {
                return -1;
            }

            encoding[pos] -= n;

            return encoding[pos + 1];


        }
    }
}
