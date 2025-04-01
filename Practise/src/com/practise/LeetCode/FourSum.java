package com.practise.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

	public static void main(String[] args) {
		int[] nums = {2,2,2,2,2};
		int target = 8;
		System.out.println(fourSum(nums, target));
	}

	private static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> r = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i=0;i<n;i++) {
        	if(i!=0 && nums[i]==nums[i-1]) continue;
        	for(int j=i+1;j<n;j++) {
        		if(j!=i+1 && nums[j]==nums[j-1]) continue;
        		int k = j+1;
        		int l = n-1;
        		while(k<l) {
        			long sum = nums[i];
        			sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];
            		if(sum<target) {
            			k++;
            		}else if(sum>target) {
            			l--;
            		}else {
            			List<Integer> s = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
            			r.add(s);
            			k++;
            			l--;
            			while(k<l && nums[k]==nums[k-1]) {
            				k++;
            			}
            			while(k<l && nums[l]==nums[l+1]) {
            				l--;
            			}
            		}
        		}
        	}
        }
        return r;
    }
}
