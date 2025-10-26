class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return countNice(nums, k) - countNice(nums, k - 1);
    }

    private int countNice(int[] nums, int k) {
        int i = 0, j = 0;
        int count = 0;

        while (j < nums.length) {
            // If nums[j] is odd, reduce k
            if (nums[j] % 2 == 1) {
                k--;
            }

            // If we have more than k odd numbers, shrink the window
            while (k < 0) {
                if (nums[i] % 2 == 1) {
                    k++;
                }
                i++;
            }

            // Count all valid subarrays ending at j
            count += j - i + 1;
            j++;
        }

        return count;
    }
}
