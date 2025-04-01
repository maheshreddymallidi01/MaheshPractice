package com.practise.Strivers;

public class FindMinInRotatedSortedArray {

	public static void main(String[] args) {
		int[] arr = {4,5,0,1,2,3};
		System.out.println(findMin(arr));
	}
	public static int findMin(int []arr) {
        // Write your code here.
        int n = arr.length;
        int low = 0;
        int high = n-1;
        int ans = Integer.MAX_VALUE;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[low]<=arr[high]){
                ans = Math.min(ans, arr[low]);
                break;
            }
            else if(arr[low]<=arr[mid]){
                ans = Math.min(ans, arr[low]);
                low = mid+1;
            }else{
                ans = Math.min(ans, arr[mid]);
                high = mid-1;
            }
        }
        return ans;
    }
}
