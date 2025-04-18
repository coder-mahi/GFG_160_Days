/* https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/implement-atoi
Implement Atoi

Given a string s, the objective is to convert it into integer format without utilizing any built-in functions. Refer the below steps to know about atoi() function.
*/
// Time COmplexity : O(n)
// Space COmplecity : O(1)
class Day14 {
    public int myAtoi(String s) {
        // Your code here
        if(s == null || s.length()==0) return 0;
        int i=0,sign=1,result=0;
        int n = s.length();
        
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        if(i<n && (s.charAt(i)=='+' || s.charAt(i)=='-')){
            sign = s.charAt(i)=='-' ? -1 : 1;
            i++;
        }
        
        while(i<n && Character.isDigit(s.charAt(i))){
            int digit = s.charAt(i)-'0';
            if(result>(Integer.MAX_VALUE-digit)/10){
                return sign == 1? Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }
        return result*sign;
    }
}
