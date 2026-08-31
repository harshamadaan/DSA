class Number implements Comparable<Number>{
    int element;
    int freq;
    Number(int element,int freq){
        this.element=element;
        this.freq=freq;
    }

    //overide implement method
    public int compareTo(Number that){
        // max heap
        return that.freq-this.freq; // dec sort
    }
}

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n=nums.length;

        PriorityQueue<Number> pq=new  PriorityQueue<>();

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        //insert ele in pq
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            Number number=new Number(entry.getKey(),entry.getValue());
            pq.offer(number);
        }
        int[] res=new int[k];
        int idx=0;
        while(idx < k){
            Number number=pq.poll(); //ya ek obj h
            res[idx]=number.element;
            idx++;

        }
        return res;



        
        
    }
}