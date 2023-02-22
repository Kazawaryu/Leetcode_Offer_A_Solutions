class Solution {
    public static int minArray(int[] numbers) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int half = (right - left) / 2 + left;
            if (numbers[left] > numbers[half]) {
                right = half;
            } else {
                left = half+1;
            }
        }
        while (left != 0) {
            if (numbers[left - 1] > numbers[left])
                break;
            else left--;
        }
        return numbers[left];
    }

    public static void main(String[] args) {
        int[] test = {9,9,9,9,9,1,2,3};
        System.out.println(minArray(test));
    }
}