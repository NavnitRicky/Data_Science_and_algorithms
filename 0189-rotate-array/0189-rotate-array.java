class Solution {
        public void reverseind(int[] nums,int l,int h){
             while(l<h){
            int t=nums[l];
            nums[l]=nums[h];
            nums[h]=t;
            l++;
            h--;
             }

       
}
    public void rotate(int[] nums, int k) {
         k=k%nums.length;
        reverseind(nums,0,nums.length-1);
                reverseind(nums,0,k-1);
                        reverseind(nums,k,nums.length-1);


        
        
    }
}