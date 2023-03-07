public class Solution {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int n = matrix.length;
        if (n == 0) return false;
        int m = matrix[0].length;
        if (m == 0) return false;


        for (int i = 0; i < m; i++) {
            if (matrix[0][i] <= target && matrix[n - 1][i] >= target) {
                // you could also use binary search to get the specific place, it is O(nlogm)
                for (int[] ints : matrix) {
                    if (ints[i] == target) {
                        return true;
                    }else if (ints[i] > target) {
                        break;
                    }
                }
            }
        }

        for (int[] ints : matrix) {
            if (ints[0] <= target && ints[m - 1] >= target) {
                for (int j = 0; j < m; j++) {
                    if (ints[j] == target) {
                        return true;
                    }else if (ints[j] > target){
                        break;
                    }
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}