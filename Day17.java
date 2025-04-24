/*
Non Repeating Character
Difficulty: EasyA
Given a string s consisting of lowercase English Letters. Return the first non-repeating character in s.
If there is no non-repeating character, return '$'.
Note: When you return '$' driver code will output -1.

Examples:
Input: s = "geeksforgeeks"
Output: 'f'
Explanation: In the given string, 'f' is the first character in the string which does not repeat.
*/

class Solution {
    static char nonRepeatingChar(String s) {
        // code here
        Map<Character,Integer> freqmap = new HashMap<>();
        
        for(char c: s.toCharArray()){
            freqmap.put(c,freqmap.getOrDefault(c,0)+1);
        }
        
        for(char c: s.toCharArray()){
            if(freqmap.get(c)==1){
                return c;
            }
        }
        return '$';
    }
}


