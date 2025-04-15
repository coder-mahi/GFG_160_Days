/*
https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/smallest-positive-missing-number-1587115621
Smallest Positive Missing

Asked In :> Accolite,Amazon,Samsung,Snapdeal

Time COmplexity :> O(n)
*/
class Day13 {
    // Function to find the smallest positive number missing from the array.
    public int missingNumber(int[] arr) {
        // Your code here
        int size = arr.length;
        int i = 0;
        while( i< size){
            if(arr[i]>0 && arr[i]<= size && arr[i] != arr[arr[i]-1]){
                int temp = arr[arr[i]-1];
                arr[arr[i]-1] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }
        
        for(int j=0;j<size;j++){
            if(arr[j]!=j+1){
                return j+1;
            }
        }
        return size+1;
    }
}
