class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        solve(nums, 0, new ArrayList<>(), result);

        return result;
    }

    void solve(int[] nums, int start, List<Integer> output,
               List<List<Integer>> result) {

        result.add(new ArrayList<>(output));

        for(int i = start; i < nums.length; i++) {

            // duplicate skip
            if(i > start && nums[i] == nums[i - 1]) {
                continue;
            }

            // include
            output.add(nums[i]);

            solve(nums, i + 1, output, result);

            // backtrack
            output.remove(output.size() - 1);
        }
    }
}