class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()) return false;
        HashMap<Character,Integer> sMap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ele=s.charAt(i);
            if(sMap.containsKey(ele)){
                sMap.put(ele,sMap.get(ele)+1);
            }
            else{
                sMap.put(ele,1);
            }
        }
        
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(!sMap.containsKey(ch)) return false;
            sMap.put(ch,sMap.get(ch)-1);
            if(sMap.get(ch)<0) return false;
        }
        return true;
    }
}
