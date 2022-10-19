package angle_between_hands_of_a_clock;

public class Main {

    public static void main(String[] args) {
        System.out.println(angleClock(4, 50));
    }

    public static double angleClock(int hour, int minutes) {
        // 360 / (60 / 30) = 180
        // 360 / (12 / 3) = 90
        // 360 / 12 * 30/60


        double m = 360 * (minutes / 60.0);
        int h = (360 / 12) * hour;
        double mh = (360 / 12.0) * (minutes / 60.0);
        double hTotal = h + mh;
        double res = Math.abs(m - hTotal);

        if (res == 180) {
            return 180;
        } else if (res < 180) {
            return res;
        }else {
            return 360 - res;
        }
    }
}
