class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        }
    int a=nums.length-1;
  for(int i=0;i<nums.length-1;i++){
    if(nums[i]>nums[i+1]){
        a=i;
        return a;
    }
  }
  return a;
        
    }
}