package com.noor.learn.leetcode;

import java.util.Arrays;

/**
 * @author noor.shaik
 * @since 05-11-2026
 */
public class MaxTotalSubArrayValue {

    public static void main(String[] args) {

        int[] arr = {1,3,2};
        int k = 2;

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        long value = (long) (max - (long) min) * k;

        System.out.println("Output::"+value);
    }
}
