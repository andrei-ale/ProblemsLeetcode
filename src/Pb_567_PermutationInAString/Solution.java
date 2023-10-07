package Pb_567_PermutationInAString;

import java.util.*;

class Solution {
    public boolean sameMaps (HashMap <Character, Integer> h1 , HashMap <Character, Integer> h2){
        for (char key = 'a'; key <= 'z'; ++key) {
            if (h2.get(key) == null && h1.get(key) != null) {
                return false;
            }
            if (h1.get(key) == null && h2.get(key) != null) {
                return false;
            }
            if (h2.get(key) == null && h1.get(key) == null) {
                continue;
            }

            if (h2.get(key).compareTo(h1.get(key)) != 0)  {
                return false;
            }
        }

        return true;
    }


    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()){
            return false;
        }

        HashMap <Character, Integer> string1Hash = new HashMap <>();
        HashMap <Character, Integer> string2Hash = new HashMap <>();
        for (int i = 0; i < s1.length(); i++){
            if (string1Hash.get(s1.charAt(i)) != null){
                string1Hash.put(s1.charAt(i), string1Hash.get(s1.charAt(i)) + 1);
            }
            else{
                string1Hash.put(s1.charAt(i), 1);
            }
            if (string2Hash.get(s2.charAt(i)) != null){
                string2Hash.put(s2.charAt(i), string2Hash.get(s2.charAt(i)) + 1);
            }
            else {
                string2Hash.put(s2.charAt(i), 1);
            }
        }
        int start = 0;
        int end = s1.length() - 1;
        while (end < s2.length() && !sameMaps(string1Hash, string2Hash)){
            string2Hash.put(s2.charAt(start), string2Hash.get(s2.charAt(start)) - 1);
            if (string2Hash.get(s2.charAt(start)) == 0){
                string2Hash.put(s2.charAt(start), null);
            }
            start++;
            end++;
            if (end < s2.length()){
                if (string2Hash.get(s2.charAt(end)) != null) {
                    string2Hash.put(s2.charAt(end), string2Hash.get(s2.charAt(end)) + 1);
                }
                else {
                    string2Hash.put(s2.charAt(end), 1);
                }
            }
        }
        if (end > s2.length()){
            return false;
        }
        else if (end == s2.length() && sameMaps(string1Hash, string2Hash) == false){
            return false;
        }
        else {
            return true;
        }
    }
}


