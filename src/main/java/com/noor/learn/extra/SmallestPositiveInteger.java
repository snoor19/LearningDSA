package com.noor.learn.extra;

import java.util.HashSet;
import java.util.Set;

/**
 * @author noor.shaik
 * @since 02-11-2026
 */
public class SmallestPositiveInteger {

    public int solution(int[] A) {
        Set<Integer> seen = new HashSet<>();

        for (int num : A) {
            if (num > 0) {
                seen.add(num);
            }
        }

        for (int i = 1; i <= A.length + 1; i++) {
            if (!seen.contains(i)) {
                return i;
            }
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 6, 4, 1, 2};
        SmallestPositiveInteger positiveInteger = new SmallestPositiveInteger();
        System.out.println("Missing int::"+positiveInteger.solution(arr));
    }
}
