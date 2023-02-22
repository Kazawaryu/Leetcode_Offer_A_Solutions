class Solution {
    public int search(int[] nums, int target) {
        int cnts = 0;
        for (int num : nums) {
            if (num == target)
                cnts++;
        }
        return cnts;
    }


    public int missingNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i)
                return i;
        }
        return nums.length;
    }
}