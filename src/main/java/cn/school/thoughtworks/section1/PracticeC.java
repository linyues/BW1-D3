package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        //return new PracticeA().collectSameElements(collection1, collection2.get("value"));
        return collection1.stream().filter(item -> collection2.get("value").contains(item)).collect(Collectors.toList());
    }
}
