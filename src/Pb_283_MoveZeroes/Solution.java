package Pb_283_MoveZeroes;

class Solution {
    public void moveZeroes(int[] nums) {
        int nextNonZero = 0;
        while (nextNonZero < nums.length && nums[nextNonZero] == 0){
            nextNonZero++;
        }
        for(int i = 0; i < nums.length; i++){
            if (nums[i] == 0 && nextNonZero < nums.length && nextNonZero > i){
                nums[i] = nums[nextNonZero];
                nums[nextNonZero] = 0;
            }
            nextNonZero++;
            while (nextNonZero < nums.length && nums[nextNonZero] == 0){

                nextNonZero++;
            }

        }

    }
}
