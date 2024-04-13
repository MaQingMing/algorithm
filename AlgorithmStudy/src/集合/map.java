package 集合;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @author mqm
 * @version 1.0
 * @date 2024/4/12 19:35
 */
public class map {


    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(3,"c");

        //循环map的两种方式
        Set<Integer> integers = map.keySet();
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(map.get(next));
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++");

        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            String value = entry.getValue();
            Integer key = entry.getKey();
            System.out.println(value+"+"+key);
        }
    }
}
