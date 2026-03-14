class Solution {
    public int[] sortedSquares(int[] nums) {

        //brute force
//         int n=nums.length;
//         int[] ans=new int[n];
//         for(int i=0;i<n;i++){
//             ans[i]=nums[i]*nums[i];
            

//         }
//         Arrays.sort(ans);
//         return ans;
        
//     }
// }

// real

int n=nums.length;
int[] result=new int[n];
int i=0,j=n-1;
int k=n-1;
while(k>=0){
    int a=nums[i]*nums[i];
    int b=nums[j]*nums[j];
    if(a>b){
        result[k]=a;
        i++;
    }else{
        result[k]=b;
        j--;
    }
    k--;
}
return result;
    }
}
