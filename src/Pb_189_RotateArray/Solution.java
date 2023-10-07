package Pb_189_RotateArray;

class Solution {
    public void rotate(int[] input, int k) {
        k %= input.length;
        reverse(input, 0, input.length - 1);
        reverse(input, 0, k - 1);
        reverse(input, k, input.length - 1);
    }

    private void reverse(int[] input, int start, int end) {
        while (start < end) {
            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
    }
}