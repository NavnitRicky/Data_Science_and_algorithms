class Solution {
    public String frequencySort(String s) {
        StringBuilder sb=new StringBuilder();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            if(map.containsKey(ch)){
                int f=map.get(ch);
                map.put(ch,f+1);
            }
            else{
                map.put(ch,1);
            }
        }
        while(!map.isEmpty()){
            char maxchar=0;
        int f=0;
        for(char ele:map.keySet()){
            if(map.get(ele)>f){
                f=map.get(ele);
                maxchar=ele;
            }
        }
        for(int i=0;i<f;i++){

            sb.append(maxchar);
            
        }
        map.remove(maxchar);
        }
        return sb.toString();
    }
}