/*
Min Chars to Add for Palindrome
Difficulty: Hard
Given a string s, the task is to find the minimum characters to be added at the front to make the string palindrome.
Note: A palindrome string is a sequence of characters that reads the same forward and backward.

Examples:
Input: s = "abc"
Output: 2
Explanation: Add 'b' and 'c' at front of above string to make it palindrome : "cbabc"
*/
class Day19 {
    public static int minChar(String s) {
        // Write your code here
        String rev = new StringBuilder(s).reverse().toString();
        String temp = s+"$"+rev;
        int[] lps = new int[temp.length()];
        constructLps(temp,lps);
        return s.length()-lps[temp.length()-1];
    }
    
    public static void constructLps(String str,int[] lps){
        int len = 0;
        lps[0] = 0;
        int i=1;
        while(i<str.length()){
            if(str.charAt(i)==str.charAt(len)){
                len++;
                lps[i] = len;
                i++;
            }else{
                if(len!=0){
                    len = lps[len-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
    }
}
