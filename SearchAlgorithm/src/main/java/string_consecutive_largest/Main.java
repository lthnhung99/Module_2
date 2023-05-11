package string_consecutive_largest;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        String string = "abcdabhmcld";

        LinkedList<Character> max = new LinkedList<>();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            list.add(string.charAt(i));
            for (int j = i + 1; j < string.length(); j++) {
                if (((int) string.charAt(j) > (int) string.charAt(j - 1)))
                    list.add(string.charAt(j));
                else break;
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character character : max) {
            System.out.print(character);
        }
        System.out.println();
    }
}
