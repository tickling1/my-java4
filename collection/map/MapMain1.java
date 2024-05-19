package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {

    public static void main(String[] args) {
        Map<String, Integer> studentMap = new HashMap<>();
        
        // 학생 성적 데이터 추가
        studentMap.put("studentA", 90);
        studentMap.put("studentB", 80);
        studentMap.put("studentC", 80);
        studentMap.put("studentD", 100);
        System.out.println(studentMap);

        // 특정 학생의 값 조회
        Integer result = studentMap.get("studentD");
        System.out.println("result = " + result);

        System.out.println("keySet 활용");
        Set<String> keySet = studentMap.keySet(); // 키는 중복되면 안됨, 순서보장 X
        for (String key : keySet) {
            Integer value = studentMap.get(key);
            System.out.println("key = " + key + ", value = " + value);
        }

        System.out.println("values 활용");
        // 중복이 될 수도 있으므로 순서는 보장X, 중복 허용 => 컬렉션
        Collection<Integer> values = studentMap.values();
        for (Integer value : values) {
            System.out.println("value = " + value);
        }

        System.out.println("entrySet 활용");
        Set<Map.Entry<String, Integer>> entrySet = studentMap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("key = " + key + ", value = " + value);
        }
    }
}
