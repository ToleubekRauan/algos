package kazakh_wedding;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int city;
        int guests;
        city = input.nextInt();
        guests = input.nextInt();

        System.out.println(city + "," + guests);
        ArrayList<Integer> capacity = new ArrayList<>();
        while (input.hasNextLine()) {
            capacity.add(input.nextInt());
            System.out.println("capacity add " + capacity);
            System.out.println("input has next " + input.hasNext());
        }
        System.out.println("capacity " + capacity);
    }
}
