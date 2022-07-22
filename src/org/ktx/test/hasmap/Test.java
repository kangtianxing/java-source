package org.ktx.test.hasmap;

import java.util.HashMap;

/**
 * @ClassName Test
 * @Description HashMapTest
 * @Author ktx
 * @Date 2022-07-10 11:06
 * @Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        HashMap<String, Double> map = new HashMap<>();
        map.put("k1",0.1);
        System.out.println(map);
    }
}
