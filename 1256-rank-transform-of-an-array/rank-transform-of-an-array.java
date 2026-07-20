class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n=arr.length;

        int[] sorted=arr.clone(); //copy and sort
        Arrays.sort(sorted);

        HashMap<Integer,Integer> map=new HashMap<>();
        int rank=1;
        for(int num:sorted){
            if(!map.containsKey(num)){
                map.put(num,rank++);  //java func postfix
            }
        }

            int[] res=new int[n];
            for(int i=0;i<n;i++){
              res[i]=map.get(arr[i]);  // map sa fetch kro or arr ke according daal do
            }
           
            return res;
        
       
        
    }
}