package group_anagrams;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("yo", "act", "flop", "tac", "foo", "cat", "oy", "olfp");
        System.out.println(groupAnagrams(words));
    }

    public static List<List<String>> groupAnagrams(List<String> words) {
        List<List<String>> list = new ArrayList<>();
        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            char[] copy = words.get(i).toCharArray();
            Arrays.sort(copy);
            List<Integer> idxList = map.getOrDefault(String.valueOf(copy), new ArrayList<Integer>());
            idxList.add(i);
            map.put(String.valueOf(copy), idxList);
        }

        for (Map.Entry<String, List<Integer>> mapEntry : map.entrySet()) {
            List<String> inner = new ArrayList<>();
            for (int i : mapEntry.getValue()) {
                inner.add(words.get(i));
            }
            list.add(inner);
        }


        return list;
    }

    private static List<List<String>> groupAnagrams2(List<String> words) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for (String word :  words) {
            char[] copy = word.toCharArray();
            Arrays.sort(copy);
            String sorted = new String(copy);

            if (anagrams.containsKey(sorted)) {
                anagrams.get(sorted).add(word);
            }else {
                anagrams.put(sorted, new ArrayList<String>(Arrays.asList(word)));
            }
        }
        return new ArrayList<>(anagrams.values());
    }


}
