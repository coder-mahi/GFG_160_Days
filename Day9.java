/*
https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/minimize-the-heights3351
Minimize the Heights II

Time complexity - O(n^2) --due to sorting
Space COmplexity - O(1)
*/
class Solution {
    int getMinDiff(int[] arr, int k) {
        // code here
       int n = arr.length;
       Arrays.sort(arr);
       int minH=0;
       int maxH = 0;
       int res = arr[n-1] - arr[0];
       for(int i=1;i<n;i++){
           if(arr[i]-k < 0){
               continue;
           }
           minH = Math.min(arr[0]+k,arr[i]-k);
           maxH = Math.max(arr[i-1]+k,arr[n-1]-k);
           res = Math.min(res,maxH-minH);
       }
       return res;
    }
}
