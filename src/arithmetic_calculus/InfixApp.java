package arithmetic_calculus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfixApp {


    public static void main(String[] args) throws IOException {
        String in, out;
        while (true) {
            System.out.println("Enter infix string:");
            System.out.flush();
            in = getString();
            if (in.equals(" ")) {
                break;
            }
            InToPos inToPos = new InToPos(in);
            System.out.println(inToPos.doTransl());


        }
    }

    private static String getString() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        return bufferedReader.readLine();
    }
}
