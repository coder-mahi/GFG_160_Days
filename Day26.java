/*
https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/non-overlapping-intervals
Time Complexity :> O(n* log n)
*/
class Solution {
    static int minRemoval(int intervals[][]) {
        // code here
        if(intervals.length==0) return 0;
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[1],b[1]));
        
        int count = 0;
        int end = intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<end){
                count++;
            }   else{
                end = intervals[i][1];
            }
        }
        return count;
    }
}
