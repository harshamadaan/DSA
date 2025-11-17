class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int idx=0;
        int i=0;
        while(i<n){
            char curr_char=chars[i];
            int count=0;
            //find duplicates
            while(i<n && chars[i]==curr_char){
                count++;
                i++;
            }
            //differ hua
            chars[idx] = curr_char;
            idx = idx + 1;  //chars[idx++] = curr_char;

            // agr 1 sa jada hua to likhna h count and 2 digit hua like 10 to count ko string ma convert kraga
            if(count>1){
                String str=String.valueOf(count);//convrt count to string
                char[] arr=str.toCharArray();
                for(char c: arr){
                    chars[idx]=c;
                    idx+=1;
                }



            }
        }
        return idx;

        
    }
}