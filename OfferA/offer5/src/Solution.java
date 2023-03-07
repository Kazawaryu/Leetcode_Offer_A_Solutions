class Solution {
    public static String replaceSpace(String s) {
        String[] sl = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sl.length - 1 ; i++) {
            sb.append(sl[i]);
            sb.append("%20");
        }

        return s.replace(" ", "%20");

//
//        sb.append(sl[sl.length - 1]);
    }

    public static void main(String[] args) {
        System.out.println(replaceSpace(""));
    }
}