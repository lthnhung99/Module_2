package bt_sd_Map;

import java.util.Map;

public class TreeMap {
    public static void main(String[] args) {
        String str = "CodeGym. Raising the bar";
        String str1 = str.toLowerCase();
        Map<Character, Integer> treeMap = new java.util.TreeMap<>();

        for (Character character : str1.toCharArray()) {
            if (!treeMap.containsKey(character)) {
                treeMap.put(character, 1);
            } else {
                int count = treeMap.get(character);
                treeMap.replace(character, ++count);
            }
        }
        System.out.println(treeMap.entrySet());
    }
}
