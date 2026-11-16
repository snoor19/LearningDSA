package com.noor.learn.dayone;

import java.util.HashMap;

/**
 * Given:
 * nums = [2, 7, 11, 15]
 * target = 9
 *
 * Return the indices of the two numbers whose sum equals the target.
 *
 * Expected:
 * [0, 1]
 */

/**
 * @author noor.shaik
 * @since 17-08-2026
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {10,13,2,16,18, 7, 11, 15};
        int target = 9;
        HashMap<Integer,Integer> val = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int rem = target-nums[i];
            if(val.containsKey(rem)){
                System.out.println("[" + val.get(rem) + "," + i + "]");
                break;
            } else {
                val.put(nums[i], i);
            }
        }
    }
}
