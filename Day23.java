/* Count Inversions
Difficulty: Medium
Given an array of integers arr[]. Find the Inversion Count in the array.
Two elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.

Inversion Count: For an array, inversion count indicates how far (or close) the array is from being sorted. If the array is already sorted then the inversion count is 0.
If an array is sorted in the reverse order then the inversion count is the maximum. 

Time complexity : O(n*log n)
Space complexity : O(n)
*/
class Solution {
    // Function to count inversions in the array.
    static int inversionCount(int arr[]) {
        // Your Code Here
        return mergeSort(arr,0,arr.length-1);
    }
    
    static int mergeSort(int[] arr,int l,int r){
        int count = 0;
        if(l<r){
            int m = (l+r)/2;
            count+=mergeSort(arr,l,m);
            count+=mergeSort(arr,m+1,r);
            count+=merge(arr,l,m,r);
        }
        return count;
    }
    
    static int merge(int[] arr,int l,int m,int r){
        int count = 0;
        int n1 = m - l + 1;
        int n2 = r - m;
        int[] L = new int[n1];
        int[] M = new int[n2];
        
        for(int i=0;i<n1;i++){
            L[i] = arr[l+i];
        }
        for(int j=0;j<n2;j++){
            M[j] = arr[m+1+j];
        }
        
        int i,j,k;
        i=0;
        j=0;
        k = l;
        
        while(i<n1 && j<n2){
            if(L[i]<=M[j]){
                arr[k] = L[i];
                i++;
            }else{
                arr[k] = M[j];
                j++;
                count+=(n1-i);
            }
            k++;
        }
        
        while(i<n1){
            arr[k] = L[i];
            i++;
            k++;
        }
        
        while(j<n2){
            arr[k] = M[j];
            j++;
            k++;
        }
        return count;
    }
    
}
