/*
https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/max-circular-subarray-sum-1587115620
Max Circular Subarray Sum

Time Complexity : O(N)
Space Complexity : O(1)
*/

class Day12 {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {

        // Your code here
        int totalsum = 0;
        int currmaxsum = 0;
        int currminsum = 0;
        int maxsum = arr[0];
        int minsum = arr[0];
        
        for(int i=0;i<arr.length;i++){
            currmaxsum = Math.max(currmaxsum + arr[i],arr[i]);
            maxsum = Math.max(maxsum,currmaxsum);
            
            currminsum = Math.min(currminsum + arr[i],arr[i]);
            minsum = Math.min(minsum, currminsum);
            
            totalsum +=arr[i];
        }
        int normalsum = maxsum;
        int circularsum = totalsum - minsum;
        
        if(minsum == totalsum){
            return normalsum;
        }
        return Math.max(normalsum,circularsum);

        
    }
}
