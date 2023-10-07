package Pb_557_ReverseWordsInAStringIII;

class Solution {
    public String reverseWords(String s) {
        String[] splitStrings = s.split(" ");
        String result = "";
        for (String word : splitStrings){
            char[] splitWord = word.toCharArray();
            char temp;
            int start = 0;
            int end = splitWord.length - 1;
            while (start < end) {
                temp = splitWord[start];
                splitWord[start] = splitWord[end];
                splitWord[end] = temp;
                start++;
                end--;
            }
            result += new String(splitWord) + " ";
        }
        return result.trim();
    }
}

