package com.noor.learn.extra;

import java.util.*;

/**
 * @author noor.shaik
 * @since 03-11-2026
 */
public class MergeIntervals {

    public static void main(String[] args) {
        int[][] intervals = {{1,3}, {2,6}, {8,10}, {15,18}};

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> result = new ArrayList<>();
        int[] current = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            int[] next = intervals[i];

            if (next[0] <= current[1]) {
                // Overlapping: extend the current interval
                current[1] = Math.max(current[1], next[1]);
            } else {
                // No overlap: save current and move forward
                result.add(current);
                current = next;
            }
        }

        result.add(current);

        System.out.println("Result::"+result.toArray(new int[result.size()][]));
    }
}
