class Solution {
    public int maxProfit(int[] arr) {
        // int maxp=0;
        // int n=arr.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i]<arr[j]){
        //             int curr=arr[j]-arr[i];
        //             if(maxp<curr){
        //                 maxp=curr;
        //             }
        //         }

        //     }
        // }
        // return maxp;
        // int min=arr[0];
        // int max=0;
        //  for(int i=1;i<arr.length;i++){
        //     if(min>arr[i]){
        //         min=arr[i];
        //     }
                
        //         int cur=arr[i]-min;


        //         if(max<cur){
        //             max=cur;
        //         }

        // }
        // return max;
   


   int min=arr[0];
   int max=0;


    for(int i=1;i<arr.length;i++){
        if(min>arr[i]){
            min=arr[i];  
        }
        int c=arr[i]-min;
        if(max<c){
            max=c;
        }

    }
    return max;
    }}



