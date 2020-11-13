package easy.leetcode;
import java.util.*;


public class App {

    public static void mostCommonWord(String paragraph, String[] banned) {

        String[] str = paragraph.replaceAll("[^a-zA-Z ]", " ").toLowerCase().split(" ");
        // String[] str = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase().split("\\s+");
        String bannedStr = String.join(" ", banned);
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<str.length; i++) {
            // System.out.println(str[i]);
            if(!bannedStr.contains(str[i])) {
                int j = map.containsKey(str[i]) ? map.get(str[i]) : 0;
                map.put(str[i], j + 1);
            }
        }

        Map.Entry<String, Integer> maxEntry = null;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue()
                    .compareTo(maxEntry.getValue()) > 0) {

                maxEntry = entry;
            }
        }
        System.out.println(maxEntry.getKey());
    }

    public static void main(String[] args) {
        String paragraph = "a, a, a, a, b,b,b,c, c";
        String[] banned = {"a"};

        //System.out.println(mostCommonWord(paragraph,banned));
        mostCommonWord(paragraph,banned);
    }
}