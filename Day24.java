/* Overlapping Intervals
Difficulty: Medium
Given an array of Intervals arr[][], where arr[i] = [starti, endi]. The task is to merge all of the overlapping Intervals.

Examples:
Input: arr[][] = [[1,3],[2,4],[6,8],[9,10]]
Output: [[1,4], [6,8], [9,10]]
Explanation: In the given intervals we have only two overlapping intervals here, [1,3] and [2,4] which on merging will become [1,4]. Therefore we will return [[1,4], [6,8], [9,10]].
*/
class Solution {
    public List<int[]> mergeOverlap(int[][] intervals) {
        // Code here
        List<int[]> merged = new ArrayList<>();
        
        if(intervals.length==0){
            return merged;
        }
        
        Arrays.sort(intervals, (a,b) -> Integer.compare(a[0],b[0]));
        
        int[] current = intervals[0];
        merged.add(current);
        
        for(int[] interval : intervals){
            int currentStart = current[0];
            int currentEnd = current[1];
            int nextStart = interval[0];
            int nextEnd = interval[1];
            
            if(nextStart <= currentEnd){
                current[1] = Math.max(currentEnd, nextEnd);
            }else{
                current = interval;
                merged.add(current);
            }
        }
        return merged;
    }
}
