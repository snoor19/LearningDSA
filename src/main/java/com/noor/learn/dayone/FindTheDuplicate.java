package com.noor.learn.dayone;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Find the Duplicate
 *
 * Given:
 * nums = [1, 3, 4, 2, 2]
 *
 * There is exactly one duplicate number.
 *
 * Expected:
 * 2
 * @author noor.shaik
 * @since 17-08-2026
 */
public class FindTheDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 2, 2};
        HashSet<Integer> duplicate = new HashSet<>();

        for (int i=0; i<nums.length; i++){
            if(duplicate.contains(nums[i])){
                System.out.println(nums[i]);
                break;
            } else {
                duplicate.add(nums[i]);
            }
        }
    }
}
