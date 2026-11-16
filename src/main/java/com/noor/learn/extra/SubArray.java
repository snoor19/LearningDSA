package com.noor.learn.extra;

/**
 * @author noor.shaik
 * @since 02-11-2026
 */
public class SubArray {

    public static int solution(int S, int[] A) {
        int left = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;
        int[] arr = new int[2];
        for (int right = 0; right < A.length; right++) {

            sum += A[right];

            while (sum >= S) {

                minLength = Math.min(
                        minLength,
                        right - left + 1
                );

                sum -= A[left];
                left++;
            }
        }

        return minLength == Integer.MAX_VALUE ? 0 : minLength;
    }

    public static void main(String[] args) {
        int[] A = {2,3,1,2,4,3};
        System.out.println("Size of Array::"+solution(7,A));
    }
}
