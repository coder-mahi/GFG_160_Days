/*
https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/kadanes-algorithm-1587115620
Kadane's Algorithm

Time COmplexity : O(n)
Space complexity : O(1)
*/

class Solution {
    int maxSubarraySum(int[] arr) {
        // Your code here
        int maxEnding = arr[0];
        int res = arr[0];
        for(int i=1;i<arr.length;i++){
            maxEnding = Math.max(maxEnding+arr[i],arr[i]);
            res = Math.max(res,maxEnding);
        }
        return res;
    }
}
