/* https://www.geeksforgeeks.org/batch/gfg-160-problems/track/sorting-gfg-160/problem/sort-an-array-of-0s-1s-and-2s4231
DNF Algorithm - https://www.geeksforgeeks.org/sort-an-array-of-0s-1s-and-2s/
*/
class Day21 {
    // Function to sort an array of 0s, 1s, and 2s
    public void sort012(int[] arr) {
        // code here
        int c1=0,c2=0,c3=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                c1++;
            }
            if(arr[i]==1){
                c2++;
            }
            if(arr[i]==2){
                c3++;
            }
        }
       
       int index  =0;
       for(int i=0;i<c1;i++){
           arr[index++] = 0;
       }
       for(int i=0;i<c2;i++){
           arr[index++] = 1;
       }
       for(int i=0;i<c3;i++){
           arr[index++] = 2;
       }
    }
}
