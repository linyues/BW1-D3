package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        List<String> value = object.get("value");

        for (String item : value) {
            if (collectionA.containsKey(item)) {
                collectionA.put(item, collectionA.get(item) - 1);
            }
        }
        return collectionA;

    }
}
