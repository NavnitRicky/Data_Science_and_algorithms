class Solution {

   public static int helper(int n[],int t, int l,int h){
        if(l>h)return -1;
        int mid=(l+h)/2;
        if(n[mid]==t) return mid;
        else if(n[mid]>t) return helper(n,t,l,mid-1);
        else return helper(n,t,mid+1,h);
    }
    public int search(int[] nums, int target) {
        int n=nums.length;
        return helper(nums,target,0,n-1);
    //     int l=0;
    //     int h=nums.length-1;
    //     while(l<=h){
    //         int mid =(l+h)/2;
    //         if(nums[mid]==target)
    //         return mid;
    //         else if (nums[mid]>target){
    //             h=mid-1;
    //         }
    //         else l=mid+1;
    //     }
    //     return -1;

        
    // }
}
}