package generate_salt;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;

public class Main {

    public static void main(String[] args) {

        System.out.println(Base64.getEncoder().encodeToString(generate()));
    }

    static byte[] generate() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] salt = new byte[32];
        secureRandom.nextBytes(salt);
        return salt;
    }
}
