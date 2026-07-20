class Solution {
    public int findGCD(int[] nums) {
        
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;

        for(int x:nums){
            min=Math.min(min,x);
            max=Math.max(max,x);


        }

        return gcd(min,max);

    }

    public static int gcd(int a,int b){
        if(b==0) return a;

        return gcd(b,a%b);
    }
}