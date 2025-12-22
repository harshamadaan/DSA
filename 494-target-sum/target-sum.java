class Solution {

    public int findTargetSumWays(int[] nums, int target) {

        int totalSum = 0;
        for (int x : nums) totalSum += x;

        // Invalid cases
        if (totalSum < Math.abs(target)) return 0;
        if ((totalSum + target) % 2 != 0) return 0;

        int sum = (totalSum + target) / 2;
        int n = nums.length;

        int[][] t = new int[n + 1][sum + 1];

        // Base case
        for (int i = 0; i <= n; i++) {
            t[i][0] = 1;
        }

        // DP table
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {

                if (nums[i - 1] <= j) {
                    t[i][j] = t[i - 1][j - nums[i - 1]] + t[i - 1][j];
                } else {
                    t[i][j] = t[i - 1][j];
                }
            }
        }

        return t[n][sum];
    }
}
