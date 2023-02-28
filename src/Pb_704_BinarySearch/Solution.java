package Pb_704_BinarySearch;

public class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int mid;
        while (low <= high) {
            mid = (low + high) / 2;
            if (target == nums[mid]){
                System.out.println("Target se afla la indexul: "+ mid);
                return mid;
            }
            else if (target < nums[mid]){
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }

        }
        if (low > high){
            System.out.println("Target nu a fost gasit in vector.");
            return -1;
        }
        return 0;
    }
}
