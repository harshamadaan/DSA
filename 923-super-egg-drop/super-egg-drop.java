class Solution {

    int[][] dp = new int[101][10001];

    public int superEggDrop(int k, int n) {

        if (n == 0 || n == 1) return n;
        if (k == 1) return n;

        if (dp[k][n] != 0) return dp[k][n];

        int low = 1, high = n;
        int ans = Integer.MAX_VALUE;

        while (low <= high) {

            int mid = (low + high) / 2;

            int broken = superEggDrop(k - 1, mid - 1);
            int notBroken = superEggDrop(k, n - mid);

            int temp = 1 + Math.max(broken, notBroken);
            ans = Math.min(ans, temp);

            // move binary search
            if (broken < notBroken) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return dp[k][n] = ans;
    }
}
