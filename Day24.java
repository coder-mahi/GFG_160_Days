/* Overlapping Intervals
Difficulty: Medium
Given an array of Intervals arr[][], where arr[i] = [starti, endi]. The task is to merge all of the overlapping Intervals.

Examples:
Input: arr[][] = [[1,3],[2,4],[6,8],[9,10]]
Output: [[1,4], [6,8], [9,10]]
Explanation: In the given intervals we have only two overlapping intervals here, [1,3] and [2,4] which on merging will become [1,4]. Therefore we will return [[1,4], [6,8], [9,10]].
*/
class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        // Code here
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0],b[0]));
        List<int[]> res = new ArrayList<>();
        res.add(arr[0]);
        
        for(int i=1;i<arr.length;i++){
            int[] last = res.get(res.size()-1);
            int[] curr = arr[i];
            
            if(curr[0]<=last[1]){
                last[1] = Math.max(last[1],curr[1]);
                
            }else{
                res.add(curr);
            }
        }
       return res;
    }
}
