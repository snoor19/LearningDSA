package com.noor.learn.extra;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author noor.shaik
 * @since 02-11-2026
 */
public class NonRepeatingChar {

    public static void main(String[] args) {
        String input = "swiss";
        Map<Character, Integer> linkedHashMap = new LinkedHashMap<>();
        for (int i=0; i<input.length();i++){
            char charAt = input.charAt(i);
            if(linkedHashMap.containsKey(charAt)){
                linkedHashMap.put(input.charAt(i),linkedHashMap.get(charAt)+1);
            } else {
                linkedHashMap.put(charAt,1);
            }
        }

        for (Map.Entry<Character, Integer> entrySet: linkedHashMap.entrySet()) {
            if(entrySet.getValue().intValue() == 1){
                System.out.println(entrySet.getKey());
                break;
            }
        }
    }
}
