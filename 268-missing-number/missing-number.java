class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;//like ek missing h to to total element to always jada hoga agr uska sum nikalna h to

        int sum=n*(n+1)/2;
        int numsSum=0;
        for(int ele:nums){
            numsSum += ele;
        }
        return sum-numsSum;
        
    }
}