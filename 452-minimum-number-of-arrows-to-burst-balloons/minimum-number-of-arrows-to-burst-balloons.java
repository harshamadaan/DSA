class Solution {
    public int findMinArrowShots(int[][] points) {
        int n=points.length;
        Arrays.sort(points,(a,b) ->(Integer.compare(a[0],b[0])));

        int arrows=1;
        int currStart=points[0][0];
        int currEnd=points[0][1];

        for(int i=1;i<n;i++){
            if(points[i][0]<=currEnd){
                currEnd=Math.min(currEnd,points[i][1]);
            }else{
                currEnd=points[i][1];
                arrows++;
            }
        }
        return arrows;
        
    }
}