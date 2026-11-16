package com.noor.learn.daytwo;

import java.sql.Array;

/**
 * @author noor.shaik
 * @since 20-08-2026
 */
public class PrefixSum {

    public static void main(String[] args) {
        int[] nums = {100, 200, 50, 300, 150, 400, 250};
        int[] prefix = new int[nums.length+1];

        for (int i=0;i<nums.length;i++) {
            prefix[i+1] = nums[i]+prefix[i];
        }
        System.out.println("Query-1 -> " + (prefix[4+1]- prefix[1]));
        System.out.println("Query-2 -> " + (prefix[6+1] - prefix[3]));
    }
}
