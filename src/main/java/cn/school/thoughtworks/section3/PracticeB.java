package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        List<String> value = object.get("value");

        for (String item : value) {
            if (collectionA.containsKey(item)) {
                collectionA.put(item, collectionA.get(item) - (collectionA.get(item) / 3));
            }
        }
        return collectionA;
    }
}
