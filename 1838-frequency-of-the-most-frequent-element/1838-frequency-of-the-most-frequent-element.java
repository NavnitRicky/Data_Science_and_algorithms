// class Solution {
//     public int maxFrequency(int[] arr, int k) {
//         //brute force
//         Arrays.sort(arr);
//         int max=1;
//         for(int i=0;i<arr.length;i++){
//             int c=1;
//             int r=k;
//             for(int j=i-1;j>=0;j--){
//                 int a=arr[i]-arr[j];
//                 if(a<=r){
//                     c++;
//                     r=r-a;
//                 }
//                 else{
//                     break;
//                 }
//             }
//             max=Math.max(max,c); 
//         }
//         return max;
//     }
// }

class Solution {
    public int maxFrequency(int[] arr, int k) {

        Arrays.sort(arr);

        int left = 0;
        long sum = 0;
        int max = 1;

        for (int right = 0; right < arr.length; right++) {

            sum += arr[right];

            // Cost to make every element equal to arr[right]
            long cost = (long) arr[right] * (right - left + 1) - sum;

            // If cost is greater than k, shrink window
            while (cost > k) {
                sum -= arr[left];
                left++;

                cost = (long) arr[right] * (right - left + 1) - sum;
            }

            max = Math.max(max, right - left + 1);
        }

        return max;
    }
}