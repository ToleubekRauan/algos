package map_char_array;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

    }

    public boolean generateDocument(String characters, String document) {
        Map<Character, Integer> map = new HashMap<>();
        for (char ch : characters.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0));
        }
        for (char ch : document.toCharArray()) {
            if ((int)map.getOrDefault(ch, 0) > 0) {
                map.put(ch, map.getOrDefault(ch, 0));
            }else {
                return false;
            }
        }
        return true;
    }
}
