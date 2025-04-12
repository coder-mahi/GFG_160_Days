/*
https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/maximum-product-subarray3604
Maximum Product Subarray: Given an array arr[] that contains positive and negative integers (may contain 0 as well). Find the maximum product that we can get in a subarray of arr[].
Note: It is guaranteed that the output fits in a 32-bit integer.
*/
// Time complexity : O(n)
// SPace complexity : O(1)
class Day11 {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int n=arr.length;
        int maxProd = arr[0];
        int lefttoright = 1;
        int righttoleft = 1;
        int j = 0;
        for(int i=0;i<n;i++){
            if(lefttoright==0){
                lefttoright=1;
            }
            if(righttoleft==0){
                righttoleft=1;
            }
            
            lefttoright= lefttoright * arr[i];
            j = n-i-1;
            righttoleft = righttoleft * arr[j];
            maxProd = Math.max(Math.max(lefttoright,righttoleft),maxProd);
        }
        return maxProd;
    }
}
