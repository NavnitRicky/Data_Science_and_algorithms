class Solution {
    public int maxSubArray(int[] nums) {
        // int msum=nums[0];
        // for(int i=0;i<nums.length;i++){
        //     int csum=0;
        //     for(int j=i;j<nums.length;j++){
        //             csum+=nums[j];
        //         if(msum<csum){
        //             msum=csum;
        //         }
        //     }
        // }
        // return msum;
       















       int msum=Integer.MIN_VALUE;
       int cur=0;
       for(int i=0;i<nums.length;i++){
        cur+=nums[i];
        if(msum<cur){
            msum=cur;
        }
        if(cur<0){
            cur=0;
        }
       }
       return msum;
    }
}