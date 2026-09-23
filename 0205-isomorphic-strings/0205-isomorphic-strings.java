class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1=new HashMap<>();
                HashMap<Character,Character> map2=new HashMap<>();

        if(s.length()!=t.length()){ //if length is not equal to the ohter string which is given
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);    //e
            char ch1=t.charAt(i);   //t

            if(map1.containsKey(ch)){
                if(map1.get(ch)!=ch1){
                    return false;
                }
            }
            else{
                map1.put(ch,ch1);
            }

            if(map2.containsKey(ch1)){

                if(map2.get(ch1)!=ch){
                    return false;
                }
            }
            else{
                map2.put(ch1,ch);
            }

        }
        return true;

        
    }
}