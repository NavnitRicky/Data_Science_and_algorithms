class Solution{
    int max=0;int st=0;int end=0;
    public boolean isPalindrome(String s,int i,int h){
        while(i<h){
            if(s.charAt(i)!=s.charAt(h)){
                return false;
            }
            i++;
            h--;
        }
        return true;
    }
    public String longestPalindrome(String s){
        int n=s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s,i,j)){
                    int c=j-i+1;
                    if(c>max){
                        max=c;
                        st=i;
                        end=j;
                    }
                }


            }
        }
        return s.substring(st,end+1);


    } 
}