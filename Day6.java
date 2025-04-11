/*
https://www.geeksforgeeks.org/batch/gfg-160-problems/track/arrays-gfg-160/problem/majority-vote
Majority Element II

You are given an array of integer arr[] where each number represents a vote to a candidate. Return the candidates that have votes greater than one-third of the total votes, If there's not a majority vote, return an empty array. 

Note: The answer should be returned in an increasing format.
*/
// Time COmplexity : O(N)
// Space Complexity : O(1)

class Day6 {
    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        List<Integer> res = new ArrayList<>();
        if(nums.length==0) {
            return res;
        }
        
        int candidate1=0,candidate2 = 1,count1=0,count2=0;
        
        for(int num:nums){
            if(num==candidate1){
                count1++;
            }else if(num==candidate2){
                count2++;
            }else if(count1==0){
                candidate1 = num;
                count1 = 1;
            }else if(count2==0){
                candidate2 = num;
                count2 = 1;
            }else{
                count1--;
                count2--;
            }
        }
        
        count1=0;
        count2=0;
        for(int num:nums){
            if(candidate1==num){
                count1++;
            }else if(candidate2==num){
                count2++;
            }
        }
    
        
        if(count1>nums.length/3 && count2>nums.length/3) {
            if(candidate1<candidate2){
                res.add(candidate1);
                res.add(candidate2);
            }else{
                res.add(candidate2);
                res.add(candidate1);
            }
            
        }else if(count1>nums.length/3){
            res.add(candidate1);
        }else if(count2>nums.length/3){
            res.add(candidate2);
        }
           
        return res;
    }
}
