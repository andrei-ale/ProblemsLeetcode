package Pb_3_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0){
            return 0;
        }
        int maxLength = 1;
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        for (int i = 0; i < s.length(); i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(i));
            if (maxLength < i-left+1){
                maxLength = i-left+1;
            }
        }
        return maxLength;
    }
}
