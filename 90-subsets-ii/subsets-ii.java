// class Solution {
//     public List<List<Integer>> subsetsWithDup(int[] nums) {

//         List<List<Integer>> result = new ArrayList<>();

//         Arrays.sort(nums);

//         solve(nums, 0, new ArrayList<>(), result);

//         return result;
//     }

//     void solve(int[] nums, int start, List<Integer> output,
//                List<List<Integer>> result) {

//         result.add(new ArrayList<>(output));

//         for(int i = start; i < nums.length; i++) {

//             // duplicate skip
//             if(i > start && nums[i] == nums[i - 1]) {
//                 continue;
//             }

//             // include
//             output.add(nums[i]);

//             solve(nums, i + 1, output, result);

//             // backtrack
//             output.remove(output.size() - 1);
//         }
//     }
// }

// prefer
import java.util.*;

class Solution {

    public List<List<Integer>> subsetsWithDup(int[] nums) {

        List<Integer> input = new ArrayList<>();

        for(int n : nums) {
            input.add(n);
        }

        Collections.sort(input);

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> output = new ArrayList<>();

        solve(input, output, result);

        return result;
    }

    static void solve(List<Integer> ip, List<Integer> op,
                      List<List<Integer>> res) {

        // Base case
        if(ip.size() == 0) {

            if(!res.contains(op)) {
                res.add(new ArrayList<>(op));
            }

            return;
        }

        // EXCLUDE
        List<Integer> op1 = new ArrayList<>(op);

        // INCLUDE
        List<Integer> op2 = new ArrayList<>(op);
        op2.add(ip.get(0));

        // Remove first element
        List<Integer> newIp = new ArrayList<>(ip);
        newIp.remove(0);

        // Recursive calls
        solve(newIp, op1, res);   // exclude
        solve(newIp, op2, res);   // include
    }
}