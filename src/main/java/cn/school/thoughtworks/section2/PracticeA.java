package cn.school.thoughtworks.section2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> count =new HashMap<>();
        for(String item:collection1){
            if(count.containsKey(item)){
                count.put(item,count.get(item)+1);
            }
            else{
                count.put(item,1);
            }
        }
        return count;



    }

}
