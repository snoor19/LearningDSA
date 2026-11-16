package com.noor.learn.extra;

import java.util.HashMap;
import java.util.Map;

/**
 * @author noor.shaik
 * @since 02-11-2026
 */
public class LongestSubstring {

    public static void main(String[] args) {
        String S = "dvdf";
        Map<Character, Integer> map = new HashMap<>();

        int left = 0;
        int longest = 0;

        for (int right = 0; right < S.length(); right++) {
            char ch = S.charAt(right);

            if (map.containsKey(ch)) {
                left = Math.max(left, map.get(ch) + 1);
            }

            map.put(ch, right);

            longest = Math.max(longest, right - left + 1);
        }

        System.out.println(longest);
    }
}
