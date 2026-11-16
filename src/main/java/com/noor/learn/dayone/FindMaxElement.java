package com.noor.learn.dayone;

import java.util.HashMap;

/**
 *
 * Find Maximum Element
 *
 * Given:
 * nums = [5, 2, 9, 1, 7]
 *
 * Find the maximum value.
 *
 * Expected:
 * 9
 * @author noor.shaik
 * @since 17-08-2026
 */
public class FindMaxElement {
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 7};
        int max = nums[0];
        for(int i=1; i< nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
        }
        System.out.println(max);
    }
}
