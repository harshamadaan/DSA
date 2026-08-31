
class Sent implements Comparable<Sent>{
    String ele;
    int freq;

    Sent(String ele,int freq){
        this.ele=ele;
        this.freq=freq;
    }

    public int compareTo(Sent that){
        if(this.freq!=that.freq){
            return that.freq-this.freq;
        }
        return this.ele.compareTo(that.ele);
        
    }
}


class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        int n=words.length;
        PriorityQueue<Sent> pq=new PriorityQueue<>();
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(words[i],map.getOrDefault(words[i],0)+1);

        }
        for(Map.Entry<String,Integer> entry:map.entrySet()){
            Sent sent=new Sent(entry.getKey(),entry.getValue());
            pq.offer(sent);
        }
        List<String> res=new ArrayList<>();
        int idx=0;
        while(idx<k){
            Sent sent=pq.poll();
            res.add(sent.ele);
            idx++;
        }
        return res;
        
    }
}