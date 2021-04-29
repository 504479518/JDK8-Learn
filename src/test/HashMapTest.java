package test;

import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("hashMap1", 1);
        hashMap.put("hashMap2", 2);
        hashMap.put("hashMap3", 3);
        hashMap.put("hashMap4", 4);
        System.out.println(hashMap);
    }
}
