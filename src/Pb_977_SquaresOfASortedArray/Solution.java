package Pb_977_SquaresOfASortedArray;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] result = new int[nums.length];
        int low = 0;
        int high = nums.length - 1;
        int index = nums.length - 1;

        while (low <= high){
            if (Math.abs(nums[low]) >= Math.abs(nums[high])){
                result[index] = nums[low]*nums[low];
                index--;
                low++;
            }else {
                result[index] = nums[high]*nums[high];
                index--;
                high--;
            }
        }
        return result;
    }
}
