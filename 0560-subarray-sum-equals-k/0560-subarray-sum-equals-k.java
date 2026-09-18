class Solution {
    public int subarraySum(int[] nums, int k) {
        // int n =nums.length;
        // int c=0;
        // int sum=0;
        // for(int i=0;i<n;i++){
        //      sum=0;
        //      for(int j=i;j<n;j++){
        //         sum+=nums[j];
        //         if(sum==k) c++;
        //      }
        // }
        // return c;

       int c=0;
       int n=nums.length;
       int sum=0;
       HashMap<Integer,Integer> map=new HashMap<>();
       map.put(0,1);
       for(int i=0;i<n;i++){
        sum+=nums[i];
        if(map.containsKey(sum-k)){
            c+=map.get(sum-k);
        }
        map.put(sum,map.getOrDefault(sum,0)+1);
       }
       return c;
    }}


