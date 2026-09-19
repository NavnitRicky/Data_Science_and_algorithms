class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                int f=map.get(nums[i]);
                map.put(nums[i],f+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        ArrayList<Integer> al=new ArrayList<>();
        for(int ele:map.keySet()){
            int f=map.get(ele);
            if(f>nums.length/3){
                al.add(ele);
            }
        }
        return al;
    }
}