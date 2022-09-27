package watering_plants;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2,2,3,3};
        int cap = 5;
        System.out.println(wateringPlants(arr, cap));
    }

    public static int wateringPlants(int[] plants, int capacity) {
        int res = 0;
        int cap = capacity;

        for (int i = 0; i < plants.length; i++) {
            if (cap >= plants[i]) {
                cap -= plants[i];
                res++;
            }else {
                res += (i * 2 + 1);
                cap = capacity;
                cap -= plants[i];
            }
        }
        return res;
    }
}
