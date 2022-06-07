package exercises.mapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String args[]) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Phong", 25);
        map.put("Minh", 27);
        map.put("Sinh", 22);
        System.out.println(map);

        Set<String> keys = map.keySet();
        for (String key: keys){
            System.out.println(key + ": " + map.get(key));
        }
    }
}