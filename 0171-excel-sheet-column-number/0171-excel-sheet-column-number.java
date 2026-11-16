class Solution {
    public int titleToNumber(String c) {
        int ans = 0;

        for (int i = 0; i < c.length(); i++) {
            char a = c.charAt(i);
            ans = ans * 26 + (a - 64);
        }

        return ans;
    }
}