package com.bell.b11.day1;

import java.util.HashMap;
import java.util.Set;

public class StringCount {

        public static void main(String args[]) {

            String value = "This is a java Program";

            String item[] = value.split(" ");

            HashMap<String, Integer> map = new HashMap<>();

            for (String t : item) {
                if (map.containsKey(t)) {
                    map.put(t, map.get(t) + 1);

                } else {
                    map.put(t, 1);
                }
            }
            Set<String> keys = map.keySet();
            for (String key : keys) {
                System.out.println(key);
                System.out.println(map.get(key));
            }

        }
    }

