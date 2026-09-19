class Solution {
    public boolean search(int[] nums, int t) {
              int a=-1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                a=i;
                break;
            
            }
        }
        // if(a==-1){
        //     a=nums.length-1;
        // }
        int l=0;
        int h=a;
        int ans=-1;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[mid]==t){
                return true;
            
            }
            else if(nums[mid]>t){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
         l=a+1;
         h=nums.length-1;
        while(l<=h){
            int mid=l+(h-l)/2;
                  if(nums[mid]==t){
                return true;
            
            }
            else if(nums[mid]>t){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
            
        }
        return false;
        
    }
}