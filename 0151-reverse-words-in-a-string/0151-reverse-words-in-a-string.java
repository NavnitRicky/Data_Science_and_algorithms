class Solution {
    public String reverseWords(String s) {
        String[] stt=s.trim().split("\\s+");
        
        int i=0;
        int h=stt.length-1;
        while(i<h){
            String temp=stt[i];
            stt[i]=stt[h];
            stt[h]=temp;
            i++;
            h--;
        }
        return s.join(" ",stt);
    }
}