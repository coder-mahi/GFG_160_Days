// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/move-all-zeroes-to-end-of-array0751
// Time Complexity - O(N)
// Space Complexity - O(1)
class Day2 {
    void pushZerosToEnd(int[] arr){
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }

        }
    }
}
