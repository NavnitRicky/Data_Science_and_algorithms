class Solution {
    public String largestOddNumber(String num) {
     StringBuilder sb=new StringBuilder(num);
     int h=sb.length()-1;
     while(h>=0){
        int digit=sb.charAt(h)-0;
        if(digit%2==0){
            sb.deleteCharAt(h);
        }
        else{
            break;
        }
        h--;
     }   
     return sb.toString();    
        
    }
}