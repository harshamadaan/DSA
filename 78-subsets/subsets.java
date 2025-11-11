// 

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        // Convert the array into a list for easier manipulation (like ip)
        List<Integer> input = new ArrayList<>();
        for (int n : nums) input.add(n);

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        solve(input, output, result);
        return result;
    }

    void solve(List<Integer> ip, List<Integer> op, List<List<Integer>> res) {
        // Base case — when input becomes empty
        if (ip.size() == 0) {
            res.add(new ArrayList<>(op));
            return;
        }

        // Create copies for the two recursive paths
        List<Integer> op1 = new ArrayList<>(op); // exclude case
        List<Integer> op2 = new ArrayList<>(op); // include case

        // Include first element in op2
        op2.add(ip.get(0));

        // Remove first element from input
        List<Integer> newIp = new ArrayList<>(ip);
        newIp.remove(0);

        // Recursive calls
        solve(newIp, op1, res); // exclude
        solve(newIp, op2, res); // include
    }
}
