package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {

        String text = "orange banana apple apple banana apple";

        // 코드 작성
        String[] words = text.split(" ");
        Map<String, Integer> map = new HashMap<>();

        for (String word : words) {
            Integer count = map.get(word);
            if (count == null) {
                count = 0;
            }
            count++;
            map.put(word, count);
        }
        System.out.println(map);
    }
}
