class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int f=map.get(nums[i]);
                map.put(nums[i],f+1);
            }
            else map.put(nums[i],1);

        }
        for(int ele:map.keySet()){
            int f=map.get(ele);
            if(f==1) return ele;
        }
        return 1;
    }
}