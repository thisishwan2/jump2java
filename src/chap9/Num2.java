package chap9;

import java.util.HashMap;

public class Num2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 90);
        map.put("B", 80);
        /*if (map.containsKey("C")==false){
            map.put("C", 70);
        }
        System.out.println(map.get("C")); */
        System.out.println(map.getOrDefault("C", 70));

    }
}
