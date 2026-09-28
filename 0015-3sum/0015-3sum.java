class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);   //ssort the nums arrray in ascending order.
        for(int i=0;i<nums.length-2;i++){

            if(i>0&&nums[i]==nums[i-1])
            continue;
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    ans.add(Arrays.asList(
                    nums[i],
                    nums[left],
                    nums[right]));
                
                while(left<right &&nums[left]==nums[left+1]){
                    left++;
                }
                while(left<right && nums[right]==nums[right-1]){
                    right--;
                }
                left++;
                right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return ans;

//         for(int i=0;i<nums.length;i++){
//             for(int j=i+1;j<nums.length;j++){
//                 for(int k=j+1;k<nums.length;k++){

//                     if(nums[i]+nums[j]+nums[k]==0){
//                      List<Integer> al=new ArrayList<>();

//                         al.add(nums[i]);
//                         al.add(nums[j]);
//                         al.add(nums[k]);
//                         Collections.sort(al);

//                     if(!ans.contains(al))
//                     ans.add(al);
//                 }
//             }
//         }
//         }
        
// return ans;


        
        
    }
}