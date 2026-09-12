class Solution {
    public int removeDuplicates(int[] nums) {
       ArrayList<Integer> t=new ArrayList<>();
       int i=0;
       int j=0;
       while(j<nums.length){
        if(nums[i]!=nums[j]){
            t.add(nums[i]);
            i=j;
        }
        else{
            j++;
        }
       }
       int k=0;
       t.add(nums[i]);
       for(int e:t){
        nums[k++]=e;
       }
       return k;
    }
}