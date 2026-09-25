class Solution {
    public int maxDepth(String s) {
        
    int c=0;
    int m=0;
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='('){
            c++;
        }
        if(ch==')'){
            c--;
        }
        if(c>m){
            m=c;
        }
    }
    return m;
    }
}