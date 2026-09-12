class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0;
        int c=0;
        for(int j=0;j<n;j++){
            if(nums[j]!=0){
                nums[i++]=nums[j];
            }
            else{
                c++;
            }
        }
        for(int j=0;j<c;j++){
            nums[i++]=0;
        }

    }
}