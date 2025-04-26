/* Inversion Count 
-- Efficient way solve using MERGE SORT
Time complexity - Best : O(n*log n)
                  worst : O(n*log n)
                  average : O(n*log n)
Space complexity - O(n)
*/

class Day22 {
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
    
    static int merge(int[] arr,int p,int q,int r){
        int count = 0;
        int n1 = q - p + 1;
        int n2 = r - q;
        int[] L = new int[n1];
        int[] M = new int[n2];
        
        for(int i=0;i<n1;i++){
            L[i] = arr[p+i];
        }
        for(int j=0;j<n2;j++){
            M[j] = arr[q+1+j];
        }
        
        int i,j,k;
        i=0;
        j=0;
        k = p;
        
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
