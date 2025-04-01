// https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/second-largest3735
// Time Complexity - O(N)
// Space Complexity - O(1)
class Day1 {
    public int getSecondLargest(int[] arr) {
        if(arr.length<2){
            return -1;
        }
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int num:arr){
            if(num>largest){
                secondLargest = largest;
                largest = num;
            }else if(num>secondLargest && num!=largest){
                secondLargest = num;
            }
        }
        return (secondLargest==Integer.MIN_VALUE)? -1: secondLargest;
    }
