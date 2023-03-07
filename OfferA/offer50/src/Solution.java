public class Solution {
    public static char firstUniqChar(String s) {
        char res = ' ';
        int[] times = new int[26];

        for (int i = 0; i < s.length(); i++) {
            times[(int)s.charAt(i) - 97]++;
        }

        for (int i = 0; i < s.length(); i++) {
            if (times[(int)s.charAt(i) - 97] == 1) {
                res = s.charAt(i);
                return res;
            }
        }

        return res;
    }


    public static void main(String[] args) {
        String test = "";
        System.out.println(firstUniqChar(test));
    }
}