package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> count =new HashMap<>();

        for(String s:collection1){
            String[] group = s.split("-");
            String e = group[0];
            int plus = 1;
            if(group.length==2){
                plus = Integer.parseInt(group[1]);
            }
            if(count.containsKey(e)){
                count.put(e,count.get(e)+plus);
            }
            else{
                count.put(e,plus);
            }
        }
        return count;



    }
}
