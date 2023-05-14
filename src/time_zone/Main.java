package time_zone;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int timeZone;
        Scanner scanner = new Scanner(System.in);
        timeZone = Integer.parseInt(scanner.nextLine());
        int h = 11;
        int currentTimeZone = 6;
        int deltaTimeZone = timeZone - currentTimeZone;
        int hour = h + deltaTimeZone;
        if (hour < 0) {
            hour += 24;
        }
        String hourStr;
        if (Math.abs(hour) < 10) {
            hourStr = "0" + hour;
        }else {
            hourStr = String.valueOf(hour);
        }
        System.out.println(hourStr + ":00");
    }
}
