class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> al=new ArrayList<>();
        al.add(new ArrayList<>());
        for(int ele:nums){
            int size=al.size();
            for(int i=0;i<size;i++){
                List<Integer> l=new ArrayList<>(al.get(i));
                l.add(ele);
                al.add(l);
            }
        }
        
        
    
    return al;
    }
}