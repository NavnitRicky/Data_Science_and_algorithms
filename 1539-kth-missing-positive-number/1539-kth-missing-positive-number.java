class Solution {
    public int findKthPositive(int[] arr, int k) {
        int temp[]=new int[2001];
        for(int i=0;i<arr.length;i++){
            temp[arr[i]]++;
        }
        for(int i=1;i<2001;i++){
            if(temp[i]==0){
                k--;
            }
            if(k==0){
                return i;
            }
        }
  return 1;
     
        
    }
}