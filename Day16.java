/* https://www.geeksforgeeks.org/batch/gfg-160-problems/track/string-gfg-160/problem/anagram-1587115620
Anagram : Given two strings s1 and s2 consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, "act" and "tac" are an anagram of each other. Strings s1 and s2 can only contain lowercase alphabets.

Note: You can assume both the strings s1 & s2 are non-empty.
Examples :
Input: s1 = "geeks", s2 = "kseeg"
Output: true
Explanation: Both the string have same characters with same frequency. So, they are anagrams.

Input: s1 = "allergy", s2 = "allergic"
Output: false
Explanation: Characters in both the strings are not same, so they are not anagrams.

Input: s1 = "g", s2 = "g"
Output: true
Explanation: Character in both the strings are same, so they are anagrams.
*/

class Day16 {
    // Function is to check whether two strings are anagram of each other or not.
    public static boolean areAnagrams(String s1, String s2) {

        // Your code here
        if(s1.length() != s2.length()){
            return false;
        }
        int n = s1.length();
        boolean ch = true;
        
        char temp1[] = s1.toCharArray();
        char temp2[] = s2.toCharArray();
        
        Arrays.sort(temp1);
        Arrays.sort(temp2);
        
        for(int i=0;i<n;i++){
            if(temp1[i]!=temp2[i]){
                ch = false;
                break;
            }
        }
    return ch;
    }
}
