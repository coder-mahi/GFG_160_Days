/*
https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/check-if-strings-are-rotations-of-each-other-or-not-1587115620

Strings Rotations of Each Other
Difficulty: EasyAccuracy: 43.83%Submissions: 266K+Points: 2Average Time: 15m
You are given two strings of equal lengths, s1 and s2. The task is to check if s2 is a rotated version of the string s1.
Note: The characters in the strings are in lowercase.

Examples :
Input: s1 = "abcd", s2 = "cdab"
Output: true
Explanation: After 2 right rotations, s1 will become equal to s2.
*/

class Day20 {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        if(s1.length()!=s2.length()){
            return false;
        }
        String str = s1+s1;
        return kmpsearch(str,s2);
    }
    private static boolean kmpsearch(String text,String pattern){
        int[] lps = computeLPSArray(pattern);
        int i = 0;
        int j = 0;
        while(i<text.length()){
            if(text.charAt(i)==pattern.charAt(j)){
                i++;
                j++;
                if(j==pattern.length()){
                    return true;
                }
            }else{
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }
       return false;
    }
    
    private static int[] computeLPSArray(String pattern){
        int[] lps = new int[pattern.length()];
        int len = 0;
        int i = 1;
        
        while(i<pattern.length()){
            if(pattern.charAt(i)==pattern.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len = lps[len-1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }

}
