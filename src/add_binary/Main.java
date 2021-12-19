package add_binary;

public class Main {

    public static void main(String[] args) {
        System.out.println(addBinary("1010", "1011"));
    }

    static String addBinary(String a, String b) {
        int a1 = Integer.parseInt(a, 2);
        int a2 = Integer.parseInt(b, 2);
        int sum = a1 + a2;

        StringBuilder sb = new StringBuilder();

        while (sum > 0) {
            sb.append(sum % 2);
            sum /= 2;
        }

        return sb.reverse().toString().isEmpty() ? "0" : sb.reverse().toString();
    }
}
