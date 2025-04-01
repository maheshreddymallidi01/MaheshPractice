package com.practise.Strivers;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK2 {

	public static void main(String[] args) {
		int[] a = {-1,0,1,1,-1,-1,0};
		int k = 0;
		System.out.println(getLongestSubarray(a, k));
	}
	
	private static int getLongestSubarray(int []a, int k) {
        int n = a.length; // size of the array.

        Map<Integer, Integer> preSumMap = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < n; i++) {
            //calculate the prefix sum till index i:
            sum += a[i];

            // if the sum = k, update the maxLen:
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // calculate the sum of remaining part i.e. x-k:
            int rem = sum - k;

            //Calculate the length and update maxLen:
            if (preSumMap.containsKey(rem)) {
                int len = i - preSumMap.get(rem);
                maxLen = Math.max(maxLen, len);
            }

            //Finally, update the map checking the conditions:
            if (!preSumMap.containsKey(sum)) {
                preSumMap.put(sum, i);
            }
        }

        return maxLen;
    }
}
