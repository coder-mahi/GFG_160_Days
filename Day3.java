// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/reverse-an-array
// Time complexity - O(N)
// Space complexity - O(1)
class Day3 {
    public void reverseArray(int arr[]) {
        int left = 0;
        int right = arr.length-1;
        for(int i=0;i<arr.length/2;i++){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
