/* https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/add-binary-strings3805
Add Binary Strings
Difficulty: MediumAccuracy: 23.25%Submissions: 102K+Points: 4
Given two binary strings s1 and s2 consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.
Note: The input strings may contain leading zeros but the output string should not have any leading zeros.
*/
// both time and space complexity are O(max(n, m))

class Day15 {
    public String addBinary(String s1, String s2) {
        // code here
        int i=s1.length() -1, j=s2.length()-1, carry = 0;
        StringBuilder result = new StringBuilder();
        
        while(i>=0 || j>=0 || carry==1){
            int bit1 = (i>=0) ? s1.charAt(i--) - '0' : 0;
            int bit2 = (j>=0) ? s2.charAt(j--) - '0' : 0;
            
            int sum = bit1 + bit2 + carry;
            result.append(sum%2);
            carry = sum/2;
        }
        
        while(result.length() > 1 && result.charAt(result.length()-1)=='0'){
            result.setLength(result.length()-1);
        }
        return result.reverse().toString();
    }
}
