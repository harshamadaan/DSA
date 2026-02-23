class Solution {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length / 2;

        // count frequency
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // find majority element
        for (int num : nums) {
            if (map.get(num) > n) {
                return num;
            }
        }

        return -1;
    }
}