class Solution {
    public int majorityElement(int[] nums) {
        // HashMap<Integer,Integer> map=new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     if(map.containsKey(nums[i])){
        //         int freq=map.get(nums[i]);
        //         map.put(nums[i],freq+1);
        //     }
        //     else map.put(nums[i],1);
        // }
        // int n=nums.length;
        // for(int ele:map.keySet()){
        //     int freq=map.get(ele);
        //     if(freq>n/2) return ele;
        // }
        // return 1;
             int f=0;
             int ans=0;
             for(int i:nums){
                if(f==0){
                    ans=i;
                }
                if(i==ans){
                    f++;
                }
                else{
                    f--;
                }
             }
    return ans;
    }
}