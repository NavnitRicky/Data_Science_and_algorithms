class Solution {
    public List<List<Integer>> generate(int num) {
        List<List<Integer>> ans=new ArrayList<>();
        
          int a=1;
        for(int i=0;i<num;i++){
            List<Integer> l=new ArrayList<>();
            a=1;
            for(int j=0;j<=i;j++){
               l.add(a);
                a=a*(i-j)/(j+1);
                
                
            }
            ans.add(l);
         }
         return ans;
    }
}