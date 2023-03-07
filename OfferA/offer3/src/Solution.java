class Solution {
    public int findRepeatNumber(int[] nums) {
        boolean[] checker = new boolean[nums.length];

        for (int num : nums) {
            if (!checker[num]) {
                checker[num] = true;
            } else {
                return num;
            }
        }
        return 1;
    }

    public static void main(String[] args) {

    }

}