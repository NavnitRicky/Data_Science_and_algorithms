class Solution {
    public int singleNonDuplicate(int[] nums) {
        // int ans=0;
        // for(int i=0;i<nums.length;i++){
        //     ans=ans^nums[i];
        // }
        // return ans;

        int l=0;
        int h=nums.length-1;
        while(l<h){
            int mid=l+(h-l)/2;
            if(mid%2==1){
                mid--;
            }
            if(nums[mid]==nums[mid+1]){
                l=mid+2;
            }
            else{
                h=mid;
            }
        }
        return nums[h];
    }
}