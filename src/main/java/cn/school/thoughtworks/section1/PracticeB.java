package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.stream.Collectors;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
//        return collection1.stream().filter(e -> collection2.get(0).contains(e)).collect(Collectors.toList());
        return new PracticeA().collectSameElements(collection1, collection2.get(0));
    }
}
